package com.hzj.test.service;

import java.util.List;
import com.hzj.test.domain.SrmSrStandard;

/**
 * 科研标准Service接口
 * 
 * @author hzj
 * @date 2024-05-08
 */
public interface ISrmSrStandardService 
{
    /**
     * 查询科研标准
     * 
     * @param sssId 科研标准主键
     * @return 科研标准
     */
    public SrmSrStandard selectSrmSrStandardBySssId(Long sssId);

    /**
     * 查询科研标准列表
     * 
     * @param srmSrStandard 科研标准
     * @return 科研标准集合
     */
    public List<SrmSrStandard> selectSrmSrStandardList(SrmSrStandard srmSrStandard);

    /**
     * 新增科研标准
     * 
     * @param srmSrStandard 科研标准
     * @return 结果
     */
    public int insertSrmSrStandard(SrmSrStandard srmSrStandard);

    /**
     * 修改科研标准
     * 
     * @param srmSrStandard 科研标准
     * @return 结果
     */
    public int updateSrmSrStandard(SrmSrStandard srmSrStandard);

    /**
     * 批量删除科研标准
     * 
     * @param sssIds 需要删除的科研标准主键集合
     * @return 结果
     */
    public int deleteSrmSrStandardBySssIds(Long[] sssIds);

    /**
     * 删除科研标准信息
     * 
     * @param sssId 科研标准主键
     * @return 结果
     */
    public int deleteSrmSrStandardBySssId(Long sssId);
}
