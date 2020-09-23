package com.ruoyi.hospital.mapper;

import java.util.List;
import com.ruoyi.hospital.domain.YPatieninfoModify;

/**
 * 患者信息修改Mapper接口
 * 
 * @author lwl
 * @date 2020-07-07
 */
public interface YPatieninfoModifyMapper 
{
    /**
     * 查询患者信息修改
     * 
     * @param id 患者信息修改ID
     * @return 患者信息修改
     */
    public YPatieninfoModify selectYPatieninfoModifyById(Long id);

    /**
     * 查询患者信息修改列表
     * 
     * @param yPatieninfoModify 患者信息修改
     * @return 患者信息修改集合
     */
    public List<YPatieninfoModify> selectYPatieninfoModifyList(YPatieninfoModify yPatieninfoModify);

    /**
     * 新增患者信息修改
     * 
     * @param yPatieninfoModify 患者信息修改
     * @return 结果
     */
    public int insertYPatieninfoModify(YPatieninfoModify yPatieninfoModify);

    /**
     * 修改患者信息修改
     * 
     * @param yPatieninfoModify 患者信息修改
     * @return 结果
     */
    public int updateYPatieninfoModify(YPatieninfoModify yPatieninfoModify);

    /**
     * 删除患者信息修改
     * 
     * @param id 患者信息修改ID
     * @return 结果
     */
    public int deleteYPatieninfoModifyById(Long id);

    /**
     * 批量删除患者信息修改
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYPatieninfoModifyByIds(String[] ids);
}
