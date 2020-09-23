package com.ruoyi.hospital.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hospital.mapper.YPatientinfoMapper;
import com.ruoyi.hospital.domain.YPatientinfo;
import com.ruoyi.hospital.service.IYPatientinfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 患者信息登记Service业务层处理
 * 
 * @author lwl
 * @date 2020-06-22
 */
@Service
public class YPatientinfoServiceImpl implements IYPatientinfoService
{
    @Autowired
    private YPatientinfoMapper yPatientinfoMapper;

    /**
     * 查询患者信息登记
     * 
     * @param pid 患者信息登记ID
     * @return 患者信息登记
     */

    @Override
    public YPatientinfo selectYPatientinfoById(Long pid)
    {
        return yPatientinfoMapper.selectYPatientinfoById(pid);
    }

    /**
     * 查询患者信息登记列表
     * 
     * @param yPatientinfo 患者信息登记
     * @return 患者信息登记
     */
    //@DataSource(value = DataSourceType.SLAVE)
    @Override
    public List<YPatientinfo> selectYPatientinfoList(YPatientinfo yPatientinfo)
    {
        return yPatientinfoMapper.selectYPatientinfoList(yPatientinfo);
    }

    /**
     * 新增患者信息登记
     * 
     * @param yPatientinfo 患者信息登记
     * @return 结果
     */
    //@DataSource(value = DataSourceType.SLAVE)
    @Override
    public int insertYPatientinfo(YPatientinfo yPatientinfo)
    {
        return yPatientinfoMapper.insertYPatientinfo(yPatientinfo);
    }

    /**
     * 修改患者信息登记
     * 
     * @param yPatientinfo 患者信息登记
     * @return 结果
     */
    @Override
    public int updateYPatientinfo(YPatientinfo yPatientinfo)
    {
        return yPatientinfoMapper.updateYPatientinfo(yPatientinfo);
    }

    /**
     * 删除患者信息登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    //@DataSource(value = DataSourceType.SLAVE)
    @Override
    public int deleteYPatientinfoByIds(String ids)
    {
        return yPatientinfoMapper.deleteYPatientinfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除患者信息登记信息
     * 
     * @param pid 患者信息登记ID
     * @return 结果
     */
    @Override
    public int deleteYPatientinfoById(Long pid)
    {
        return yPatientinfoMapper.deleteYPatientinfoById(pid);
    }

    /**
     * 增加
     * 查询患者信息登记列表
     * @return 患者信息登记
     */
    public List<YPatientinfo> selectYPatientinfoAll()
    {
        return yPatientinfoMapper.selectYPatientinfoAll();
    }
}
