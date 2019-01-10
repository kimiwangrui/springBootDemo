package com.ruirui.controller;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruirui.entity.User;
import com.ruirui.enums.ResultEnum;
import com.ruirui.exception.GirlException;
import com.ruirui.utils.ResultUtils;

@RestController
public class HelloWorldController {
    @RequestMapping("/helloOne/{name}")
    public String helloOne(@PathVariable String name) {
        return "hello world" + name;
    }

    @RequestMapping("/helloTwo/{age}")
    public Object helloTwo(@PathVariable("age") Integer age) throws Exception {
        if (age < 18) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age < 23) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
       }
        return ResultUtils.success(age);
    }

    @RequestMapping("/helloThree")
    public Object helloThree(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtils.error(-1, bindingResult.getFieldError()
                    .getDefaultMessage());
        }
        return ResultUtils.success(user);
    }
}
