package org.wengll.tools.code.generator.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;

public class TableConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 数据源主键
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long dataSourceId;

    /**
     * 模块名称
     */
    private String serviceName;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 实体名
     */
    private String tablePrefix;

    /**
     * 主键名
     */
    private String pkName;

    /**
     * 基础业务模式
     */
    private Integer baseMode;

    /**
     * 包装器模式
     */
    private Integer wrapMode;

    /**
     * 后端包名
     */
    private String packageName;

    /**
     * 后端路径
     */
    private String apiPath;

    /**
     * 前端路径
     */
    private String webPath;

    /**
     * 是否已删除
     */
    private Integer delFlag;
}
