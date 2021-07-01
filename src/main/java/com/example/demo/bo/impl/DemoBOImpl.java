package com.example.demo.bo.impl;

import com.example.demo.bo.DemoBO;
import com.example.demo.dao.CmsRoleTabDao;
import com.example.demo.entity.CmsRoleTab;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：zhaops
 * @description：TODO
 * @date ：2021/6/9 17:29
 */
@Service("demoBO")
public class DemoBOImpl implements DemoBO {
    @Resource
    CmsRoleTabDao cmsRoleTabDao;
    @Override
    public CmsRoleTab selectByPrimaryKey(Integer cms_role_id) {
        return cmsRoleTabDao.selectByPrimaryKey(cms_role_id);
    }
}
