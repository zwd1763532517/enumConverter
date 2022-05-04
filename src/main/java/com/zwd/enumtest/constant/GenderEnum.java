package com.zwd.enumtest.constant;


public enum GenderEnum implements BaseEnum {

    FEMALE(0,"female"),
    MAIL(1,"mail");

    private Integer code;
    private String msg;

    GenderEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
