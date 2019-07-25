package com.ssm.service.impl;

import com.ssm.dao.mappingExt.DiscussMapperExt;
import com.ssm.dto.CommentParameter;
import com.ssm.pojo.Comment;
import com.ssm.service.DiscussService;
import com.ssm.vo.CountMark;
import com.ssm.vo.DoubleDiscuss;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：c_peizhi
 * @version ：1.0.0
 * @user ：c_PC
 * @date ：Created in 2019/7/23 10:32
 * @description：
 * @modified By：
 */
@Service
public class DiscussServiceImpl implements DiscussService {
    @Resource
    DiscussMapperExt discussMapperExt;

    @Override
    public boolean addComment(Comment comment) {
        int rSet = discussMapperExt.addComment(comment);
        if (rSet > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<DoubleDiscuss> getCommentList(CommentParameter commentParameter) {
        return discussMapperExt.getCommentList(commentParameter);
    }

    @Override
    public CountMark getCommentMark(CommentParameter commentParameter) {
        CountMark c = discussMapperExt.getCommentMark(commentParameter);
        c.setMarkSum(c.getMark1()+c.getMark2()+c.getMark3()+c.getMark4()+c.getMark5());
        if ( c.getMarkSum() == 0 ){
            c.setMark1Per(0);
            c.setMark2Per(0);
            c.setMark3Per(0);
            c.setMark4Per(0);
            c.setMark5Per(0);
            c.setMark(0.0);
        }else{
            c.setMark1Per(1.0*c.getMark1()/c.getMarkSum());
            c.setMark2Per(1.0*c.getMark2()/c.getMarkSum());
            c.setMark3Per(1.0*c.getMark3()/c.getMarkSum());
            c.setMark4Per(1.0*c.getMark4()/c.getMarkSum());
            c.setMark5Per(1.0*c.getMark5()/c.getMarkSum());
            c.setMark(1.0*(c.getMark1()+c.getMark2()*2+c.getMark3()*3+c.getMark4()*4+c.getMark5()*5) /c.getMarkSum() );
        }
        return c;
    }
}
    