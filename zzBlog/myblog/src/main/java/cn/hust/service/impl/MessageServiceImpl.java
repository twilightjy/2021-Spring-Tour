package cn.hust.service.impl;

import cn.hust.dao.MessageDao;
import cn.hust.entity.Message;
import cn.hust.service.MessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zz
 * @since 2021-04-13
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message> implements MessageService {

}
