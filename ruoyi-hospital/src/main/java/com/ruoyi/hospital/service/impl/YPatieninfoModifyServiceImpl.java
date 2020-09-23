package com.ruoyi.hospital.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hospital.mapper.YPatieninfoModifyMapper;
import com.ruoyi.hospital.domain.YPatieninfoModify;
import com.ruoyi.hospital.service.IYPatieninfoModifyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 患者信息修改Service业务层处理
 * 
 * @author lwl
 * @date 2020-07-07
 */
@Service
public class YPatieninfoModifyServiceImpl implements IYPatieninfoModifyService 
{
    @Autowired
    private YPatieninfoModifyMapper yPatieninfoModifyMapper;

    /**
     * 查询患者信息修改
     * 
     * @param id 患者信息修改ID
     * @return 患者信息修改
     */
    @Override
    public YPatieninfoModify selectYPatieninfoModifyById(Long id)
    {
        return yPatieninfoModifyMapper.selectYPatieninfoModifyById(id);
    }

    /**
     * 查询患者信息修改列表
     * 
     * @param yPatieninfoModify 患者信息修改
     * @return 患者信息修改
     */
    @Override
    public List<YPatieninfoModify> selectYPatieninfoModifyList(YPatieninfoModify yPatieninfoModify)
    {
        return yPatieninfoModifyMapper.selectYPatieninfoModifyList(yPatieninfoModify);
    }

    /**
     * 新增患者信息修改
     * 
     * @param yPatieninfoModify 患者信息修改
     * @return 结果
     */
    @Override
    public int insertYPatieninfoModify(YPatieninfoModify yPatieninfoModify)
    {
        return yPatieninfoModifyMapper.insertYPatieninfoModify(yPatieninfoModify);
    }

    /**
     * 修改患者信息修改
     * 
     * @param yPatieninfoModify 患者信息修改
     * @return 结果
     */
    @Override
    public int updateYPatieninfoModify(YPatieninfoModify yPatieninfoModify)
    {
        return yPatieninfoModifyMapper.updateYPatieninfoModify(yPatieninfoModify);
    }

    /**
     * 删除患者信息修改对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteYPatieninfoModifyByIds(String ids)
    {
        return yPatieninfoModifyMapper.deleteYPatieninfoModifyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除患者信息修改信息
     * 
     * @param id 患者信息修改ID
     * @return 结果
     */
    @Override
    public int deleteYPatieninfoModifyById(Long id)
    {
        return yPatieninfoModifyMapper.deleteYPatieninfoModifyById(id);
    }
}
