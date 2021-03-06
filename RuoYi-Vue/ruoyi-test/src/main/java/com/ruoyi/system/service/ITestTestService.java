package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TestTest;

/**
 * 测试用Service接口
 * 
 * @author ruoyi
 * @date 2020-08-17
 */
public interface ITestTestService 
{
    /**
     * 查询测试用
     * 
     * @param uid 测试用ID
     * @return 测试用
     */
    public TestTest selectTestTestById(Long uid);

    /**
     * 查询测试用列表
     * 
     * @param testTest 测试用
     * @return 测试用集合
     */
    public List<TestTest> selectTestTestList(TestTest testTest);

    /**
     * 新增测试用
     * 
     * @param testTest 测试用
     * @return 结果
     */
    public int insertTestTest(TestTest testTest);

    /**
     * 修改测试用
     * 
     * @param testTest 测试用
     * @return 结果
     */
    public int updateTestTest(TestTest testTest);

    /**
     * 批量删除测试用
     * 
     * @param uids 需要删除的测试用ID
     * @return 结果
     */
    public int deleteTestTestByIds(Long[] uids);

    /**
     * 删除测试用信息
     * 
     * @param uid 测试用ID
     * @return 结果
     */
    public int deleteTestTestById(Long uid);
}
