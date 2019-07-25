package com.ssm.service;

import com.ssm.dto.CommentParameter;
import com.ssm.pojo.Comment;
import com.ssm.vo.CountMark;
import com.ssm.vo.DoubleDiscuss;

import java.util.List;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 10:32
 * @description：
 * @modified By：
 */
public interface DiscussService {
    /**
     * 添加用户
     * @param comment  评论信息对象
     * @return      影响行数
     */
    boolean addComment(Comment comment);

    /**
     * 查询评论
     * @param commentParameter  评论所需参数
     * @return      评论集合
     */
    List<DoubleDiscuss> getCommentList(CommentParameter commentParameter);

    /**
     * 统计评分细节
     * @param commentParameter
     * @return
     */
    CountMark getCommentMark(CommentParameter commentParameter);
}
 