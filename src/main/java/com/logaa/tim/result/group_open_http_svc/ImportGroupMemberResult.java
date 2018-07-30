/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 导入群成员
 * @author logaa
 *
 */
public class ImportGroupMemberResult extends TimBaseResult{

	private List<Member> MemberList;
	
	public class Member{
		
		private String Member_Account;
		
		private Integer Result;	// 导入结果：0为失败；1为成功；2表示已经是群成员

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
