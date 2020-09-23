package com.ruoyi.hospital.service;

import java.util.List;
import com.ruoyi.hospital.domain.YPatient;

/**
 * 病人信息Service接口
 * 
 * @author lwl
 * @date 2020-06-28
 */
public interface IYPatientService 
{
    /**
     * 查询病人信息
     * 
     * @param id 病人信息ID
     * @return 病人信息
     */
    public YPatient selectYPatientById(Long id);

    /**
     * 查询病人信息列表
     * 
     * @param yPatient 病人信息
     * @return 病人信息集合
     */
    public List<YPatient> selectYPatientList(YPatient yPatient);

    /**
     * 新增病人信息
     * 
     * @param yPatient 病人信息
     * @return 结果
     */
    public int insertYPatient(YPatient yPatient);

    /**
     * 修改病人信息
     * 
     * @param yPatient 病人信息
     * @return 结果
     */
    public int updateYPatient(YPatient yPatient);

    /**
     * 批量删除病人信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYPatientByIds(String ids);

    /**
     * 删除病人信息信息
     * 
     * @param id 病人信息ID
     * @return 结果
     */
    public int deleteYPatientById(Long id);
}
