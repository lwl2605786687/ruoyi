package com.ruoyi.hospital.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者信息修改对象 y_patieninfo_modify
 * 
 * @author lwl
 * @date 2020-07-07
 */
public class YPatieninfoModify extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 修改对象ID */
    @Excel(name = "修改对象ID")
    private Long modifyid;

    /** 修改内容 */
    @Excel(name = "修改内容")
    private String modifyinfo;

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
    public void setModifyid(Long modifyid) 
    {
        this.modifyid = modifyid;
    }

    public Long getModifyid() 
    {
        return modifyid;
    }
    public void setModifyinfo(String modifyinfo) 
    {
        this.modifyinfo = modifyinfo;
    }

    public String getModifyinfo() 
    {
        return modifyinfo;
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
            .append("modifyid", getModifyid())
            .append("modifyinfo", getModifyinfo())
            .append("operperson", getOperperson())
            .append("operdate", getOperdate())
            .append("remarks", getRemarks())
            .toString();
    }
}
