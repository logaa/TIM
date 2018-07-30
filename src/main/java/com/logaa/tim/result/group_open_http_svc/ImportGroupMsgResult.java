/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 导入群消息
 * @author logaa
 *
 */
public class ImportGroupMsgResult extends TimBaseResult{

	private List<ImportMsgResult> ImportMsgResult;
	
	public class ImportMsgResult{
		
		private Integer Result;
		
		private Integer MsgSeq;
		
		private Long MsgTime;

		public Integer getResult() {
			return Result;
		}

		public void setResult(Integer result) {
			Result = result;
		}

		public Integer getMsgSeq() {
			return MsgSeq;
		}

		public void setMsgSeq(Integer msgSeq) {
			MsgSeq = msgSeq;
		}

		public Long getMsgTime() {
			return MsgTime;
		}

		public void setMsgTime(Long msgTime) {
			MsgTime = msgTime;
		}
		
	}

	public List<ImportMsgResult> getImportMsgResult() {
		return ImportMsgResult;
	}

	public void setImportMsgResult(List<ImportMsgResult> importMsgResult) {
		ImportMsgResult = importMsgResult;
	}
}
