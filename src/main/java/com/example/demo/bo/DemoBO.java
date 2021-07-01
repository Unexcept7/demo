package com.example.demo.bo;

import com.example.demo.entity.CmsRoleTab;

public interface DemoBO {
    CmsRoleTab selectByPrimaryKey(Integer cms_role_id);
}
