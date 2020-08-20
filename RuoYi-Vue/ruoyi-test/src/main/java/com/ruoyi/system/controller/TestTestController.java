package com.ruoyi.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TestTest;
import com.ruoyi.system.service.ITestTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试用Controller
 * 
 * @author ruoyi
 * @date 2020-08-17
 */
@RestController
@RequestMapping("/system/test")
public class TestTestController extends BaseController
{
    @Autowired
    private ITestTestService testTestService;

    /**
     * 查询测试用列表
     */
    @PreAuthorize("@ss.hasPermi('system:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestTest testTest)
    {
        startPage();
        List<TestTest> list = testTestService.selectTestTestList(testTest);
        return getDataTable(list);
    }

    /**
     * 导出测试用列表
     */
    @PreAuthorize("@ss.hasPermi('system:test:export')")
    @Log(title = "测试用", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TestTest testTest)
    {
        List<TestTest> list = testTestService.selectTestTestList(testTest);
        ExcelUtil<TestTest> util = new ExcelUtil<TestTest>(TestTest.class);
        return util.exportExcel(list, "test");
    }

    /**
     * 获取测试用详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:test:query')")
    @GetMapping(value = "/{uid}")
    public AjaxResult getInfo(@PathVariable("uid") Long uid)
    {
        return AjaxResult.success(testTestService.selectTestTestById(uid));
    }

    /**
     * 新增测试用
     */
    @PreAuthorize("@ss.hasPermi('system:test:add')")
    @Log(title = "测试用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestTest testTest)
    {
        return toAjax(testTestService.insertTestTest(testTest));
    }

    /**
     * 修改测试用
     */
    @PreAuthorize("@ss.hasPermi('system:test:edit')")
    @Log(title = "测试用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestTest testTest)
    {
        return toAjax(testTestService.updateTestTest(testTest));
    }

    /**
     * 删除测试用
     */
    @PreAuthorize("@ss.hasPermi('system:test:remove')")
    @Log(title = "测试用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uids}")
    public AjaxResult remove(@PathVariable Long[] uids)
    {
        return toAjax(testTestService.deleteTestTestByIds(uids));
    }
}
