/**
 * 
 */
package com.logaa.tim.result.openconfigsvr;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 拉取运营数据
 * @author logaa
 *
 */
public class GetappinfoResult extends TimBaseResult{

	private List<Result> Result;
	
	public class Result{
		
		private String APNSMsgNum;	// APNS 推送数	
		
		private String ActiveUserNum;	// 活跃用户数
		
		private String AppId;	// 	应用 AppId
		
		private String AppName;	// 	应用名称
		
		private String C2CAPNSMsgNum;	// APNS 推送数（C2C）
		
		private String C2CDownMsgNum;	// 	下行消息数（C2C）
		
		private String C2CSendMsgUserNum;	// 发消息人数（C2C）
		
		private String C2CUpMsgNum;	// 上行消息数（C2C）
		
		private String CallBackReq;	// 	回调请求数
		
		private String CallBackRsp;	// 	回调应答数
		
		private String ChainDecrease;	// 关系链对数删除量
		
		private String ChainIncrease;	// 	关系链对数增加量
		
		private String Company;	// 所属客户名称
		
		private String Date; // 20160605
		
		private String DownMsgNum;	// 下行消息数
		
		private String GroupAPNSMsgNum;	// APNS推送数（群）
		
		private String GroupAllGroupNum;	// 	累计群组数
		
		private String GroupDestroyGroupNum;	// 	解散群个数
		
		private String GroupDownMsgNum;	// 	下行消息数（群）
		
		private String GroupJoinGroupTimes;	// 入群总数
		
		private String GroupNewGroupNum;	// 新增群组数
		
		private String GroupQuitGroupTimes;	// 退群总数
		
		private String GroupSendMsgGroupNum;	// 发消息群组数
		
		private String GroupSendMsgUserNum;	// 发消息人数（群）
		
		private String GroupUpMsgNum;	// 上行消息数（群）
		
		private String LoginTimes;	// 登录次数
		
		private String LoginUserNum;	// 登录人数
		
		private String MaxOnlineNum;	// 	最高在线人数
		
		private String QQ;	// 所属客户 QQ
		
		private String RegistUserNumOneDay;	// 	新增注册人数
		
		private String RegistUserNumTotal;	// 累计注册人数
		
		private String SendMsgUserNum;	// 发消息人数
		
		private String TextMsgInNum;	// 文字短信国内下发量
		
		private String TextMsgOutNum;	// 文字短信国外下发量
		
		private String UpMsgNum;	// 上行消息数
		
		private String VoiceMsgInNum;	// 国内语音验证码下发回调量
		
		private String VoiceMsgOutNum;	// 	国外语音验证码下发回调量

		public String getAPNSMsgNum() {
			return APNSMsgNum;
		}

		public void setAPNSMsgNum(String aPNSMsgNum) {
			APNSMsgNum = aPNSMsgNum;
		}

		public String getActiveUserNum() {
			return ActiveUserNum;
		}

		public void setActiveUserNum(String activeUserNum) {
			ActiveUserNum = activeUserNum;
		}

		public String getAppId() {
			return AppId;
		}

		public void setAppId(String appId) {
			AppId = appId;
		}

		public String getAppName() {
			return AppName;
		}

		public void setAppName(String appName) {
			AppName = appName;
		}

		public String getC2CAPNSMsgNum() {
			return C2CAPNSMsgNum;
		}

		public void setC2CAPNSMsgNum(String c2capnsMsgNum) {
			C2CAPNSMsgNum = c2capnsMsgNum;
		}

		public String getC2CDownMsgNum() {
			return C2CDownMsgNum;
		}

		public void setC2CDownMsgNum(String c2cDownMsgNum) {
			C2CDownMsgNum = c2cDownMsgNum;
		}

		public String getC2CSendMsgUserNum() {
			return C2CSendMsgUserNum;
		}

		public void setC2CSendMsgUserNum(String c2cSendMsgUserNum) {
			C2CSendMsgUserNum = c2cSendMsgUserNum;
		}

		public String getC2CUpMsgNum() {
			return C2CUpMsgNum;
		}

		public void setC2CUpMsgNum(String c2cUpMsgNum) {
			C2CUpMsgNum = c2cUpMsgNum;
		}

		public String getCallBackReq() {
			return CallBackReq;
		}

		public void setCallBackReq(String callBackReq) {
			CallBackReq = callBackReq;
		}

		public String getCallBackRsp() {
			return CallBackRsp;
		}

		public void setCallBackRsp(String callBackRsp) {
			CallBackRsp = callBackRsp;
		}

		public String getChainDecrease() {
			return ChainDecrease;
		}

		public void setChainDecrease(String chainDecrease) {
			ChainDecrease = chainDecrease;
		}

		public String getChainIncrease() {
			return ChainIncrease;
		}

		public void setChainIncrease(String chainIncrease) {
			ChainIncrease = chainIncrease;
		}

		public String getCompany() {
			return Company;
		}

		public void setCompany(String company) {
			Company = company;
		}

		public String getDate() {
			return Date;
		}

		public void setDate(String date) {
			Date = date;
		}

		public String getDownMsgNum() {
			return DownMsgNum;
		}

		public void setDownMsgNum(String downMsgNum) {
			DownMsgNum = downMsgNum;
		}

		public String getGroupAPNSMsgNum() {
			return GroupAPNSMsgNum;
		}

		public void setGroupAPNSMsgNum(String groupAPNSMsgNum) {
			GroupAPNSMsgNum = groupAPNSMsgNum;
		}

		public String getGroupAllGroupNum() {
			return GroupAllGroupNum;
		}

		public void setGroupAllGroupNum(String groupAllGroupNum) {
			GroupAllGroupNum = groupAllGroupNum;
		}

		public String getGroupDestroyGroupNum() {
			return GroupDestroyGroupNum;
		}

		public void setGroupDestroyGroupNum(String groupDestroyGroupNum) {
			GroupDestroyGroupNum = groupDestroyGroupNum;
		}

		public String getGroupDownMsgNum() {
			return GroupDownMsgNum;
		}

		public void setGroupDownMsgNum(String groupDownMsgNum) {
			GroupDownMsgNum = groupDownMsgNum;
		}

		public String getGroupJoinGroupTimes() {
			return GroupJoinGroupTimes;
		}

		public void setGroupJoinGroupTimes(String groupJoinGroupTimes) {
			GroupJoinGroupTimes = groupJoinGroupTimes;
		}

		public String getGroupNewGroupNum() {
			return GroupNewGroupNum;
		}

		public void setGroupNewGroupNum(String groupNewGroupNum) {
			GroupNewGroupNum = groupNewGroupNum;
		}

		public String getGroupQuitGroupTimes() {
			return GroupQuitGroupTimes;
		}

		public void setGroupQuitGroupTimes(String groupQuitGroupTimes) {
			GroupQuitGroupTimes = groupQuitGroupTimes;
		}

		public String getGroupSendMsgGroupNum() {
			return GroupSendMsgGroupNum;
		}

		public void setGroupSendMsgGroupNum(String groupSendMsgGroupNum) {
			GroupSendMsgGroupNum = groupSendMsgGroupNum;
		}

		public String getGroupSendMsgUserNum() {
			return GroupSendMsgUserNum;
		}

		public void setGroupSendMsgUserNum(String groupSendMsgUserNum) {
			GroupSendMsgUserNum = groupSendMsgUserNum;
		}

		public String getGroupUpMsgNum() {
			return GroupUpMsgNum;
		}

		public void setGroupUpMsgNum(String groupUpMsgNum) {
			GroupUpMsgNum = groupUpMsgNum;
		}

		public String getLoginTimes() {
			return LoginTimes;
		}

		public void setLoginTimes(String loginTimes) {
			LoginTimes = loginTimes;
		}

		public String getLoginUserNum() {
			return LoginUserNum;
		}

		public void setLoginUserNum(String loginUserNum) {
			LoginUserNum = loginUserNum;
		}

		public String getMaxOnlineNum() {
			return MaxOnlineNum;
		}

		public void setMaxOnlineNum(String maxOnlineNum) {
			MaxOnlineNum = maxOnlineNum;
		}

		public String getQQ() {
			return QQ;
		}

		public void setQQ(String qQ) {
			QQ = qQ;
		}

		public String getRegistUserNumOneDay() {
			return RegistUserNumOneDay;
		}

		public void setRegistUserNumOneDay(String registUserNumOneDay) {
			RegistUserNumOneDay = registUserNumOneDay;
		}

		public String getRegistUserNumTotal() {
			return RegistUserNumTotal;
		}

		public void setRegistUserNumTotal(String registUserNumTotal) {
			RegistUserNumTotal = registUserNumTotal;
		}

		public String getSendMsgUserNum() {
			return SendMsgUserNum;
		}

		public void setSendMsgUserNum(String sendMsgUserNum) {
			SendMsgUserNum = sendMsgUserNum;
		}

		public String getTextMsgInNum() {
			return TextMsgInNum;
		}

		public void setTextMsgInNum(String textMsgInNum) {
			TextMsgInNum = textMsgInNum;
		}

		public String getTextMsgOutNum() {
			return TextMsgOutNum;
		}

		public void setTextMsgOutNum(String textMsgOutNum) {
			TextMsgOutNum = textMsgOutNum;
		}

		public String getUpMsgNum() {
			return UpMsgNum;
		}

		public void setUpMsgNum(String upMsgNum) {
			UpMsgNum = upMsgNum;
		}

		public String getVoiceMsgInNum() {
			return VoiceMsgInNum;
		}

		public void setVoiceMsgInNum(String voiceMsgInNum) {
			VoiceMsgInNum = voiceMsgInNum;
		}

		public String getVoiceMsgOutNum() {
			return VoiceMsgOutNum;
		}

		public void setVoiceMsgOutNum(String voiceMsgOutNum) {
			VoiceMsgOutNum = voiceMsgOutNum;
		}
		
	}

	public List<Result> getResult() {
		return Result;
	}

	public void setResult(List<Result> result) {
		Result = result;
	}
	
}
