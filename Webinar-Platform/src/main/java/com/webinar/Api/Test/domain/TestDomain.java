package com.webinar.Api.Test.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName test
 */
@TableName(value ="test")
@Data
public class TestDomain implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String testname;

    /**
     * 
     */
    private String testnick;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}