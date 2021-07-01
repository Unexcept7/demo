package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * cms_role_tab
 * @author
 */
@ApiModel(value="com.example.demo.entity.CmsRoleTab记录了可以登录中国移动网上服务系统的所有角色不同角色具有不同的权限")
@Data
public class CmsRoleTab implements Serializable {
    /**
     * 记录了可以登录中国移动网上服务系统的所有角色
            具体定义如下（0为普通的中国移动客户；1为普通客服操作员，2为系统客服操作员）
     */
    @ApiModelProperty(value="记录了可以登录中国移动网上服务系统的所有角色 具体定义如下（0为普通的中国移动客户；1为普通客服操作员，2为系统客服操作员）")
    private Integer cms_role_id;

    /**
     * 记录了三种可以中国移动网上服务系统的角色名称（普通的中国移动客户；普通操作员；系统操作员）

     */
    @ApiModelProperty(value="记录了三种可以中国移动网上服务系统的角色名称（普通的中国移动客户；普通操作员；系统操作员） ")
    private String cms_role_name;

    /**
     * 记录了是由谁创建的角色
     */
    @ApiModelProperty(value="记录了是由谁创建的角色")
    private String cms_role_create;

    /**
     * 记录角色的创建时间（yyyy-MM-dd）
     */
    @ApiModelProperty(value="记录角色的创建时间（yyyy-MM-dd）")
    private Date cms_role_createtime;

    private static final long serialVersionUID = 1L;
}
