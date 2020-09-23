package com.ruoyi.hospital.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病人信息对象 y_patient
 * 
 * @author lwl
 * @date 2020-06-28
 */
public class YPatient extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 患者ID */
    private Long pid;

    /** 陪护人ID */
    private Long aid;

    /** 核酸检测ID */
    private Long nid;

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

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 身份 */
    @Excel(name = "身份")
    private String identity;

    /** 操作人员 */
    @Excel(name = "操作人员")
    private String operperson;

    /** 操作时间 */
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operdate;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setAid(Long aid) 
    {
        this.aid = aid;
    }

    public Long getAid() 
    {
        return aid;
    }
    public void setNid(Long nid) 
    {
        this.nid = nid;
    }

    public Long getNid() 
    {
        return nid;
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
            .append("id", getId())
            .append("pid", getPid())
            .append("aid", getAid())
            .append("nid", getNid())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("idcard", getIdcard())
            .append("census", getCensus())
            .append("phone", getPhone())
            .append("identity", getIdentity())
            .append("operperson", getOperperson())
            .append("operdate", getOperdate())
            .append("remarks", getRemarks())
            .toString();
    }
}
