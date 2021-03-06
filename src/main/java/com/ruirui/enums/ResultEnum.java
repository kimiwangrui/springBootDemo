package com.ruirui.enums;
public enum ResultEnum {

    UNKONW_ERROR(-1, "系统异常"), SUCCESS(1, "成功"), PRIMARY_SCHOOL(100, "未成年人禁止入内"), MIDDLE_SCHOOL(200,
            "大学生不能夜不归宿");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
