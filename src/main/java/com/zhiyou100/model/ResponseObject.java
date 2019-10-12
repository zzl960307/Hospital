package com.zhiyou100.model;

public class ResponseObject {

	String code;// 状态码
	String msg;// 信息
	Object obj;// 返回数据
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
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "ResponseObject [code=" + code + ", msg=" + msg + ", obj=" + obj + "]";
	}
	public ResponseObject(String code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}
	public ResponseObject() {
		super();
	}
	
}
