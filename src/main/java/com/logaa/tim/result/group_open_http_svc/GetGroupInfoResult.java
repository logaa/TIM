/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取群组详细资料
 * @author logaa
 *
 */
public class GetGroupInfoResult extends TimBaseResult{

	private List<GroupInfo> GroupInfo;
	
	public class GroupInfo{
		
		private String GroupId;
		private Integer ErrorCode;  // 针对该群组的返回结果
		private String ErrorInfo;  // 针对该群组的返回结果
		private String Type;  // 群组类型
		private String Name;  // 群组名称
		private String Introduction;  // 群组简介
		private String Notification;  // 群组通知
		private String FaceUrl;  // 群组头像
		private String Owner_Account;  // 群主 ID
		private Long CreateTime;  // 群组创建时间（UTC 时间）
		private Long LastInfoTime;  // 最后群资料变更时间（UTC 时间）
		private Long LastMsgTime;  // 群内最后一条消息的时间（UTC 时间）
		private Integer NextMsgSeq;
		private Integer MemberNum;  // 当前群成员数量
		private Integer MaxMemberNum;  // 最大群成员数量
		private String ApplyJoinOption;  // 申请加群处理方式
		private String ShutUpAllMember;  // 群全员禁言状态
		
		// ... TODO
		
		public String getGroupId() {
			return GroupId;
		}
		public void setGroupId(String groupId) {
			GroupId = groupId;
		}
		public Integer getErrorCode() {
			return ErrorCode;
		}
		public void setErrorCode(Integer errorCode) {
			ErrorCode = errorCode;
		}
		public String getErrorInfo() {
			return ErrorInfo;
		}
		public void setErrorInfo(String errorInfo) {
			ErrorInfo = errorInfo;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getIntroduction() {
			return Introduction;
		}
		public void setIntroduction(String introduction) {
			Introduction = introduction;
		}
		public String getNotification() {
			return Notification;
		}
		public void setNotification(String notification) {
			Notification = notification;
		}
		public String getFaceUrl() {
			return FaceUrl;
		}
		public void setFaceUrl(String faceUrl) {
			FaceUrl = faceUrl;
		}
		public String getOwner_Account() {
			return Owner_Account;
		}
		public void setOwner_Account(String owner_Account) {
			Owner_Account = owner_Account;
		}
		public Long getCreateTime() {
			return CreateTime;
		}
		public void setCreateTime(Long createTime) {
			CreateTime = createTime;
		}
		public Long getLastInfoTime() {
			return LastInfoTime;
		}
		public void setLastInfoTime(Long lastInfoTime) {
			LastInfoTime = lastInfoTime;
		}
		public Long getLastMsgTime() {
			return LastMsgTime;
		}
		public void setLastMsgTime(Long lastMsgTime) {
			LastMsgTime = lastMsgTime;
		}
		public Integer getNextMsgSeq() {
			return NextMsgSeq;
		}
		public void setNextMsgSeq(Integer nextMsgSeq) {
			NextMsgSeq = nextMsgSeq;
		}
		public Integer getMemberNum() {
			return MemberNum;
		}
		public void setMemberNum(Integer memberNum) {
			MemberNum = memberNum;
		}
		public Integer getMaxMemberNum() {
			return MaxMemberNum;
		}
		public void setMaxMemberNum(Integer maxMemberNum) {
			MaxMemberNum = maxMemberNum;
		}
		public String getApplyJoinOption() {
			return ApplyJoinOption;
		}
		public void setApplyJoinOption(String applyJoinOption) {
			ApplyJoinOption = applyJoinOption;
		}
		public String getShutUpAllMember() {
			return ShutUpAllMember;
		}
		public void setShutUpAllMember(String shutUpAllMember) {
			ShutUpAllMember = shutUpAllMember;
		}
	}

	public List<GroupInfo> getGroupInfo() {
		return GroupInfo;
	}

	public void setGroupInfo(List<GroupInfo> groupInfo) {
		GroupInfo = groupInfo;
	}
	
}
