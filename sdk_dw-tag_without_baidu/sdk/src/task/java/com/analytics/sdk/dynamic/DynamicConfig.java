package com.analytics.sdk.dynamic;

import com.analytics.sdk.dynamic.a.BeforeAfterTaskImpl;
import com.analytics.sdk.dynamic.a.NullBeforeAfterTaskImpl;
import com.analytics.sdk.service.dynamic.ITaskService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 这个类是一定存在的
 */
public final class DynamicConfig {

    /**
     * 热修复的集合
     */
    final HashMap<Class<?>,Class<?>> hotfixServiceMapping = new HashMap<>();
    /**
     * 获取服务只被执行一次的集合
     */
    final List<Class<?>> taskServiceList = new ArrayList<>();

    public DynamicConfig(){
        taskServiceList.add(NullBeforeAfterTaskImpl.class);
        taskServiceList.add(BeforeAfterTaskImpl.class);
    }

    /**
     * 热修复的集合
     */
    public HashMap<Class<?>,Class<?>> getHotfixServiceMapping(){
        return hotfixServiceMapping;
    }

    /**
     * 获取服务只被执行一次的集合
     */
    public List<Class<?>> getTaskServiceList(){
        return taskServiceList;
    }

    public boolean isSupportHotfix(){
        return true;
    }

}
