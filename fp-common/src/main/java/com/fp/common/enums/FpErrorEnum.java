package com.fp.common.enums;


/**
 * @Author: Denial.AO
 * @Date: 2020年11月29日17:01:39
 * @Package: com.fp.common.enums
 * @ClassName: FpErrorEnum
 * @Description:
 **/
public enum FpErrorEnum {
    // common status
    SUCCESS("00000", "success"),
    FAILED("99999", "failed"),
    UNKNOWN("99998", "unkown"),

    PARAMETER_EMPTY("99997", "paramter none");




    private String msg;
    private String code;

    FpErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
