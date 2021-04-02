package com.myit.springboot_airpro.controller;

import com.myit.springboot_airpro.pojo.Air;
import com.myit.springboot_airpro.service.AirService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AirController {
    @Resource
    private AirService airService;
    @RequestMapping(value = "/")
    public String getIndex(Model model){
        model.addAttribute("title","我的空气质量监测系统");
        return "index";
    }
    @RequestMapping(value = "/airList")
    @ResponseBody
    public List<Air> getAir(Model model,@RequestParam(value = "district",required = false) String district){
        List<Air> list = null;
        /*if (district!=""&&district!=null){}*/
        list = airService.selectAll();
        return list;
    }
}
