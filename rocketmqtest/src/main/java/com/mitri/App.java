package com.mitri;

import com.alibaba.fastjson.JSONObject;
import java.util.Date;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Title: RocketMQTest--com.mitri.App</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017:11 </p>
 * <p>Create DateTime: 2017/11/10 下午4:20 </p>
 *
 * @author Potter
 * @version v2
 */
@SpringBootApplication
public class App implements CommandLineRunner{

  @Autowired
  private DefaultMQProducer defaultMQProducer;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Student student = new Student();
    student.setName("张飞");
    student.setAge("20");
    student.setAddress("dashdjksadhjakdhjashdjhdjkshdjshdjsadhjkasdhjdhjawu电话费的健康数据库化尽快发货邓及时发货尽快发货继父回家独守空房好久发货接受的开发环境快递费");
    student.setBirth(new Date());
    for(int x=0;x<100000;x++){
      student.setId(x);
      String body = JSONObject.toJSONString(student);
      Message message = new Message("topic1","topic1",body.getBytes());
      defaultMQProducer.send(message,1000);

      Message message1 = new Message("topic2","topic2",body.getBytes());
      defaultMQProducer.send(message1,1000);

      Message message2 = new Message("topic3","topic3",body.getBytes());
      defaultMQProducer.send(message2,1000);

      Message message3 = new Message("topic4","topic4",body.getBytes());
      defaultMQProducer.send(message3,1000);

      Message message4 = new Message("topic5","topic5",body.getBytes());
      defaultMQProducer.send(message4,1000);

      Message message5 = new Message("topic6","topic6",body.getBytes());
      defaultMQProducer.send(message5,1000);

      Message message6 = new Message("topic7","topic7",body.getBytes());
      defaultMQProducer.send(message6,1000);

      Message message7 = new Message("topic8","topic8",body.getBytes());
      defaultMQProducer.send(message7,1000);

    }
  }
}
