package com.ruoyi.hospital.service;

import java.util.List;
import com.ruoyi.hospital.domain.YNucleate;

/**
 * 核酸检测登记Service接口
 * 
 * @author lwl
 * @date 2020-06-28
 */
public interface IYNucleateService 
{
    /**
     * 查询核酸检测登记
     * 
     * @param nid 核酸检测登记ID
     * @return 核酸检测登记
     */
    public YNucleate selectYNucleateById(Long nid);

    /**
     * 查询核酸检测登记列表
     * 
     * @param yNucleate 核酸检测登记
     * @return 核酸检测登记集合
     */
    public List<YNucleate> selectYNucleateList(YNucleate yNucleate);

    /**
     * 新增核酸检测登记
     * 
     * @param yNucleate 核酸检测登记
     * @return 结果
     */
    public int insertYNucleate(YNucleate yNucleate);

    /**
     * 修改核酸检测登记
     * 
     * @param yNucleate 核酸检测登记
     * @return 结果
     */
    public int updateYNucleate(YNucleate yNucleate);

    /**
     * 批量删除核酸检测登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYNucleateByIds(String ids);

    /**
     * 删除核酸检测登记信息
     * 
     * @param nid 核酸检测登记ID
     * @return 结果
     */
    public int deleteYNucleateById(Long nid);
}
