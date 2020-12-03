package com.fp.core.processor;

import com.fp.common.enums.FpErrorEnum;
import com.fp.common.exception.FpException;
import com.fp.core.context.SinkContext;
import com.fp.core.context.SourceContext;

/**
 * @author: Denial.AO
 * @date: 2020-12-02 17:07
 * @description: Base Request Processor
 **/
public interface RequestProcessor<IN extends SourceContext, OUT extends SinkContext> {

    class RequestProcessorException extends FpException {
        RequestProcessorException(FpErrorEnum exceptionEnum){
            super(exceptionEnum);
        };
    }



}
