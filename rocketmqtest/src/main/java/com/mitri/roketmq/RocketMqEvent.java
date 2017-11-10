package com.mitri.roketmq;

import java.io.UnsupportedEncodingException;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.ApplicationEvent;

/**
 * <p>Title: Springboot-Enhance--com.mitri.roketmq.RocketMqEvent</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017:11 </p>
 * <p>Create DateTime: 2017/11/7 上午12:46 </p>
 *
 * @author Potter
 * @version v2
 */
public class RocketMqEvent extends ApplicationEvent {
  private static final long serialVersionUID = -4468405250074063206L;

  private DefaultMQPushConsumer consumer;
  private MessageExt messageExt;
  private String topic;
  private String tag;
  private byte[] body;

  public RocketMqEvent(MessageExt msg,DefaultMQPushConsumer consumer) throws Exception {
    super(msg);
    this.topic = msg.getTopic();
    this.tag = msg.getTags();
    this.body = msg.getBody();
    this.consumer = consumer;
    this.messageExt = msg;
  }

  public String getMsg() {
    try {
      return new String(this.body,"utf-8");
    } catch (UnsupportedEncodingException e) {
      return null;
    }
  }

  public String getMsg(String code) {
    try {
      return new String(this.body,code);
    } catch (UnsupportedEncodingException e) {
      return null;
    }
  }

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public DefaultMQPushConsumer getConsumer() {
    return consumer;
  }

  public void setConsumer(DefaultMQPushConsumer consumer) {
    this.consumer = consumer;
  }

  public MessageExt getMessageExt() {
    return messageExt;
  }

  public void setMessageExt(MessageExt messageExt) {
    this.messageExt = messageExt;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public byte[] getBody() {
    return body;
  }

  public void setBody(byte[] body) {
    this.body = body;
  }
}
