package com.fp.common.exception;

import com.fp.common.enums.FpErrorEnum;

/**
 * @author: Denial.AO
 * @date: 2020-12-01 13:57
 * @description: BaseException 
 **/
public class FpException extends RuntimeException {
    public String code;
    public String msg;

    public FpException(FpErrorEnum exceptionEnum) {
        this.code = exceptionEnum.name();
        this.msg = exceptionEnum.getMsg();
    }

    public FpException(Throwable e) {
        super(e);
    }

    public FpException() {
    }

    public FpException(FpErrorEnum exceptionEnum, String msg) {
        super(msg);
        this.code = exceptionEnum.name();
        this.msg = msg;
    }

    public FpException(String msg) {
        super(msg);
        this.code = FpErrorEnum.FAILED.name();
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public static FpException generateParameterEmptyException(String msg) {
        return new FpException(FpErrorEnum.PARAMETER_EMPTY, msg);
    }

    public static FpException generateUnknownException(String msg) {
        return new FpException(FpErrorEnum.UNKNOWN, msg);
    }

    public static FpException generateParameterIllegalException(String msg) {
        return new FpException(FpErrorEnum.PARAMETER_EMPTY, msg);
    }

    public static FpException generateDataException(String msg) {
        return new FpException(FpErrorEnum.PARAMETER_EMPTY, msg);
    }
}
