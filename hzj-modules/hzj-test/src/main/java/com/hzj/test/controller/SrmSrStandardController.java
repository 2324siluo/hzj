package com.hzj.test.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hzj.common.log.annotation.Log;
import com.hzj.common.log.enums.BusinessType;
import com.hzj.common.security.annotation.RequiresPermissions;
import com.hzj.test.domain.SrmSrStandard;
import com.hzj.test.service.ISrmSrStandardService;
import com.hzj.common.core.web.controller.BaseController;
import com.hzj.common.core.web.domain.AjaxResult;
import com.hzj.common.core.utils.poi.ExcelUtil;
import com.hzj.common.core.web.page.TableDataInfo;

/**
 * 科研标准Controller
 * 
 * @author hzj
 * @date 2024-05-08
 */
@RestController
@RequestMapping("/standard")
public class SrmSrStandardController extends BaseController
{
    @Autowired
    private ISrmSrStandardService srmSrStandardService;

    /**
     * 查询科研标准列表
     */
    @RequiresPermissions("test:standard:list")
    @GetMapping("/list")
    public TableDataInfo list(SrmSrStandard srmSrStandard)
    {
        startPage();
        List<SrmSrStandard> list = srmSrStandardService.selectSrmSrStandardList(srmSrStandard);
        return getDataTable(list);
    }

    /**
     * 导出科研标准列表
     */
    @RequiresPermissions("test:standard:export")
    @Log(title = "科研标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SrmSrStandard srmSrStandard)
    {
        List<SrmSrStandard> list = srmSrStandardService.selectSrmSrStandardList(srmSrStandard);
        ExcelUtil<SrmSrStandard> util = new ExcelUtil<SrmSrStandard>(SrmSrStandard.class);
        util.exportExcel(response, list, "科研标准数据");
    }

    /**
     * 获取科研标准详细信息
     */
    @RequiresPermissions("test:standard:query")
    @GetMapping(value = "/{sssId}")
    public AjaxResult getInfo(@PathVariable("sssId") Long sssId)
    {
        return success(srmSrStandardService.selectSrmSrStandardBySssId(sssId));
    }

    /**
     * 新增科研标准
     */
    @RequiresPermissions("test:standard:add")
    @Log(title = "科研标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SrmSrStandard srmSrStandard)
    {
        return toAjax(srmSrStandardService.insertSrmSrStandard(srmSrStandard));
    }

    /**
     * 修改科研标准
     */
    @RequiresPermissions("test:standard:edit")
    @Log(title = "科研标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SrmSrStandard srmSrStandard)
    {
        return toAjax(srmSrStandardService.updateSrmSrStandard(srmSrStandard));
    }

    /**
     * 删除科研标准
     */
    @RequiresPermissions("test:standard:remove")
    @Log(title = "科研标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sssIds}")
    public AjaxResult remove(@PathVariable Long[] sssIds)
    {
        return toAjax(srmSrStandardService.deleteSrmSrStandardBySssIds(sssIds));
    }
}
