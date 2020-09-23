package com.ruoyi.hospital.domain;

import java.util.Date;

import com.ruoyi.common.annotation.PropertyMsg;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者信息登记对象 y_patientinfo
 * 
 * @author lwl
 * @date 2020-06-22
 */
public class YPatientinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long pid;

    /** 病区 */
    @Excel(name = "病区")
    @PropertyMsg(value = "病区",enumStr = "0,外一科|1,外二科|2,内一科|3,内二科|4,儿科|5,妇产科")
    private String ward;

    /** 床号 */
    @Excel(name = "床号")
    @PropertyMsg(value = "床号")
    private String bed;

    /** 编号 */
    @Excel(name = "编号")
    @PropertyMsg(value = "编号")
    private String number;

    /** 住院号 */
    @Excel(name = "住院号")
    @PropertyMsg(value = "住院号")
    private String admission;

    /** 姓名 */
    @Excel(name = "姓名")
    @PropertyMsg(value = "姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    @PropertyMsg(value = "性别",enumStr = "0,男|1,女|2,未知")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    @PropertyMsg(value = "年龄")
    private Long age;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    @PropertyMsg(value = "身份证号码")
    private String idcard;

    /** 户籍所在省市区 */
    @Excel(name = "户籍所在省市区")
    @PropertyMsg(value = "户籍所在省市区")
    private String census;

    /** 电话号码 */
    @Excel(name = "电话号码")
    @PropertyMsg(value = "电话号码")
    private String phone;

    /** 身份 */
    @Excel(name = "身份")
    @PropertyMsg(value = "身份",enumStr = "0,患者|1,陪护|2,个人")
    private String identity;

    /** 入院日期 */
    @Excel(name = "入院日期", width = 30, dateFormat = "yyyy-MM-dd")
    @PropertyMsg(value = "入院日期")
    private Date rdate;

    /** 出院日期 */
    @Excel(name = "出院日期", width = 30, dateFormat = "yyyy-MM-dd")
    @PropertyMsg(value = "出院日期")
    private Date cdate;

    /** 状态 */
    @Excel(name = "状态")
    @PropertyMsg(value = "状态",enumStr = "0,在院|1,出院")
    private String status;

    /** 操作人员 */
    @Excel(name = "操作人员")
    @PropertyMsg(value = "操作人员")
    private String operperson;

    /** 操作时间  */
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operdate;

    /** 备注 */
    @Excel(name = "备注")
    @PropertyMsg(value = "备注")
    private String remarks;

    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setWard(String ward) 
    {
        this.ward = ward;
    }

    public String getWard() 
    {
        return ward;
    }
    public void setBed(String bed) 
    {
        this.bed = bed;
    }

    public String getBed() 
    {
        return bed;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setAdmission(String admission) 
    {
        this.admission = admission;
    }

    public String getAdmission() 
    {
        return admission;
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
    public void setRdate(Date rdate) 
    {
        this.rdate = rdate;
    }

    public Date getRdate() 
    {
        return rdate;
    }
    public void setCdate(Date cdate) 
    {
        this.cdate = cdate;
    }

    public Date getCdate() 
    {
        return cdate;
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
            .append("pid", getPid())
            .append("ward", getWard())
            .append("bed", getBed())
            .append("number", getNumber())
            .append("admission", getAdmission())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("idcard", getIdcard())
            .append("census", getCensus())
            .append("phone", getPhone())
            .append("identity", getIdentity())
            .append("rdate", getRdate())
            .append("cdate", getCdate())
            .append("status", getStatus())
            .append("operperson", getOperperson())
            .append("operdate", getOperdate())
            .append("remarks", getRemarks())
            .toString();
    }
}
