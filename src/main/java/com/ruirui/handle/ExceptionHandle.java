package com.ruirui.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruirui.entity.Result;
import com.ruirui.exception.GirlException;
import com.ruirui.utils.ResultUtils;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<Object> handle(Exception e) {
        if(e instanceof GirlException) {
            GirlException girlException = (GirlException)e;
            return ResultUtils.error(girlException.getCode(), girlException.getMessage());
        }
        logger.info(e.getMessage());
        return ResultUtils.error(-1, "未知的错误！");
    }
}
