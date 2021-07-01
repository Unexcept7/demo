package com.example.demo.dao;

import com.example.demo.entity.CmsRoleTab;

public interface CmsRoleTabDao {
    int deleteByPrimaryKey(Integer cms_role_id);

    int insert(CmsRoleTab record);

    int insertSelective(CmsRoleTab record);

    CmsRoleTab selectByPrimaryKey(Integer cms_role_id);

    int updateByPrimaryKeySelective(CmsRoleTab record);

    int updateByPrimaryKey(CmsRoleTab record);
}