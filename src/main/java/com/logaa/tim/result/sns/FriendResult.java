/**
 * 
 */
package com.logaa.tim.result.sns;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 添加好友
 * @author logaa
 *
 */
public class FriendResult extends TimBaseResult{

	private List<Result> ResultItem;
	
	private List<String> Fail_Account;	// 返回处理失败的用户列表。
	
	private List<String> Invalid_Account;	// 	返回请求包中的非法用户列表。
	
	private Integer CurrentSequence;	// 返回最新的分组 Sequence。
	
	public class Result{
		
		private String To_Account;
		
		private String Relation;	// 	校验成功时 To_Account 与 From_Account 之间的黑名单关系
		
		private Integer ResultCode;	// 批量加好友中单个好友的处理结果，0 表示业务成功，非 0 表示业务失败。
		
		private String ResultInfo;

		public String getTo_Account() {
			return To_Account;
		}

		public void setTo_Account(String to_Account) {
			To_Account = to_Account;
		}

		public Integer getResultCode() {
			return ResultCode;
		}

		public void setResultCode(Integer resultCode) {
			ResultCode = resultCode;
		}

		public String getResultInfo() {
			return ResultInfo;
		}

		public void setResultInfo(String resultInfo) {
			ResultInfo = resultInfo;
		}

		public String getRelation() {
			return Relation;
		}

		public void setRelation(String relation) {
			Relation = relation;
		}
	}

	public List<Result> getResultItem() {
		return ResultItem;
	}

	public void setResultItem(List<Result> resultItem) {
		ResultItem = resultItem;
	}

	public List<String> getFail_Account() {
		return Fail_Account;
	}

	public void setFail_Account(List<String> fail_Account) {
		Fail_Account = fail_Account;
	}

	public List<String> getInvalid_Account() {
		return Invalid_Account;
	}

	public void setInvalid_Account(List<String> invalid_Account) {
		Invalid_Account = invalid_Account;
	}
	
}
