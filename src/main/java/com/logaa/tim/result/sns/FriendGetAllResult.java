/**
 * 
 */
package com.logaa.tim.result.sns;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 拉取好友
 * @author logaa
 *
 */
public class FriendGetAllResult extends TimBaseResult{

	/**
	 * 	是否需要全量更新：
	 *	"GetAll_Type_YES" 表示需要全量更新；
	 *	"GetAll_Type_NO"表示不需要全量更新。
	 */
	private String NeedUpdateAll;
	
	private Integer TimeStampNow;  // 本次拉取的时间戳，客户端需要保存该时间，下次请求时通过 TimeStamp 字段返回给后台。
	
	private Integer StartIndex;	// 	下页拉取的起始位置。
	
	private List<Info> InfoItem;
	
	private Integer CurrentStandardSequence;	// 本次拉取标配关系链的 Sequence，客户端需要保存该 Sequence，下次请求时通过 LastStandardSequence 字段返回给后台
	
	private Integer FriendNum;	//	好友总数
	
	public class Info{
		
		private String Info_Account;	// 好友的 Identifier
		
		private List<SnsProfile> SnsProfileItem;

		public String getInfo_Account() {
			return Info_Account;
		}

		public void setInfo_Account(String info_Account) {
			Info_Account = info_Account;
		}

		public List<SnsProfile> getSnsProfileItem() {
			return SnsProfileItem;
		}

		public void setSnsProfileItem(List<SnsProfile> snsProfileItem) {
			SnsProfileItem = snsProfileItem;
		}
	}
	
	public class SnsProfile{
		
		private String Tag;	// 好友的资料字段或好友字段的名称。

		private String Value;	// 好友的资料字段或好友字段的值

		public String getTag() {
			return Tag;
		}

		public void setTag(String tag) {
			Tag = tag;
		}

		public String getValue() {
			return Value;
		}

		public void setValue(String value) {
			Value = value;
		}
	}

	public String getNeedUpdateAll() {
		return NeedUpdateAll;
	}

	public void setNeedUpdateAll(String needUpdateAll) {
		NeedUpdateAll = needUpdateAll;
	}

	public Integer getTimeStampNow() {
		return TimeStampNow;
	}

	public void setTimeStampNow(Integer timeStampNow) {
		TimeStampNow = timeStampNow;
	}

	public Integer getStartIndex() {
		return StartIndex;
	}

	public void setStartIndex(Integer startIndex) {
		StartIndex = startIndex;
	}

	public List<Info> getInfoItem() {
		return InfoItem;
	}

	public void setInfoItem(List<Info> infoItem) {
		InfoItem = infoItem;
	}

	public Integer getCurrentStandardSequence() {
		return CurrentStandardSequence;
	}

	public void setCurrentStandardSequence(Integer currentStandardSequence) {
		CurrentStandardSequence = currentStandardSequence;
	}

	public Integer getFriendNum() {
		return FriendNum;
	}

	public void setFriendNum(Integer friendNum) {
		FriendNum = friendNum;
	}
}
