package cn.hust.service.impl;

import cn.hust.dao.ResourceDao;
import cn.hust.entity.Resource;
import cn.hust.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @since 2021-04-13
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceDao, Resource> implements ResourceService {

}
