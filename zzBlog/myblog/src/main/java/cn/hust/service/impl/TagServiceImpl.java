package cn.hust.service.impl;

import cn.hust.dao.TagDao;
import cn.hust.entity.Tag;
import cn.hust.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @since 2021-04-13
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagDao, Tag> implements TagService {


}
