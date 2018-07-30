/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 群组消息撤回
 * @author logaa
 *
 */
public class GroupMsgRecallResult extends TimBaseResult{

	private List<RecallRet> RecallRetList;
	
	public class RecallRet{
		
		private Integer MsgSeq;
		
		private Integer RetCode;

		public Integer getMsgSeq() {
			return MsgSeq;
		}

		public void setMsgSeq(Integer msgSeq) {
			MsgSeq = msgSeq;
		}

		public Integer getRetCode() {
			return RetCode;
		}

		public void setRetCode(Integer retCode) {
			RetCode = retCode;
		}
	}

	public List<RecallRet> getRecallRetList() {
		return RecallRetList;
	}

	public void setRecallRetList(List<RecallRet> recallRetList) {
		RecallRetList = recallRetList;
	}
	
}
