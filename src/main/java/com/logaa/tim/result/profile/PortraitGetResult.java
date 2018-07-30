/**
 * 
 */
package com.logaa.tim.result.profile;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 拉取资料
 * @author logaa
 *
 */
public class PortraitGetResult extends TimBaseResult{

	private List<UserProfile> UserProfileItem;
	
	private List<String> Fail_Account;
	
	private List<String> Invalid_Account;
	
	public class UserProfile{
		
		private String To_Account;
		
		private List<Profile> ProfileItem;
		
		private Integer ResultCode;
		
		private String ResultInfo;
		
		public String getTo_Account() {
			return To_Account;
		}
		public void setTo_Account(String to_Account) {
			To_Account = to_Account;
		}
		public List<Profile> getProfileItem() {
			return ProfileItem;
		}
		public void setProfileItem(List<Profile> profileItem) {
			ProfileItem = profileItem;
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
	}
	
	public class Profile{
		
		private String Tag;
		
		private String Value;

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

	public List<UserProfile> getUserProfileItem() {
		return UserProfileItem;
	}

	public void setUserProfileItem(List<UserProfile> userProfileItem) {
		UserProfileItem = userProfileItem;
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
