package com.ssm.dao.mappingExt;


import com.ssm.dto.CommentParameter;
import com.ssm.pojo.Comment;
import com.ssm.vo.CountMark;
import com.ssm.vo.DoubleDiscuss;

import java.util.List;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 10:37
 * @description：
 * @modified By：
 */
public interface DiscussMapperExt {
    /**
     * 添加评论
     * @param comment  评论内容
     * @return
     */
    Integer addComment(Comment comment);

    /**
     * 添加评论
     * @param commentParameter  查询评论所需参数
     * @return 评论集合
     */
    List<DoubleDiscuss> getCommentList(CommentParameter commentParameter);

    /**
     * 统计评分细节
     * @param commentParameter
     * @return
     */
    CountMark getCommentMark(CommentParameter commentParameter);

}
 