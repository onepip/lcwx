package com.lcwx.wx.model;

public class WxRespCode {
	private Integer errCode;
	private String errMsg;

	public Integer getErrCode() {
		return errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public WxRespCode(Integer errCode, String errMsg) {
		super();
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

}
