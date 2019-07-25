package com.ssm.api;


import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.*;
import com.ssm.dto.order.OrderDto;
import com.ssm.dto.order.OrderPay;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.lang.System.out;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/5 8:58
 */
public class AlipayUtil {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016100100640858";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCO/tKRbVP3pNE53y+CWdqs1sBWjkN5hw8vh/ut8H2gghudcDF9yyQxHvringkM+YCsPEW+EDCY14DjXkFNxa3fP+HjLPSRSnQNDxkK+MPDsgMweKFx5AP1TeFcmRPHzjhubYLxn0U1L33mDyHRzRpXylLtdAvBSVZbvVzq59R8jjFV7Fxb2X8KdqRgXZZQvVLvZoth/qNJn8l59Gq37f3ZChRN5e39TBEHJkxr1eZJJNjSboNGx5Eb9CsNv6XwawWTU3MSuG2gsGWdJyZg2G3LajsO4qOI9WEpIZf4Z3jkbQJcb4T8VftZx9gng0cLzFV02DuXONvmJSky/Vt4hdMhAgMBAAECggEAan3+BU39VZWKN+Yt9I7EWynHre5e89eQiJ5l4eETPgEHXdWbFgq+VlKzFygIp3/8wshUTDq0Zm8/zpR4X9oTJgrmSBBHxxhCmyMeTFx9NnWRCH0eBrp/9CTe694YrBm5TwwBk75AhV5sDXRBhISR1MWZwrtEsdrTFJlO5KZoSaVivnNAGXNE8ic29q1a+KfzPyq2F+1tpFTpkfK1uYevU+6zmMximIMei31xzhL7vpyzivCA4QnXHar5PTkIzyovcl4nJUxjRz2Ta1LOF5tvjNn7GSn63CKs3+OVru9DU1IYO2uwwPo+XIw//1W5OwNMUaVpBGn/2ubtkSQz9SGDXQKBgQDAiMis1r1oxBteW/NvXTmuoBQcuywrkDDL0ME2G+pe9d25wbv+0Ax7/NQ+yYfUe+S7iwUheGiJLAbkV7u4SB8Y8IaoGrwrWas5DxUIdF55uQ4+syMrc/at/dN9nA7agbresaH5PFlk6Z/QAGsBS7+jVeubxObmxAs2L3cvG+REDwKBgQC+IaTe6qzDCubkvcQdEb4QFNFdDQK5rZj76j+3hu/eQDTRDG3EihrQOodbsIlBupNL3516UwnKkPk0RJ0g5W8fEK1t7YjEpx4LB0ukvNZQfV+Rh5jSm4ED+8QRkS+jEP7F9xQKL56DnUb1qm34UUOW+5F0c0nXhl0QUWvIz/mFzwKBgET7fTL4CYsU4F1xgon/E+CuOCaHJW9CTUlpNSCm5dU6MEQS1sGYVzDBSGZqnIEUFsLfL2prksC7BokfqgF/zayI2SY31f2ONhvOfJG35/WiySjL1CkIdnSmgfT6ShQd8Q9DA66h4cGXNww2aiBfvHzQFweLh9NcoEu8u+4kBygfAoGAVL9yWdqIvzdwy6y6aaqq6UgeOje+az0x37f+RrPi31IHONctZlmYshAknX4G8EFVvpAiBZBV4PDV47Jhx3P9H/+zDji+qclD3u6VjQyPCrmXi6rBN78QttHWB26LqUe+CEelqxSmt0u3gXFCK1kto3Lm1t08oNDHUqq4PH5XXokCgYA94KZAKPxqMVpGo7welMURNc8ksyfhA01E6NOQOGZLb2FeqqTyKkO+ctXpeEy94/d8Bb7l/uzbFD/TiEEFEYofpoFFGp31x6zwCrE3RJR/Y71s09qHmviHNryMJ9xDlJ/qnO7863Xx8yOIOqhsm8EcjQ8LdDSBWyEMJl12gYVD1w==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlCFy7iGcStP/0slC7AlcbrcyRZkwh/NZ7ViTMsPS5ne5vqFshSbUtn53NAW771VdZNs5GamZNnPT+VT7AbXJv57g2qBlSr7w5Jh2EgK+Nr9FrCWvrSSHsoWbN4mOFvARWFK0hBklaj8yMjoNPQBvqkSl2CrMVXU+hmh2UiVuYWc4jdzPvFwJ5CSUyBDeVgICoOQYWUsjDP7y7Q2ObA2SbJdrnJZt59JQ+NenlCSIiPLFL9pOj7yVQ3FvtlQW0ZzlduTXoZO0pRoi+l4k8QBpJlO4TUBRuWqI7S+6R3c4yz9JMaRQjTapeKBmXrgTqjYBtjqJV9iQRMTTNlfiqtNGTwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "             http://47b9h6.natappfree.cc/tourism/buycart/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "            http://47b9h6.natappfree.cc/tourism/buycart/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //交易关闭
    public static void closeTrade(HttpServletRequest request){
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "json", charset, alipay_public_key, sign_type);

        //设置请求参数
        AlipayTradeCloseRequest alipayRequest = new AlipayTradeCloseRequest();
        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = null;
        try {
            out_trade_no = new String(request.getParameter("WIDTCout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //支付宝交易号
        String trade_no = null;
        try {
            trade_no = new String(request.getParameter("WIDTCtrade_no").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //请二选一设置

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," +"\"trade_no\":\""+ trade_no +"\"}");

        //请求
        String result = null;
        try {
            result = alipayClient.execute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //输出
        out.println(result);
    }

    //交易关闭
    public static void tradeFastpayRefund(HttpServletRequest request){
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "json", charset, alipay_public_key, sign_type);

        //设置请求参数
        AlipayTradeFastpayRefundQueryRequest alipayRequest = new AlipayTradeFastpayRefundQueryRequest();

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = null;
        try {
            out_trade_no = new String(request.getParameter("WIDRQout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //支付宝交易号
        String trade_no = null;
        try {
            trade_no = new String(request.getParameter("WIDRQtrade_no").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //请二选一设置
        //请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部交易号，必填
        String out_request_no = null;
        try {
            out_request_no = new String(request.getParameter("WIDRQout_request_no").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                +"\"trade_no\":\""+ trade_no +"\","
                +"\"out_request_no\":\""+ out_request_no +"\"}");

        //请求
        String result = null;
        try {
            result = alipayClient.execute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //输出
        out.println(result);
    }

    //付款
    public static String tradePagePay(OrderPay orderPay, HttpServletRequest request){
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "json", charset, alipay_public_key, sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(return_url);
        alipayRequest.setNotifyUrl(notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = null;
        try {
            out_trade_no = new String(orderPay.getOrderNo().getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //付款金额，必填
        String total_amount = null;
        try {
            total_amount = new String(orderPay.getTotalMoney().getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //订单名称，必填
        String subject = null;
        try {
            subject = new String(orderPay.getOrderName().getBytes("UTF-8"),"UTF-8");
            //out.println("AlipayUtil   !!!"+subject);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //商品描述，可空
        String body = null;
        try {
            body = new String(orderPay.getOrderDetail().getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        String result = null;
        try {
            result = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //输出
        out.println(result);
        return result;
    }

    //交易查询
    public static void tradeQuery(HttpServletRequest request){
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "json", charset, alipay_public_key, sign_type);

        //设置请求参数
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = null;
        //支付宝交易号
        String trade_no =null;
        //请求
        String result= null;
        try {
            out_trade_no = new String(request.getParameter("WIDTQout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            trade_no = new String(request.getParameter("WIDTQtrade_no").getBytes("ISO-8859-1"),"UTF-8");
            //请二选一设置
            alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","+"\"trade_no\":\""+ trade_no +"\"}");

            result= alipayClient.execute(alipayRequest).getBody();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }


        //输出
        out.println(result);
    }

    //退款
    public static void tradeRefund(HttpServletRequest request) throws UnsupportedEncodingException {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "json", charset, alipay_public_key, sign_type);

        //设置请求参数
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = null;
        //支付宝交易号
        String trade_no = null;

        //请二选一设置
        //需要退款的金额，该金额不能大于订单金额，必填
        String refund_amount = null;
        try {
            out_trade_no = new String(request.getParameter("WIDTRout_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            trade_no = new String(request.getParameter("WIDTRtrade_no").getBytes("ISO-8859-1"),"UTF-8");

            refund_amount = new String(request.getParameter("WIDTRrefund_amount").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        //退款的原因说明
        String refund_reason = new String(request.getParameter("WIDTRrefund_reason").getBytes("ISO-8859-1"),"UTF-8");
        //标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
        String out_request_no = new String(request.getParameter("WIDTRout_request_no").getBytes("ISO-8859-1"),"UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"trade_no\":\""+ trade_no +"\","
                + "\"refund_amount\":\""+ refund_amount +"\","
                + "\"refund_reason\":\""+ refund_reason +"\","
                + "\"out_request_no\":\""+ out_request_no +"\","
                + "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\","
                +"\"extend_params\":{" +
                " \"sys_service_provider_id\":\"2088102179116923\"" +
                "}");





        //请求
        String result = null;
        try {
            result = alipayClient.execute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //输出
        out.println(result);
    }

    //post
    public static OrderDto setNotify_url(HttpServletRequest request, HttpServletResponse response){
        OrderDto dtoOrder =null;
        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
//            try {
//                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
            params.put(name, valueStr);
        }

        boolean signVerified = false; //调用SDK验证签名
        try {
            signVerified = AlipaySignature.rsaCheckV1(params, alipay_public_key, charset, sign_type);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //——请在这里编写您的程序（以下代码仅作参考）——

	/* 实际验证过程建议商户务必添加以下校验：
	1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
	2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
	3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
	4、验证app_id是否为该商户本身。
	*/

        if(signVerified) {//验证成功
            //商户订单号
            try {
                String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //支付宝交易号
            try {
                String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //交易状态
            String trade_status = null;
            try {
                trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            if(trade_status.equals("TRADE_FINISHED")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序
                try {
                    response.getWriter().print("success");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            }else if (trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序
                out.println("66666666666666666666666666666AlipayUtil:"+requestParams);
                //支付时间
                String notify_time = requestParams.get("notify_time")[0];
                //订单名称
                String subject = requestParams.get("subject")[0];
                //发票额
                String invoice_amount = requestParams.get("invoice_amount")[0];
                //订单商家号
                String out_trade_no = requestParams.get("out_trade_no")[0];
                //总金额
                String total_amount = requestParams.get("total_amount")[0];
                //订单号
                String trade_no = requestParams.get("trade_no")[0];


                //out.println("原来的格式时间  "+notify_time);
                String format = "yyyy-MM-dd HH:mm:ss";
                    //设置日期格式
                SimpleDateFormat df = new SimpleDateFormat(format);
                    // new Date()为获取当前系统时间
                Date date = new Date();
                String str = df.format(date);
                //out.println("11111111111111111"+str);
                 dtoOrder = new OrderDto(trade_no,out_trade_no,subject,Double.valueOf(total_amount),Double.valueOf(invoice_amount),notify_time);
                //注意：
                //付款完成后，支付宝系统发送该交易状态通知
                return dtoOrder;
            }

            out.println("success");

        }else {//验证失败
            out.println("fail");

            //调试用，写文本函数记录程序运行情况是否正常
            //String sWord = AlipaySignature.getSignCheckContentV1(params);
            //logResult(sWord);
        }

        //——请在这里编写您的程序（以上代码仅作参考）——
        return dtoOrder;
    }

    //get
    public static void setReturn_url(HttpServletRequest request){
        //获取支付宝GET过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            try {
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            params.put(name, valueStr);
        }

        boolean signVerified = false; //调用SDK验证签名
        try {
            signVerified = AlipaySignature.rsaCheckV1(params, alipay_public_key, charset, sign_type);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
            //商户订单号
            String out_trade_no = null;
            try {
                out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //支付宝交易号
            String trade_no = null;
            try {
                trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //付款金额
            String total_amount = null;
            try {
                total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            out.println("trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);
        }else {
            out.println("验签失败");
        }
        //——请在这里编写您的程序（以上代码仅作参考）——
    }

}
