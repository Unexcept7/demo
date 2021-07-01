package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：zhaops
 * @description：TODO
 * @date ：2021/6/9 13:39
 */
@Data
@ApiModel(value="com.example.demo.entity.CmsRoleTab记录了可以登录中国移动网上服务系统的所有角色不同角色具有不同的权限")
public class CmsRoleIdDTO implements Serializable {

    private static final long serialVersionUID = 4901627277348501849L;
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
}
