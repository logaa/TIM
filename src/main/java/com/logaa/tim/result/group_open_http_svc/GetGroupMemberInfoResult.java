/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取群组成员详细资料
 * @author logaa
 *
 */
public class GetGroupMemberInfoResult extends TimBaseResult{

	private Integer MemberNum;
	
	private List<Member> MemberList;
	
	public class Member{
		
		private String Member_Account;
		private String Role;
		private Long JoinTime;	// 入群时间
		private Integer MsgSeq;
		private Long LastSendMsgTime;	// 最后一次发消息的时间
		private Long ShutUpUntil;	// 禁言截至时间（秒数）
		private Object AppMemberDefinedData;
		
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
		public Long getJoinTime() {
			return JoinTime;
		}
		public void setJoinTime(Long joinTime) {
			JoinTime = joinTime;
		}
		public Integer getMsgSeq() {
			return MsgSeq;
		}
		public void setMsgSeq(Integer msgSeq) {
			MsgSeq = msgSeq;
		}
		public Long getLastSendMsgTime() {
			return LastSendMsgTime;
		}
		public void setLastSendMsgTime(Long lastSendMsgTime) {
			LastSendMsgTime = lastSendMsgTime;
		}
		public Long getShutUpUntil() {
			return ShutUpUntil;
		}
		public void setShutUpUntil(Long shutUpUntil) {
			ShutUpUntil = shutUpUntil;
		}
		public Object getAppMemberDefinedData() {
			return AppMemberDefinedData;
		}
		public void setAppMemberDefinedData(Object appMemberDefinedData) {
			AppMemberDefinedData = appMemberDefinedData;
		}
	}

	public Integer getMemberNum() {
		return MemberNum;
	}

	public void setMemberNum(Integer memberNum) {
		MemberNum = memberNum;
	}

	public List<Member> getMemberList() {
		return MemberList;
	}

	public void setMemberList(List<Member> memberList) {
		MemberList = memberList;
	}
	
}
