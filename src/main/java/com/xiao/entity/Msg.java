package com.xiao.entity;

/**
 * ClassName: Msg <br/>
 * Description: <br/>
 * date: 2019/9/26 11:35<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
public class Msg {

    private  String code;//错误代码
    private  String msg;//错误信息

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

   public static final String msg1="登入成功";//登入成功
    public static  final String code1="1";//成功码
    public static  final String msg2="用户名密码错误";//登入失败
    public  static  final String code2="2";//失败码




}
