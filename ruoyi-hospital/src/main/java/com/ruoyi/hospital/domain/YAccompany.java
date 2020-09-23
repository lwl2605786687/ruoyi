package com.ruoyi.hospital.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 陪护信息登记对象 y_accompany
 * 
 * @author lwl
 * @date 2020-06-22
 */
public class YAccompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long aid;

    /** 患者ID */
    private Long pid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String idcard;

    /** 户籍所在省市区 */
    @Excel(name = "户籍所在省市区")
    private String census;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 身份 */
    @Excel(name = "身份")
    private String identity;

    /** 健康码 */
    @Excel(name = "健康码")
    private String healthcode;

    /** 核酸检测 */
    @Excel(name = "核酸检测")
    private String nat;

    /** 陪护状态 */
    @Excel(name = "陪护状态")
    private String status;

    /** 操作人员 */
    @Excel(name = "操作人员")
    private String operperson;

    /** 操作时间 */
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operdate;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setAid(Long aid) 
    {
        this.aid = aid;
    }

    public Long getAid() 
    {
        return aid;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setIdcard(String idcard) 
    {
        this.idcard = idcard;
    }

    public String getIdcard() 
    {
        return idcard;
    }
    public void setCensus(String census) 
    {
        this.census = census;
    }

    public String getCensus() 
    {
        return census;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setIdentity(String identity) 
    {
        this.identity = identity;
    }

    public String getIdentity() 
    {
        return identity;
    }
    public void setHealthcode(String healthcode) 
    {
        this.healthcode = healthcode;
    }

    public String getHealthcode() 
    {
        return healthcode;
    }
    public void setNat(String nat) 
    {
        this.nat = nat;
    }

    public String getNat() 
    {
        return nat;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setOperperson(String operperson) 
    {
        this.operperson = operperson;
    }

    public String getOperperson() 
    {
        return operperson;
    }
    public void setOperdate(Date operdate) 
    {
        this.operdate = operdate;
    }

    public Date getOperdate() 
    {
        return operdate;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("aid", getAid())
            .append("pid", getPid())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("idcard", getIdcard())
            .append("census", getCensus())
            .append("phone", getPhone())
            .append("identity", getIdentity())
            .append("healthcode", getHealthcode())
            .append("nat", getNat())
            .append("status", getStatus())
            .append("operperson", getOperperson())
            .append("operdate", getOperdate())
            .append("remarks", getRemarks())
            .toString();
    }
}
