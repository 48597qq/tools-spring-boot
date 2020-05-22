package org.wengll.tools.code.generator.entity;

import java.io.Serializable;

/**
 * 数据源
 */
public class DataSource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 驱动类
     */
    private String driverClass;

    /**
     * 连接地址
     */
    private String url;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 备注
     */
    private String remark;
}
