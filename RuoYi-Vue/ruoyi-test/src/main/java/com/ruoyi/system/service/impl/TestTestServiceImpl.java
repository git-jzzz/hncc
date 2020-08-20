package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestTestMapper;
import com.ruoyi.system.domain.TestTest;
import com.ruoyi.system.service.ITestTestService;

/**
 * 测试用Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-17
 */
@Service
public class TestTestServiceImpl implements ITestTestService 
{
    @Autowired
    private TestTestMapper testTestMapper;

    /**
     * 查询测试用
     * 
     * @param uid 测试用ID
     * @return 测试用
     */
    @Override
    public TestTest selectTestTestById(Long uid)
    {
        return testTestMapper.selectTestTestById(uid);
    }

    /**
     * 查询测试用列表
     * 
     * @param testTest 测试用
     * @return 测试用
     */
    @Override
    public List<TestTest> selectTestTestList(TestTest testTest)
    {
        return testTestMapper.selectTestTestList(testTest);
    }

    /**
     * 新增测试用
     * 
     * @param testTest 测试用
     * @return 结果
     */
    @Override
    public int insertTestTest(TestTest testTest)
    {
        return testTestMapper.insertTestTest(testTest);
    }

    /**
     * 修改测试用
     * 
     * @param testTest 测试用
     * @return 结果
     */
    @Override
    public int updateTestTest(TestTest testTest)
    {
        return testTestMapper.updateTestTest(testTest);
    }

    /**
     * 批量删除测试用
     * 
     * @param uids 需要删除的测试用ID
     * @return 结果
     */
    @Override
    public int deleteTestTestByIds(Long[] uids)
    {
        return testTestMapper.deleteTestTestByIds(uids);
    }

    /**
     * 删除测试用信息
     * 
     * @param uid 测试用ID
     * @return 结果
     */
    @Override
    public int deleteTestTestById(Long uid)
    {
        return testTestMapper.deleteTestTestById(uid);
    }
}
