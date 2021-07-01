package com.example.demo.service.impl;

import com.example.demo.bo.DemoBO;
import com.example.demo.entity.CmsRoleTab;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：zhaops
 * @description：TODO
 * @date ：2021/6/9 13:30
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Resource
    DemoBO demoBO;
    @Override
    public CmsRoleTab selectByPrimaryKey(Integer cms_role_id) {
        return demoBO.selectByPrimaryKey(cms_role_id);
    }
}
