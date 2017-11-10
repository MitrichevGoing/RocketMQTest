package com.mitri.roketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * <p>Title: Springboot-Enhance--com.mitri.roketmq.ConsumerListen</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017:11 </p>
 * <p>Create DateTime: 2017/11/7 下午4:20 </p>
 *
 * @author Potter
 * @version v2
 */
@Component
public class ConsumerListen {

  @EventListener(condition = "#event.topic=='newTopic'")
  public void testListen(RocketMqEvent event) {
    DefaultMQPushConsumer consumer = event.getConsumer();
    MessageExt messageExt = event.getMessageExt();
    try {
      System.out.println("正在消费。。。"+ new String(messageExt.getBody(),"utf-8"));
    } catch (Exception e) {
      e.printStackTrace();
      if (messageExt.getReconsumeTimes() <= 1) {// 重复消费1次
        try {
          consumer.sendMessageBack(messageExt, 1);
        } catch (RemotingException | MQBrokerException | InterruptedException | MQClientException e1) {
          e1.printStackTrace();
          //消息进行定时重试
        }
      } else {
        System.out.println("消息消费失败，定时重试");
      }
    }
  }
}
