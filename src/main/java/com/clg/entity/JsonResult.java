package com.clg.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult<T> implements Serializable {

    public static final int SUCCESS = 200;//成功
    public static final int FAIL = 201;//失败
    public static final int GET_FAIL = 202;    // 场景定义的返回值
    public static final int NO_DATA = 203;    // 场景定义的返回值
    public static final int RECHARGE_FAIL = 205;//充值失败
    public static final int USER_REGISTER_ALREADY = 210;//手机号已经注册
    public static final int TELEPHONE_NOT_EXIST = 211;//手机号未注册
    public static final int WX_NOT_REGISTER = 401;//未在微信端注册
    public static final int TOKEN_EXPIRED = 9001;//token失效
    public static final int LOGIN_BAN = 9002;//用户被封
    public static final int MONEY_NOT_ENOUGH = 208;//余额不足

    public static final int CREIDT_AUTH_ERROR = 501;            // 信用认证通道查询异常
    public static final int INPUT_CAPTCHA = 10002;                // 51坚果信用请输入短信验证码(短信验证码有效时间一分钟);
    public static final int INFO_ERROR = 10003;                    // 51坚果信用账号或密码错误
    public static final int SMS_CODE_EXPIRED = 10006;            // 适用于北京移动等多次输入验证码
    public static final int SMS_CODE_FAIL = 10005;                // 短信验证码错误
    public static final int MAX_VALID_CNT = 10099;                // 半小时内达到有效提交次数上限（3次）
    public static final int MAX_ERROR_CNT = 30001;                // 登录密码出错已达上限
    public static final int TRY_TOMORROW = 30002;                // 账号已锁定，请明天再试
    public static final int IMAGE_FAIL = 9999;                    // 图片验证码输入错误
    public static final int INPUT_CAPTCHA_AND_IAMGE = 10000;    // 请输入短信验证码和图片验证码
    public static final int INPUT_IMAGE_CAPTCHA = 10001;        // 请输入图片验证码
    public static final int SJMH_MOBILE_UNSUPPORTED = 2502;        // 数聚魔盒运营商不支持
    public static final int SJMH_SBGJJ_UNSUPPORTED = 2502;        // 数聚魔盒社保公积金不支持
    public static final int TZSJ_JLDX_TELECOM = 2602;            // 探知数据吉林电信手机号返回值
    public static final int TZSJ_RETURN_CUSTOM_MSG = 2603;        // 探知数据返回自定义提示信息

    private Integer status;

    private String msg;

    private T data;

    public JsonResult() {
    }

    public JsonResult(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(Integer status) {
        this.status = status;
    }

    public JsonResult(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static <T> JsonResult<T> ok() {
        return JsonResult.ok(null);
    }

    public static <T> JsonResult<T> ok(T data) {
        JsonResult<T> result = new JsonResult<>();
        result.setStatus(SUCCESS);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public static <T> JsonResult<T> ok(String message, T data) {
        JsonResult<T> result = new JsonResult<>();
        result.setStatus(SUCCESS);
        result.setMsg(message);
        result.setData(data);
        return result;
    }

    public static JsonResult fail(int code, String message) {
        if (code == SUCCESS) {
            throw new RuntimeException("ok is not fail");
        }
        JsonResult result = new JsonResult();
        result.setStatus(code);
        result.setMsg(message);
        return result;
    }

    @JsonIgnore
    public boolean isOk() {
        return SUCCESS == status;
    }
}
