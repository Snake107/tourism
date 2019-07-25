package com.ssm.controller;

import com.ssm.dto.CommentParameter;
import com.ssm.pojo.Comment;
import com.ssm.pojo.User;
import com.ssm.service.DiscussService;
import com.ssm.vo.CountMark;
import com.ssm.vo.DoubleDiscuss;
import com.ssm.vo.State;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/23 8:57
 */
@RequestMapping(value = "discuss")
@Controller
public class DiscussController {

    @Resource
    DiscussService discussService;

    /**
     * 添加评论
     * @param comment
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public Object addComment(@RequestBody Comment comment, HttpServletRequest request){
        User user = (User) (request.getSession().getAttribute("user"));
        comment.setUserId(user.getId());
        comment.setCreateTime(new Date());
        System.out.println("123");
        System.out.println(comment.toString());
        State state = new State();
        state.setCode(200);
        state.setMsg("成功");
        discussService.addComment(comment);
        return state;
    }

    /**
     * 查找评论
     * @param commentParameter
     * @return
     */
    @RequestMapping(value = "getlist",method = RequestMethod.POST)
    @ResponseBody
    public Object getCommentList(@RequestBody CommentParameter commentParameter){
        System.out.println(commentParameter.getStart());
        System.out.println(commentParameter.getLimit());
        List<DoubleDiscuss> commentList = discussService.getCommentList(commentParameter);
        return commentList;
    }

    /**
     * 查找评论细节
     * @param commentParameter
     * @return
     */
    @RequestMapping(value = "getcommentdetail",method = RequestMethod.POST)
    @ResponseBody
    public Object getCommentMark(@RequestBody CommentParameter commentParameter){
        CountMark commentMark = discussService.getCommentMark(commentParameter);
        return commentMark;
    }
}
