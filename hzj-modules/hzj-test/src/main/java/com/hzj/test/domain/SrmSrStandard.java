package com.hzj.test.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.hzj.common.core.annotation.Excel;
import com.hzj.common.core.web.domain.BaseEntity;

/**
 * 科研标准对象 srm_sr_standard
 * 
 * @author hzj
 * @date 2024-05-08
 */
public class SrmSrStandard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long sssId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String sssName;

    /** 得分 */
    @Excel(name = "得分")
    private BigDecimal sssScore;

    /** 备注 */
    @Excel(name = "备注")
    private String sssOther;

    public void setSssId(Long sssId) 
    {
        this.sssId = sssId;
    }

    public Long getSssId() 
    {
        return sssId;
    }
    public void setSssName(String sssName) 
    {
        this.sssName = sssName;
    }

    public String getSssName() 
    {
        return sssName;
    }
    public void setSssScore(BigDecimal sssScore) 
    {
        this.sssScore = sssScore;
    }

    public BigDecimal getSssScore() 
    {
        return sssScore;
    }
    public void setSssOther(String sssOther) 
    {
        this.sssOther = sssOther;
    }

    public String getSssOther() 
    {
        return sssOther;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sssId", getSssId())
            .append("sssName", getSssName())
            .append("sssScore", getSssScore())
            .append("sssOther", getSssOther())
            .toString();
    }
}
