package com.xcm.smallmall.common.api;

/**
 * @描述 封装API的错误码
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
