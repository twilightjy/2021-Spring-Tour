package cn.hust.service.impl;

import cn.hust.dao.ArticleDao;
import cn.hust.entity.Article;
import cn.hust.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @since 2021-04-13
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}
