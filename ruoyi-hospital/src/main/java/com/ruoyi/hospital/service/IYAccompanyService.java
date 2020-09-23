package com.ruoyi.hospital.service;

import java.util.List;
import com.ruoyi.hospital.domain.YAccompany;

/**
 * 陪护信息登记Service接口
 * 
 * @author lwl
 * @date 2020-06-22
 */
public interface IYAccompanyService 
{
    /**
     * 查询陪护信息登记
     * 
     * @param aid 陪护信息登记ID
     * @return 陪护信息登记
     */
    public YAccompany selectYAccompanyById(Long aid);

    /**
     * 查询陪护信息登记列表
     * 
     * @param yAccompany 陪护信息登记
     * @return 陪护信息登记集合
     */
    public List<YAccompany> selectYAccompanyList(YAccompany yAccompany);

    /**
     * 新增陪护信息登记
     * 
     * @param yAccompany 陪护信息登记
     * @return 结果
     */
    public int insertYAccompany(YAccompany yAccompany);

    /**
     * 修改陪护信息登记
     * 
     * @param yAccompany 陪护信息登记
     * @return 结果
     */
    public int updateYAccompany(YAccompany yAccompany);

    /**
     * 批量删除陪护信息登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteYAccompanyByIds(String ids);

    /**
     * 删除陪护信息登记信息
     * 
     * @param aid 陪护信息登记ID
     * @return 结果
     */
    public int deleteYAccompanyById(Long aid);
}
