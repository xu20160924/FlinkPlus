package com.fp.core.config;

import com.fp.common.config.AbstractConfig;

import java.util.Map;

/**
 * @author: Denial.AO
 * @date: 2020-12-01 11:06
 * @description: Processor Config
 **/
public class ProcesserConfig extends AbstractConfig {
    public ProcesserConfig(Map<String, Object> map) {
        super(map);
    }

    public String getChannleName() {
        return null;
    }
}
