package com.example.demo.service;

import com.example.demo.entity.CmsRoleTab;
import org.springframework.stereotype.Service;

public interface DemoService {
    CmsRoleTab selectByPrimaryKey(Integer cms_role_id);
}
