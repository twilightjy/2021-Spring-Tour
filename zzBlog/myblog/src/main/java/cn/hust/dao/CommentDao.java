package cn.hust.dao;

import cn.hust.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * @author zz
 * @since 2021-04-13
 */
@Repository
public interface CommentDao extends BaseMapper<Comment> {

}
