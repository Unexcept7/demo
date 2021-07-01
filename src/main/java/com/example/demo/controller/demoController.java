package com.example.demo.controller;

import com.example.demo.entity.CmsRoleTab;
import com.example.demo.service.DemoService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：zhaops
 * @description：测试接口
 * @date ：2021/6/9 13:25
 */
@Slf4j
@RestController
@RequestMapping("/web/demo")
public class demoController {
    @Autowired
    private DemoService demoService;
    @PostMapping("/A")
    public CmsRoleTab selectByPrimaryKey(@RequestParam Integer cms_role_id){
        String json = "{\"insuAdmdvs\":[\"139900\",\"130181\"],\"inturyStartTime\":\"2021-06-01\",\"inturyEndTime\":\"2021-07-01\"}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        for (String insuAdmdvs: (List<String>)jsonObject.get("insuAdmdvs")) {
            log.info(insuAdmdvs+jsonObject.get("inturyStartTime"));
        }
        return demoService.selectByPrimaryKey(cms_role_id);
    }
}
