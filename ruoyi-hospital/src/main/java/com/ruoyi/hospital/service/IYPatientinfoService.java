package com.ruoyi.hospital.service;

import java.util.List;
import com.ruoyi.hospital.domain.YPatientinfo;

/**
 * 患者信息登记Service接口
 * 
 * @author lwl
 * @date 2020-06-22
 */
public interface IYPatientinfoService 
{
    /**
     * 查询患者信息登记
     * 
     * @param pid 患者信息登记ID
     * @return 患者信息登记
     */
    public YPatientinfo selectYPatientinfoById(Long pid);

    /**
     * 查询患者信息登记列表
     * 
     * @param yPatientinfo 患者信息登记
     * @return 患者信息登记集合
     */
    public List<YPatientinfo> selectYPatientinfoList(YPatientinfo yPatientinfo);

    /**
     * 新增患者信息登记
     * 
     * @param yPatientinfo 患者信息登记
     * @return 结果
     */
    public int insertYPatientinfo(YPatientinfo yPatientinfo);

    /**
     * 修改患者信息登记
     * 
     * @param yPatientinfo 患者信息登记
     * @return 结果
     */
    public int updateYPatientinfo(YPatientinfo yPatientinfo);

    /**
     * 批量删除患者信息登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYPatientinfoByIds(String ids);

    /**
     * 删除患者信息登记信息
     * 
     * @param pid 患者信息登记ID
     * @return 结果
     */
    public int deleteYPatientinfoById(Long pid);

    /**
     * 增加
     * 查询患者信息登记列表
     * @return 患者信息登记
     */
    public List<YPatientinfo> selectYPatientinfoAll();
}
