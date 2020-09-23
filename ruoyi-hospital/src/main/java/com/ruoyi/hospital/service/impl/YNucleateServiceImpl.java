package com.ruoyi.hospital.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hospital.mapper.YNucleateMapper;
import com.ruoyi.hospital.domain.YNucleate;
import com.ruoyi.hospital.service.IYNucleateService;
import com.ruoyi.common.core.text.Convert;

/**
 * 核酸检测登记Service业务层处理
 * 
 * @author lwl
 * @date 2020-06-28
 */
@Service
public class YNucleateServiceImpl implements IYNucleateService 
{
    @Autowired
    private YNucleateMapper yNucleateMapper;

    /**
     * 查询核酸检测登记
     * 
     * @param nid 核酸检测登记ID
     * @return 核酸检测登记
     */
    @Override
    public YNucleate selectYNucleateById(Long nid)
    {
        return yNucleateMapper.selectYNucleateById(nid);
    }

    /**
     * 查询核酸检测登记列表
     * 
     * @param yNucleate 核酸检测登记
     * @return 核酸检测登记
     */
    @Override
    public List<YNucleate> selectYNucleateList(YNucleate yNucleate)
    {
        return yNucleateMapper.selectYNucleateList(yNucleate);
    }

    /**
     * 新增核酸检测登记
     * 
     * @param yNucleate 核酸检测登记
     * @return 结果
     */
    @Override
    public int insertYNucleate(YNucleate yNucleate)
    {
        return yNucleateMapper.insertYNucleate(yNucleate);
    }

    /**
     * 修改核酸检测登记
     * 
     * @param yNucleate 核酸检测登记
     * @return 结果
     */
    @Override
    public int updateYNucleate(YNucleate yNucleate)
    {
        return yNucleateMapper.updateYNucleate(yNucleate);
    }

    /**
     * 删除核酸检测登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteYNucleateByIds(String ids)
    {
        return yNucleateMapper.deleteYNucleateByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除核酸检测登记信息
     * 
     * @param nid 核酸检测登记ID
     * @return 结果
     */
    @Override
    public int deleteYNucleateById(Long nid)
    {
        return yNucleateMapper.deleteYNucleateById(nid);
    }
}
