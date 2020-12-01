package com.fp.common.constant;

/**
 * @author: Denial.AO
 * @date: 2020-11-29 18:28
 * @description: Flink Key Constant
 **/
public class FlinkKey {


    /**
     * Flink common key
     */
    public static final String FLINK_TASK_COMMON_PARALLELISM_KEY = "flink.task.common.parallelism";
    public static final String FLINK_TASK_COMMON_RESTART_MODE_KEY = "flink.task.common.restartMode";
    public static final String FLINK_TASK_COMMON_RESTART_NUM_KEY = "flink.task.common.restartNum";
    public static final String FLINK_TASK_COMMON_RESTART_INTERVAL_KEY = "flink.task.common.restartInterval";
    public static final String FLINK_TASK_COMMON_RESTART_FAIL_MAX_KEY = "flink.task.common.restartFailMaxNum";
    public static final String FLINK_TASK_COMMON_QUEUE_KEY = "flink.task.common.queue";

    /**
     * Flink checkpoint key
     */
    public static final String FLINK_TASK_CHECKPOINT_ENABLE_KEY = "flink.task.checkpoint.enable";
    public static final String FLINK_TASK_CHECKPOINT_INTERVAL_KEY = "flink.task.checkpoint.interval";
    public static final String FLINK_TASK_CHECKPOINT_TIMEOUT_KEY = "flink.task.checkpoint.timeout";
    public static final String FLINK_TASK_CHECKPOINT_MODE_KEY = "flink.task.checkpoint.mode";
    public static final String FLINK_TASK_CHECKPOINT_MIN_INTERVAL_KEY = "flink.task.checkpoint.minInterval";
    public static final String FLINK_TASK_CHECKPOINT_MAX_CONCURRENT_KEY = "flink.task.checkpoint.maxConcurrent";
    public static final String FLINK_TASK_CHECKPOINT_EXTERNALIZED_ENABLE_KEY = "flink.task.checkpoint.externalized.enable";
    public static final String FLINK_TASK_CHECKPOINT_EXTERNALIZED_CLEANUP_KEY = "flink.task.checkpoint.externalized.cleanUp";
    public static final String FLINK_TASK_CHECKPOINT_ON_FAIL_KEY = "flink.task.checkpoint.onFail";

    /**
     * Flink state key
     */

    public static final String FLINK_TASK_STATE_BACKEND_TYPE_KEY = "flink.task.stateBackend.type";
    public static final String FLINK_TASK_STATE_BACKEND_ASYNC_KEY = "flink.task.stateBackend.async";
    public static final String FLINK_TASK_STATE_BACKEND_PATH_KEY = "flink.task.stateBackend.path";
    public static final String FLINK_TASK_STREAM_TIME_CHARACTERISTIC_KEY = "flink.task.stream.timeCharacteristic";

}
