package org.wengll.tools.code.generator.entity;

import java.io.Serializable;
import java.util.List;

public class Table implements Serializable {

    private TableConfig tableConfig;

    private List<TableField> fieldList;
}
