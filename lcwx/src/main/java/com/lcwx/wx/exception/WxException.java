package com.lcwx.wx.exception;

import com.lcwx.wx.model.WxRespCode;

public class WxException extends Exception {

	private static final long serialVersionUID = 4405730023906987136L;

	private WxRespCode error;

	/**
	 * 
	 */
	public WxException() {
	}

	/**
	 * @param message
	 */
	public WxException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public WxException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public WxException(String message, Throwable cause) {
		super(message, cause);
	}

	public WxException(WxRespCode errorJson) {
		super(errorJson.getErrMsg());
		this.error = errorJson;
	}
}
