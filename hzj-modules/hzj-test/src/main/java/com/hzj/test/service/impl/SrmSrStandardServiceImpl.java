package com.hzj.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hzj.test.mapper.SrmSrStandardMapper;
import com.hzj.test.domain.SrmSrStandard;
import com.hzj.test.service.ISrmSrStandardService;

/**
 * 科研标准Service业务层处理
 * 
 * @author hzj
 * @date 2024-05-08
 */
@Service
public class SrmSrStandardServiceImpl implements ISrmSrStandardService 
{
    @Autowired
    private SrmSrStandardMapper srmSrStandardMapper;

    /**
     * 查询科研标准
     * 
     * @param sssId 科研标准主键
     * @return 科研标准
     */
    @Override
    public SrmSrStandard selectSrmSrStandardBySssId(Long sssId)
    {
        return srmSrStandardMapper.selectSrmSrStandardBySssId(sssId);
    }

    /**
     * 查询科研标准列表
     * 
     * @param srmSrStandard 科研标准
     * @return 科研标准
     */
    @Override
    public List<SrmSrStandard> selectSrmSrStandardList(SrmSrStandard srmSrStandard)
    {
        return srmSrStandardMapper.selectSrmSrStandardList(srmSrStandard);
    }

    /**
     * 新增科研标准
     * 
     * @param srmSrStandard 科研标准
     * @return 结果
     */
    @Override
    public int insertSrmSrStandard(SrmSrStandard srmSrStandard)
    {
        return srmSrStandardMapper.insertSrmSrStandard(srmSrStandard);
    }

    /**
     * 修改科研标准
     * 
     * @param srmSrStandard 科研标准
     * @return 结果
     */
    @Override
    public int updateSrmSrStandard(SrmSrStandard srmSrStandard)
    {
        return srmSrStandardMapper.updateSrmSrStandard(srmSrStandard);
    }

    /**
     * 批量删除科研标准
     * 
     * @param sssIds 需要删除的科研标准主键
     * @return 结果
     */
    @Override
    public int deleteSrmSrStandardBySssIds(Long[] sssIds)
    {
        return srmSrStandardMapper.deleteSrmSrStandardBySssIds(sssIds);
    }

    /**
     * 删除科研标准信息
     * 
     * @param sssId 科研标准主键
     * @return 结果
     */
    @Override
    public int deleteSrmSrStandardBySssId(Long sssId)
    {
        return srmSrStandardMapper.deleteSrmSrStandardBySssId(sssId);
    }
}
