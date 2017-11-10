package com.mitri;

import java.util.Date;
import lombok.Data;

/**
 * <p>Title: RocketMQTest--com.mitri.Student</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017:11 </p>
 * <p>Create DateTime: 2017/11/10 下午4:40 </p>
 *
 * @author Potter
 * @version v2
 */
public class Student {

  private String name;

  private String age;

  private String address;

  private Date birth;

  private int id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
