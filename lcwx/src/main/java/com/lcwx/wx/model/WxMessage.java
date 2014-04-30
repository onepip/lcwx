package com.lcwx.wx.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WxMessage {
	@XmlElement(name = "ToUserName")
	@XmlJavaTypeAdapter(value = CDATAAdaptor.class)
	private String toUserName;
	@XmlElement(name = "FromUserName")
	@XmlJavaTypeAdapter(value = CDATAAdaptor.class)
	private String fromUserName;
	@XmlElement(name = "CreateTime")
	private Long createTime;
	@XmlElement(name = "MsgType")
	@XmlJavaTypeAdapter(value = CDATAAdaptor.class)
	private String msgType;
	@XmlElement(name = "Content")
	@XmlJavaTypeAdapter(value = CDATAAdaptor.class)
	private String content;
	@XmlElement(name = "MsgId")
	private Long msgId;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

}
