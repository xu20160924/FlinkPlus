package com.fp.core.config;

import com.fp.common.config.AbstractConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Denial.AO
 * @date: 2020-12-01 10:25
 * @description: JobConfig
 **/
public class JobConfig extends AbstractConfig {
    public static final String READER = "reader";

    public static final String WRITER = "writer";


    private ReaderConfig readerConfig;

    private WriterConfig writerConfig;

    private ProcesserConfig processerConfig;

    public JobConfig(Map<String, Object> map) {
        super(map);
        this.readerConfig = new ReaderConfig(new HashMap<String, Object>());
        this.writerConfig = new WriterConfig(new HashMap<String, Object>());
        this.processerConfig = new ProcesserConfig(new HashMap<String, Object>());
        for (String key : map.keySet()) {
            Object value = map.get(key);
            if (key.startsWith("reader")) {
                readerConfig.setVal(key, value);
            } else if (key.startsWith("writer")) {
                writerConfig.setVal(key, value);
            } else if (key.startsWith("channel")) {
                processerConfig.setVal(key, value);
            } else {
                this.setVal(key, value);
            }
        }
    }


    public ReaderConfig getReaderConfig() {
        return readerConfig;
    }

    public void setReaderConfig(ReaderConfig readerConfig) {
        this.readerConfig = readerConfig;
    }

    public WriterConfig getWriterConfig() {
        return writerConfig;
    }

    public void setWriterConfig(WriterConfig writerConfig) {
        this.writerConfig = writerConfig;
    }


    public ProcesserConfig getProcesserConfig() {
        return processerConfig;
    }

    public void setProcesserConfig(ProcesserConfig processerConfig) {
        this.processerConfig = processerConfig;
    }
}
