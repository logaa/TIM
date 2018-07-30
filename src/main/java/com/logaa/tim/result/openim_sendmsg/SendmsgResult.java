/**
 * 
 */
package com.logaa.tim.result.openim_sendmsg;

import com.logaa.tim.result.TimBaseResult;

/**
 * 单发群聊消息
 * @author logaa
 *
 */
public class SendmsgResult extends TimBaseResult{

	private Long MsgTime;	// 消息时间戳，unix 时间戳

	public Long getMsgTime() {
		return MsgTime;
	}

	public void setMsgTime(Long msgTime) {
		MsgTime = msgTime;
	}
	
}
