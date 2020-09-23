package com.ruoyi.hospital.mapper;

import java.util.List;
import com.ruoyi.hospital.domain.YPatientinfo;
import org.apache.ibatis.annotations.Delete;

/**
 * 患者信息登记Mapper接口
 * 
 * @author lwl
 * @date 2020-06-22
 */
public interface YPatientinfoMapper 
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
     * 删除患者信息登记
     * 
     * @param pid 患者信息登记ID
     * @return 结果
     */
    public int deleteYPatientinfoById(Long pid);

    /**
     * 批量删除患者信息登记
     * 
     * @param pids 需要删除的数据ID
     * @return 结果
     */

    public int deleteYPatientinfoByIds(String[] pids);

    /**
     * 增加
     * 查询患者信息登记列表
     * @return 患者信息登记
     */
    public List<YPatientinfo> selectYPatientinfoAll();
}
