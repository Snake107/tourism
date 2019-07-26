package com.ssm.controller;

import com.ssm.api.AlipayUtil;
import com.ssm.dao.mapping.ShoppingCartMapper;
import com.ssm.dto.order.OrderDetailDto;
import com.ssm.dto.order.OrderDto;
import com.ssm.dto.order.OrderPay;
import com.ssm.dto.shopcart.ShopCartDto;
import com.ssm.dto.vip.VipDto;
import com.ssm.pojo.ShoppingCart;
import com.ssm.pojo.User;
import com.ssm.pojo.Vip;
import com.ssm.pojo.VipMeal;
import com.ssm.service.OrderService;
import com.ssm.service.ShopCartService;
import com.ssm.service.VipService;
import com.ssm.vo.PayVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 8:58
 */
@RestController
@RequestMapping(value = "/buycart")
public class BuycarController {

    private static Integer userId;
    private static PayVo payVo =null;

    private static OrderDto orderDto1;

    private static VipMeal vipMeal;
    //订单详情
    public static List<OrderDetailDto> orderDetailDtos;

    @Resource
    OrderPay orderPay;

    @Resource
    ShopCartService shopCartService;

    @Resource
    OrderService orderService;

    @Resource
    VipService vipService;

    @Autowired
    ShoppingCartMapper shoppingCartMapper;


    @RequestMapping(value = "/getShopCartById",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getShopCartById(@RequestBody User user,HttpServletRequest request){
        ShopCartDto shopCartById = shopCartService.getShopCartById(user.getId());
        User user1 = (User) request.getSession().getAttribute("user");
        //System.out.println("============"+user1);
        userId = user1.getId();
        //System.out.println("0000000000000"+shopCartById);
        //设置订单详情
        if (shopCartById != null){
            List<ShoppingCart> shoppingCartList = shopCartById.getShoppingCartList();
            List<OrderDetailDto> detailDtos = new ArrayList<>();
            for (ShoppingCart shoppingCart : shoppingCartList) {
                OrderDetailDto orderDetailDto = new OrderDetailDto();
                orderDetailDto.setCommodityId(shoppingCart.getCommodityId());
                orderDetailDto.setBigType(shoppingCart.getBigType());
                orderDetailDto.setOriginalCost(shoppingCart.getOriginalCost());
                orderDetailDto.setCommodityNum(shoppingCart.getCommodityNum());
                detailDtos.add(orderDetailDto);
                // System.out.println("=========="+orderDetailDto);
            }
            ShopCartDto totalMoney = shopCartService.getTotalMoney(user1.getId());
            double totalOriginalMoney = totalMoney.getTotalOriginalMoney();
            shopCartById.setTotalOriginalMoney(totalOriginalMoney);
            orderDetailDtos=detailDtos;
            return shopCartById;
        }


        System.out.println("++++++++++"+ orderDetailDtos);
        //----------------------------------------------------------


        return null;
    }

    @RequestMapping(value = "/addShopCart",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object addShopCart(@RequestBody ShoppingCart shoppingCart,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if (user==null){
            return "index-7";
        }
        userId =user.getId();



        shoppingCart.setUserId(user.getId());
        //判断是否会员
        double v = shopCartService.ifMember(user.getId());
        shoppingCart.setDiscount(v);
        shoppingCart.setOriginalCost(v*shoppingCart.getOriginalCost());

        //List<ShoppingCart> allShopCartByUserId = shopCartService.getAllShopCartByUserId(user.getId());

        Example example = new Example(ShoppingCart.class);
        example.and().andEqualTo("userId",1);
        List<ShoppingCart> allShopCartByUserId = shoppingCartMapper.selectByExample(example);
        allShopCartByUserId.forEach(content -> System.out.println(content));

        if (allShopCartByUserId.size()>=1){
            for (ShoppingCart cart : allShopCartByUserId) {
                if (cart.getCommodityId().equals(shoppingCart.getCommodityId())&&cart.getBigType().equals(shoppingCart.getBigType())){
                    cart.setCommodityNum( cart.getCommodityNum()+shoppingCart.getCommodityNum());

                    return shopCartService.addShopCartByUpdate(cart);
                }
            }
        }


        return shopCartService.addShopCart(shoppingCart);
    }

    @RequestMapping(value = "/delShopCartByID",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object delShopCartByID(@RequestBody ShoppingCart shoppingCart){

        return shopCartService.delShopCartByID(shoppingCart.getId());
    }

    @RequestMapping(value = "/updateShopCartNum",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object updateShopCartNum(@RequestBody ShoppingCart shoppingCart){
        return  shopCartService.updateShopCartNum(shoppingCart);
    }

    @RequestMapping(value = "/toPay",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object toPay(@RequestBody PayVo payVo, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        payVo.setUserid(user.getId());
        this.payVo = payVo;

        return this.payVo;
    }

    @RequestMapping(value = "/getPay",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getPay(){
        System.out.println(payVo.getTotalOriginalMoney());
        return payVo;
    }

    //获取购物车信息
    @RequestMapping(value = "/getOrder",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getOrder( HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        String str = new String();



        if (payVo!=null){
            List<ShoppingCart> shoppingCartList = payVo.getShoppingCartList();

            for (ShoppingCart cart : shoppingCartList) {
                if (cart.getBigType().equals(1)){
                    str += "景点"+cart.getCommodityName()+"价格"+cart.getOriginalCost()+"数量"+cart.getCommodityNum();
                }else if(cart.getBigType().equals(2)){
                    str += "酒店"+cart.getCommodityName()+"价格"+cart.getOriginalCost()+"数量"+cart.getCommodityNum();
                }
                str += "餐厅"+cart.getCommodityName()+"价格"+cart.getOriginalCost()+"数量"+cart.getCommodityNum();
            }

            OrderDto dtoOrder = new OrderDto();
            dtoOrder.setUserId(user.getId());
            dtoOrder.setOrderName("旅游订单");
            dtoOrder.setTotalMoney(payVo.getTotalOriginalMoney());
            dtoOrder.setDescription(str);
            return dtoOrder;
        }

        return null;


    }

    //支付
    @RequestMapping(value = "pay",produces = "application/json;charset=utf-8")
    public void Pay(@RequestParam String orderNo, String totalMoney, String orderName, String orderDetail, HttpServletRequest request, HttpServletResponse response){
        orderPay.setOrderDetail(orderDetail);
        orderPay.setOrderName(orderName);
        orderPay.setOrderNo(orderNo);
        orderPay.setTotalMoney(totalMoney);
        //System.out.println("controller  !!!"+orderName);
        String s = AlipayUtil.tradePagePay(orderPay, request);

        response.setContentType("text/html;charset=utf-8");
        try {

            response.getWriter().write(s);//直接将完整的表单html输出到页面
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                response.getWriter().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //支付完成返回首页
    @RequestMapping(value = "returnUrl",produces = "application/json;charset=utf-8")
    public void returnUrl(HttpServletRequest request,HttpServletResponse response){
        AlipayUtil.setReturn_url(request);
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print("<script >alert('支付成功');location='../index.html'</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //生成订单
    @RequestMapping(value = "notifyUrl")
    public Object notifyUrl(HttpServletRequest request, HttpServletResponse response){
        OrderDto dtoOrder = AlipayUtil.setNotify_url(request, response);

        dtoOrder.setUserId(userId);
        //System.out.println("00000000000"+userId);

        Integer orderId = orderService.addOrder(dtoOrder);

        //??????????????????????????
        if ("会员订单".equals(dtoOrder.getOrderName())){

            VipDto vipDto = new VipDto();
            vipDto.setUserId(userId);
            vipDto.setVipMeal(dtoOrder.getId());
            String format = "yyyy-MM-dd HH:mm:ss";
            //设置日期格式
            SimpleDateFormat df = new SimpleDateFormat(format);
            // new Date()为获取当前系统时间
            Date date = new Date();
            String starttime = df.format(date);
            //月数++
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, Integer.parseInt(vipMeal.getVipTime()));
            date = c.getTime();
            String endTime = df.format(date);

            vipDto.setStartTime(starttime);
            vipDto.setEndTime(endTime);
            vipService.addVip(vipDto);
            return "index-7";
        }

        //设置订单详情里的订单ID
        if (orderDetailDtos!=null){
            shopCartService.delAllShopCartByUserId(userId);
            Iterator<OrderDetailDto> iterator = orderDetailDtos.iterator();
            while (iterator.hasNext()){
                OrderDetailDto next = iterator.next();
                next.setTradeId(orderId);
                System.out.println("000000000000000000000"+next);
            }
            if (orderId>0){
                boolean b = orderService.addOrderDetail( orderDetailDtos);
                if(b){
                    return "index-7";
                }else {
                    return "index-7";
                }

            }
        }

        System.out.println("@@@@@@@@@@@@@@@@"+orderId);
        return "404";
    }


    //会员支付
    @RequestMapping(value = "/vipPay",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object vipPay(@RequestParam("id") Integer vipMealId,HttpServletRequest request){
        User user1 = (User) request.getSession().getAttribute("user");
        //System.out.println("============"+user1);
        userId = user1.getId();
        String requestURI = request.getRequestURI();

        VipMeal vipMealById = vipService.getVipMealById(vipMealId);
        vipMeal=vipMealById;
        System.out.println("----------------"+vipMealById.getVipMoney());
        OrderDto orderDto = new OrderDto();
        orderDto.setUserId(userId);
        orderDto.setOrderName("会员订单");
        orderDto.setTotalMoney(vipMealById.getVipMoney());
        orderDto.setDescription(vipMealById.getVipName()+"套餐，"+"有效时间："+vipMealById.getVipTime()+"月");
        orderDto1=orderDto;
        return orderDto;
    }


    //获取购物车vip信息
    @RequestMapping(value = "/getVipOrder",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public Object getVipOrder( HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");

        return orderDto1;

    }


}
