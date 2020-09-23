package com.ruoyi.hospital.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hospital.mapper.YPatientMapper;
import com.ruoyi.hospital.domain.YPatient;
import com.ruoyi.hospital.service.IYPatientService;
import com.ruoyi.common.core.text.Convert;

/**
 * 病人信息Service业务层处理
 * 
 * @author lwl
 * @date 2020-06-28
 */
@Service
public class YPatientServiceImpl implements IYPatientService 
{
    @Autowired
    private YPatientMapper yPatientMapper;

    /**
     * 查询病人信息
     * 
     * @param id 病人信息ID
     * @return 病人信息
     */
    @Override
    public YPatient selectYPatientById(Long id)
    {
        return yPatientMapper.selectYPatientById(id);
    }

    /**
     * 查询病人信息列表
     * 
     * @param yPatient 病人信息
     * @return 病人信息
     */
    @Override
    public List<YPatient> selectYPatientList(YPatient yPatient)
    {
        return yPatientMapper.selectYPatientList(yPatient);
    }

    /**
     * 新增病人信息
     * 
     * @param yPatient 病人信息
     * @return 结果
     */
    @Override
    public int insertYPatient(YPatient yPatient)
    {
        return yPatientMapper.insertYPatient(yPatient);
    }

    /**
     * 修改病人信息
     * 
     * @param yPatient 病人信息
     * @return 结果
     */
    @Override
    public int updateYPatient(YPatient yPatient)
    {
        return yPatientMapper.updateYPatient(yPatient);
    }

    /**
     * 删除病人信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteYPatientByIds(String ids)
    {
        return yPatientMapper.deleteYPatientByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除病人信息信息
     * 
     * @param id 病人信息ID
     * @return 结果
     */
    @Override
    public int deleteYPatientById(Long id)
    {
        return yPatientMapper.deleteYPatientById(id);
    }
}
