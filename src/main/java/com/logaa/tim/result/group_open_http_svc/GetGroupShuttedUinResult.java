/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取群组被禁言用户列表
 * @author logaa
 *
 */
public class GetGroupShuttedUinResult extends TimBaseResult{

	private String GroupId;
	
	private List<ShuttedUin> ShuttedUinList;
	
	public class ShuttedUin{
		
		private String Member_Account;	//用户ID
		
		private Long ShuttedUntil;	//禁言到的时间（使用UTC时间，即世界协调时间）

		public String getMember_Account() {
			return Member_Account;
		}

		public void setMember_Account(String member_Account) {
			Member_Account = member_Account;
		}

		public Long getShuttedUntil() {
			return ShuttedUntil;
		}

		public void setShuttedUntil(Long shuttedUntil) {
			ShuttedUntil = shuttedUntil;
		}
		
	}

	public String getGroupId() {
		return GroupId;
	}

	public void setGroupId(String groupId) {
		GroupId = groupId;
	}

	public List<ShuttedUin> getShuttedUinList() {
		return ShuttedUinList;
	}

	public void setShuttedUinList(List<ShuttedUin> shuttedUinList) {
		ShuttedUinList = shuttedUinList;
	}
}
