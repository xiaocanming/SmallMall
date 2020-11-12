package com.xcm.smallmall;

public class BaseResponseInfo {
    public int code;
    public Object data;

    public BaseResponseInfo() {
        code = 400;
        data = null;
    }
}
