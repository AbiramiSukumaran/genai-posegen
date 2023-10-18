package com.example.demo;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;


class Yoga {
  
  

public int getPoseId() {
    return poseId;
}
public void setPoseId(int poseId) {
    this.poseId = poseId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getBreath() {
    return breath;
}
public void setBreath(String breath) {
    this.breath = breath;
}
public String getDesc() {
    return desc;
}
public void setDesc(String desc) {
    this.desc = desc;
}

public List<String> getPose() {
    return pose;
}
public void setPose(List<String> pose) {
    this.pose = pose;
}

  private int poseId;
  private String name;
  private String breath;
  private String desc;
  private List<String> pose;
}