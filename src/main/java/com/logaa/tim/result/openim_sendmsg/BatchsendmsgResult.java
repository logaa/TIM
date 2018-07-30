/**
 * 
 */
package com.logaa.tim.result.openim_sendmsg;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 批量单发群聊消息
 * @author logaa
 *
 */
public class BatchsendmsgResult extends TimBaseResult{

	private List<Error> ErrorList;
	
	public class Error{
		
		private String To_Account; //目标账户
		
		private Integer ErrorCode;

		public String getTo_Account() {
			return To_Account;
		}

		public void setTo_Account(String to_Account) {
			To_Account = to_Account;
		}

		public Integer getErrorCode() {
			return ErrorCode;
		}

		public void setErrorCode(Integer errorCode) {
			ErrorCode = errorCode;
		}
		
	}

	public List<Error> getErrorList() {
		return ErrorList;
	}

	public void setErrorList(List<Error> errorList) {
		ErrorList = errorList;
	}
	
}
