/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import com.logaa.tim.result.TimBaseResult;

/**
 * 在群组中发送普通消息
 * @author logaa
 *
 */
public class SendGroupMsgResult extends TimBaseResult{

	private Integer MsgTime;
	
	private Integer MsgSeq;

	public Integer getMsgTime() {
		return MsgTime;
	}

	public void setMsgTime(Integer msgTime) {
		MsgTime = msgTime;
	}

	public Integer getMsgSeq() {
		return MsgSeq;
	}

	public void setMsgSeq(Integer msgSeq) {
		MsgSeq = msgSeq;
	}
}
