package com.lcwx.wx.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WxConfig {
	private @Value("#{wxProperties.wx_token}")
	String token;

	public String getToken() {
		return token;
	}

}
