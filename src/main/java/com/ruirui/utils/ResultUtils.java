package com.ruirui.utils;

import com.ruirui.entity.Result;

public class ResultUtils {
    public static Result<Object> error(Integer code, String mess) {
        Result<Object> result = new Result<Object>();
        result.setCode(code);
        result.setMess(mess);
        result.setData(null);
        return result;
    }
    public static Result<Object> success(Object data) {
        Result<Object> result = new Result<Object>();
        result.setCode(1);
        result.setMess("成功");
        result.setData(data);
        return result;
    }
    public static Result<Object> success() {
        return success(null);
    }
}
