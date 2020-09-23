package com.ruoyi.hospital.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hospital.mapper.YAccompanyMapper;
import com.ruoyi.hospital.domain.YAccompany;
import com.ruoyi.hospital.service.IYAccompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 陪护信息登记Service业务层处理
 * 
 * @author lwl
 * @date 2020-06-22
 */
@Service
public class YAccompanyServiceImpl implements IYAccompanyService 
{
    @Autowired
    private YAccompanyMapper yAccompanyMapper;

    /**
     * 查询陪护信息登记
     * 
     * @param aid 陪护信息登记ID
     * @return 陪护信息登记
     */
    @Override
    public YAccompany selectYAccompanyById(Long aid)
    {
        return yAccompanyMapper.selectYAccompanyById(aid);
    }

    /**
     * 查询陪护信息登记列表
     * 
     * @param yAccompany 陪护信息登记
     * @return 陪护信息登记
     */
    @Override
    public List<YAccompany> selectYAccompanyList(YAccompany yAccompany)
    {
        return yAccompanyMapper.selectYAccompanyList(yAccompany);
    }

    /**
     * 新增陪护信息登记
     * 
     * @param yAccompany 陪护信息登记
     * @return 结果
     */
    @Override
    public int insertYAccompany(YAccompany yAccompany)
    {
        return yAccompanyMapper.insertYAccompany(yAccompany);
    }

    /**
     * 修改陪护信息登记
     * 
     * @param yAccompany 陪护信息登记
     * @return 结果
     */
    @Override
    public int updateYAccompany(YAccompany yAccompany)
    {
        return yAccompanyMapper.updateYAccompany(yAccompany);
    }

    /**
     * 删除陪护信息登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteYAccompanyByIds(String ids)
    {
        return yAccompanyMapper.deleteYAccompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除陪护信息登记信息
     * 
     * @param aid 陪护信息登记ID
     * @return 结果
     */
    @Override
    public int deleteYAccompanyById(Long aid)
    {
        return yAccompanyMapper.deleteYAccompanyById(aid);
    }
}
