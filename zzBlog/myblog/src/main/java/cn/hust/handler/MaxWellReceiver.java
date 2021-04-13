package cn.hust.handler;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 同步es数据
 * @author zz
 * @since 2021-04-13
 */
@Component
@RabbitListener(queues = "article")
public class MaxWellReceiver {

}