/* Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
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
