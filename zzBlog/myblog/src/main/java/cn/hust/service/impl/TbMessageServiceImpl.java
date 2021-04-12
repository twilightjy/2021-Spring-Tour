package cn.hust.service.impl;

import cn.hust.entity.TbMessage;
import cn.hust.mapper.TbMessageMapper;
import cn.hust.service.TbMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zz
 * @since 2021-04-12
 */
@Service
public class TbMessageServiceImpl extends ServiceImpl<TbMessageMapper, TbMessage> implements TbMessageService {

}
