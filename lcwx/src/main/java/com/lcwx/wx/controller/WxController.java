package com.lcwx.wx.controller;

import java.util.Date;

import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcwx.wx.exception.WxException;
import com.lcwx.wx.model.WxMessage;
import com.lcwx.wx.service.WxAuthService;

@Controller
@RequestMapping("/wx")
public class WxController {
	private static final Logger log = LoggerFactory
			.getLogger(WxController.class);

	@Autowired
	private WxAuthService authService;

	@RequestMapping(method = { RequestMethod.GET, })
	public @ResponseBody
	String authGet(@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestParam("echostr") String echostr) throws WxException {
		log.debug("signature={}, timestamp={}, nonce={}, echostr={}",
				new String[] { signature, timestamp, nonce, echostr });
		if (authService.validateAuth(signature, timestamp, nonce, echostr)) {
			log.info("received authentication message from Weixin Server.");
			return echostr;
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	WxMessage post(@RequestBody WxMessage msg) throws DocumentException,
			WxException {
		log.info("received " + msg.getMsgType() + " message.");
		WxMessage resp = new WxMessage();
		resp.setContent("hello");
		resp.setCreateTime(new Date().getTime() / 1000);
		resp.setMsgType(msg.getMsgType());
		resp.setFromUserName(msg.getToUserName());
		resp.setToUserName(msg.getFromUserName());

		return resp;
	}
}
