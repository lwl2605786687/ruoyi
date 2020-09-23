package com.ruoyi.hospital.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 核酸检测登记对象 y_nucleate
 * 
 * @author lwl
 * @date 2020-06-28
 */
public class YNucleate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long nid;

    /** 样本编号 */
    @Excel(name = "样本编号")
    private String sampleno;

    /** 来源 */
    @Excel(name = "来源")
    private String source;

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

    /** 采样日期 */
    @Excel(name = "采样日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sampledate;

    /** 活动轨迹 */
    @Excel(name = "活动轨迹")
    private String track;

    /** 检查情况（血液，脆片） */
    @Excel(name = "检查情况（血液，脆片）", readConverterExp = "血=液，脆片")
    private String checkinfo;

    /** 标本类型 */
    @Excel(name = "标本类型")
    private String sampletype;

    /** 标本份数 */
    @Excel(name = "标本份数")
    private String samplescore;

    /** 发病日期 */
    @Excel(name = "发病日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date attackdate;

    /** 筛检结果 */
    @Excel(name = "筛检结果")
    private String screenresult;

    /** 结果日期 */
    @Excel(name = "结果日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date resultdate;

    /** 检测费用 */
    @Excel(name = "检测费用")
    private String cost;

    /** 操作人员 */
    @Excel(name = "操作人员")
    private String operperson;

    /** 操作时间 */
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operdate;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setNid(Long nid) 
    {
        this.nid = nid;
    }

    public Long getNid() 
    {
        return nid;
    }
    public void setSampleno(String sampleno) 
    {
        this.sampleno = sampleno;
    }

    public String getSampleno() 
    {
        return sampleno;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
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
    public void setSampledate(Date sampledate) 
    {
        this.sampledate = sampledate;
    }

    public Date getSampledate() 
    {
        return sampledate;
    }
    public void setTrack(String track) 
    {
        this.track = track;
    }

    public String getTrack() 
    {
        return track;
    }
    public void setCheckinfo(String checkinfo) 
    {
        this.checkinfo = checkinfo;
    }

    public String getCheckinfo() 
    {
        return checkinfo;
    }
    public void setSampletype(String sampletype) 
    {
        this.sampletype = sampletype;
    }

    public String getSampletype() 
    {
        return sampletype;
    }
    public void setSamplescore(String samplescore) 
    {
        this.samplescore = samplescore;
    }

    public String getSamplescore() 
    {
        return samplescore;
    }
    public void setAttackdate(Date attackdate) 
    {
        this.attackdate = attackdate;
    }

    public Date getAttackdate() 
    {
        return attackdate;
    }
    public void setScreenresult(String screenresult) 
    {
        this.screenresult = screenresult;
    }

    public String getScreenresult() 
    {
        return screenresult;
    }
    public void setResultdate(Date resultdate) 
    {
        this.resultdate = resultdate;
    }

    public Date getResultdate() 
    {
        return resultdate;
    }
    public void setCost(String cost) 
    {
        this.cost = cost;
    }

    public String getCost() 
    {
        return cost;
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
            .append("nid", getNid())
            .append("sampleno", getSampleno())
            .append("source", getSource())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("idcard", getIdcard())
            .append("census", getCensus())
            .append("phone", getPhone())
            .append("identity", getIdentity())
            .append("sampledate", getSampledate())
            .append("track", getTrack())
            .append("checkinfo", getCheckinfo())
            .append("sampletype", getSampletype())
            .append("samplescore", getSamplescore())
            .append("attackdate", getAttackdate())
            .append("screenresult", getScreenresult())
            .append("resultdate", getResultdate())
            .append("cost", getCost())
            .append("operperson", getOperperson())
            .append("operdate", getOperdate())
            .append("remarks", getRemarks())
            .toString();
    }
}
