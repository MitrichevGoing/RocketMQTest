package com.mitri.roketmq;

import java.util.LinkedHashSet;
import java.util.Set;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>Title: Springboot-Enhance--com.mitri.roketmq.RocketMqProperties</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017:11 </p>
 * <p>Create DateTime: 2017/11/7 下午4:12 </p>
 *
 * @author Potter
 * @version v2
 */
@Data
@ConfigurationProperties("rmq")
public class RocketMqProperties {
  private String namesrvAddr = "";
  private String instanceName = "";
  /**
   * 普通生成者
   */
  private String defaultProducer = "";
  private String transactionProducer = "";
  /**
   * 普通消费者
   */
  private String defaultConsumer = "";
  /**
   * 顺序消费者
   */
  private String orderConsumer = "";

  private Set<String> defaultTopic = new LinkedHashSet<>();

  private Set<String> orderTopic = new LinkedHashSet<>();

  public String getNamesrvAddr() {
    return namesrvAddr;
  }

  public void setNamesrvAddr(String namesrvAddr) {
    this.namesrvAddr = namesrvAddr;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public String getDefaultProducer() {
    return defaultProducer;
  }

  public void setDefaultProducer(String defaultProducer) {
    this.defaultProducer = defaultProducer;
  }

  public String getTransactionProducer() {
    return transactionProducer;
  }

  public void setTransactionProducer(String transactionProducer) {
    this.transactionProducer = transactionProducer;
  }

  public String getDefaultConsumer() {
    return defaultConsumer;
  }

  public void setDefaultConsumer(String defaultConsumer) {
    this.defaultConsumer = defaultConsumer;
  }

  public String getOrderConsumer() {
    return orderConsumer;
  }

  public void setOrderConsumer(String orderConsumer) {
    this.orderConsumer = orderConsumer;
  }

  public Set<String> getDefaultTopic() {
    return defaultTopic;
  }

  public void setDefaultTopic(Set<String> defaultTopic) {
    this.defaultTopic = defaultTopic;
  }

  public Set<String> getOrderTopic() {
    return orderTopic;
  }

  public void setOrderTopic(Set<String> orderTopic) {
    this.orderTopic = orderTopic;
  }
}
