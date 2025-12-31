package com.spring.example.controller;

import com.spring.example.service.DIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * 功能：DiController 示例
 * 作者：@SmartSi
 * 博客：https://smartsi.blog.csdn.net/
 * 公众号：大数据生态
 * 日期：2025/11/26 21:45
 */
@Slf4j
@RestController
@RequestMapping(value = "/di", produces = MediaType.APPLICATION_JSON_VALUE)
public class DIController {
    @Autowired
    private DIService diService;

    @GetMapping(value = "/mysql")
    public int mysqlSync() {
        try {
            diService.mysqlSync();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @GetMapping(value = "/stream")
    public int streamSync() {
        try {
            diService.streamSync();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
