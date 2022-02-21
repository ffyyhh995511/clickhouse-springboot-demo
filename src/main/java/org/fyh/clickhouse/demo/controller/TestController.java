package org.fyh.clickhouse.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.management.GarbageCollectionNotifInfoCompositeData;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2022/2/16 15:54
 */
@RestController
public class TestController {

    @GetMapping("test1")
    public Map<Object, Object> test1(){
        Map<Object, Object> objectObjectMap = new HashMap<>(1);
        objectObjectMap.put("msg","ok");
        return objectObjectMap;
    }
}