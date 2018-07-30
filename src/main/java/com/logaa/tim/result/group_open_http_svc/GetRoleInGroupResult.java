/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 查询用户在群组中的身份
 * @author logaa
 *
 */
public class GetRoleInGroupResult extends TimBaseResult{

	private List<UserId> UserIdList;
	
	public class UserId{
		
		private String Member_Account;
		
		private String Role;	// 身份：Owner/Admin/Member/NotMember
		
		public String getMember_Account() {
			return Member_Account;
		}
		public void setMember_Account(String member_Account) {
			Member_Account = member_Account;
		}
		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}
	}

	public List<UserId> getUserIdList() {
		return UserIdList;
	}

	public void setUserIdList(List<UserId> userIdList) {
		UserIdList = userIdList;
	}
	
}
