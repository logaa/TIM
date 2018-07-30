/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 增加群组成员
 * @author logaa
 *
 */
public class AddGroupMemberResult extends TimBaseResult{

	private List<Member> MemberList;
	
	public class Member{
		
		private String Member_Account;	// 返回的群成员帐号
		
		private Integer Result;	// 加人结果：0 为失败；1 为成功；2 为已经是群成员

		public String getMember_Account() {
			return Member_Account;
		}

		public void setMember_Account(String member_Account) {
			Member_Account = member_Account;
		}

		public Integer getResult() {
			return Result;
		}

		public void setResult(Integer result) {
			Result = result;
		}
	}

	public List<Member> getMemberList() {
		return MemberList;
	}

	public void setMemberList(List<Member> memberList) {
		MemberList = memberList;
	}
	
}
