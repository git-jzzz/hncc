package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试用对象 test_test
 * 
 * @author ruoyi
 * @date 2020-08-17
 */
public class TestTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long uid;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uid", getUid())
            .append("username", getUsername())
            .append("sex", getSex())
            .toString();
    }
}
