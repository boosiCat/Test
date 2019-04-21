package com.clg.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)  //链式结构
public class LombokTestEntity {
    @NonNull  private long id;
    private String userName;
    private int passWord;
    private String detail;

    @Override
    public String toString() {
        return "LombokTestEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord=" + passWord +
                ", detail='" + detail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LombokTestEntity LombokTestEntity = new LombokTestEntity();
        LombokTestEntity.setUserName("").setPassWord(1).setDetail("");
        System.out.println(LombokTestEntity.toString());
    }
}
