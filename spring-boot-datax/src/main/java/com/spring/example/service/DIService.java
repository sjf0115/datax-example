package com.spring.example.service;

import com.alibaba.datax.common.exception.DataXException;
import com.alibaba.datax.core.Engine;
import com.spring.example.utils.PathUtil;
import org.springframework.stereotype.Service;

/**
 * 功能：DIService 示例
 * 作者：@SmartSi
 * 博客：https://smartsi.blog.csdn.net/
 * 公众号：大数据生态
 * 日期：2025/11/26 21:42
 */
@Service
public class DIService {

    /**
     * MySQL 同步到 MySQL
     */
    public void mysqlSync() {
        String path = "/datax/mysql2mysql.json";
        exec(path);
    }

    /**
     * Stream2Stream 输出到控制台
     */
    public void streamSync() {
        String path = "/datax/stream2stream.json";
        exec(path);
    }

    /**
     * 执行同步
     * @param path 配置文件路径
     */
    private void exec (String path) {
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        System.setProperty("datax.home","/opt/workspace/datax/");
        String[] dataXArgs = {  "-job", jobPath, "-mode", "standalone", "-jobid", "-1"};
        try {
            Engine.entry(dataXArgs);
        } catch (Throwable e) {
            throw DataXException.asDataXException("执行 DataX 同步任务失败: " + e.getMessage());
        }
    }
}
