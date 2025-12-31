package com.spring.example.utils;

import com.alibaba.datax.common.exception.DataXException;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

/**
 * 功能：路径工具类
 * 作者：@SmartSi
 * 博客：https://smartsi.blog.csdn.net/
 * 公众号：大数据生态
 * 日期：2025/12/31 10:19
 */
public class PathUtil {
    public static String getAbsolutePathFromClassPath(String path) {
        URL resource = PathUtil.class.getResource(path);
        try {
            assert resource != null;
            URI uri = resource.toURI();
            return Paths.get(uri).toString();
        } catch (NullPointerException | URISyntaxException e) {
            throw DataXException.asDataXException("path error,please check whether the path is correct");
        }
    }
}
