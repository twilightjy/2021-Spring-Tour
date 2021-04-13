package cn.hust.service.impl;

import cn.hust.dao.CommentDao;
import cn.hust.entity.Comment;
import cn.hust.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @since 2021-04-13
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

}
