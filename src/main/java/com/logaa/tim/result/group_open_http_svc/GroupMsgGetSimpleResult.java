/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 拉去群漫游消息
 * @author logaa
 *
 */
public class GroupMsgGetSimpleResult extends TimBaseResult{

	private String GroupId;
	
	private Integer IsFinished;	// 	是否返回了请求区间的全部消息，当消息长度太长或者区间太大（超过 20）导致无法返回全部消息时值为 0。
	
	private List<RspMsg> RspMsgList;
	
	public class RspMsg{
		
		private String From_Account;	// 消息的发送者
		
		private Integer IsPlaceMsg;	// 是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，这个字段为 1。
		
		private List<MsgBody> MsgBody;
		
		private Integer MsgRandom;	// 消息随机值，用来对消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成一个。
		
		private Integer MsgSeq;	// 消息 seq，用来标识唯一消息，值越小发送的越早。
		
		private Long MsgTimeStamp;	// 	消息被发送的时间戳，server 的时间。

		public String getFrom_Account() {
			return From_Account;
		}

		public void setFrom_Account(String from_Account) {
			From_Account = from_Account;
		}

		public Integer getIsPlaceMsg() {
			return IsPlaceMsg;
		}

		public void setIsPlaceMsg(Integer isPlaceMsg) {
			IsPlaceMsg = isPlaceMsg;
		}

		public List<MsgBody> getMsgBody() {
			return MsgBody;
		}

		public void setMsgBody(List<MsgBody> msgBody) {
			MsgBody = msgBody;
		}

		public Integer getMsgRandom() {
			return MsgRandom;
		}

		public void setMsgRandom(Integer msgRandom) {
			MsgRandom = msgRandom;
		}

		public Integer getMsgSeq() {
			return MsgSeq;
		}

		public void setMsgSeq(Integer msgSeq) {
			MsgSeq = msgSeq;
		}

		public Long getMsgTimeStamp() {
			return MsgTimeStamp;
		}

		public void setMsgTimeStamp(Long msgTimeStamp) {
			MsgTimeStamp = msgTimeStamp;
		}
	}
	
	public class MsgBody{
		
		private MsgContent MsgContent;
		
		private String MsgType;

		public MsgContent getMsgContent() {
			return MsgContent;
		}

		public void setMsgContent(MsgContent msgContent) {
			MsgContent = msgContent;
		}

		public String getMsgType() {
			return MsgType;
		}

		public void setMsgType(String msgType) {
			MsgType = msgType;
		}
	}
	
	public class MsgContent{
		
		private String Data;
		
		private String Desc;

		private String Ext;

		public String getData() {
			return Data;
		}

		public void setData(String data) {
			Data = data;
		}

		public String getDesc() {
			return Desc;
		}

		public void setDesc(String desc) {
			Desc = desc;
		}

		public String getExt() {
			return Ext;
		}

		public void setExt(String ext) {
			Ext = ext;
		}
	}

	public String getGroupId() {
		return GroupId;
	}

	public void setGroupId(String groupId) {
		GroupId = groupId;
	}

	public Integer getIsFinished() {
		return IsFinished;
	}

	public void setIsFinished(Integer isFinished) {
		IsFinished = isFinished;
	}

	public List<RspMsg> getRspMsgList() {
		return RspMsgList;
	}

	public void setRspMsgList(List<RspMsg> rspMsgList) {
		RspMsgList = rspMsgList;
	}
	
}
