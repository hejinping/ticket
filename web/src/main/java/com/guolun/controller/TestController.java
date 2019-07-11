package com.guolun.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.guolun.sys.api.IActivityService;
import com.guolun.sys.dto.Activity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2019/2/18 0018.
 */
@RestController
public class TestController {
    @Reference
    private IActivityService activityService;
    @RequestMapping("/test")
    public ModelAndView test()throws Exception{
        Activity activity=activityService.updateSelectByPrimaryKey();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("content",activity.getName());
        return  modelAndView;
    }
}
