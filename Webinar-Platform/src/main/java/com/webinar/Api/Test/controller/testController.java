package com.webinar.Api.Test.controller;

import com.webinar.Common.Result.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Webinar
 * @date 2023/5/16
 * Description: TODO
 */
@Api(tags = "测试模块")
@RestController
@RequestMapping("test")
public class testController {
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "向客人问好")
    @GetMapping("hello")
    public ResultData<String> hello(String name){
        return ResultData.success("hello my platform!");
    }
    @ApiOperation(value = "异常测试")
    @GetMapping("/wrong")
    public int error(){
        int i = 9/0;
        return i;
    }
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "异常测试1")
    @GetMapping("/wrong1")
    public ResultData error1(String name){
        if(name.equals("张三")){
            throw new RuntimeException("自定义异常！");
        }
       return ResultData.success(name);
    }

}
