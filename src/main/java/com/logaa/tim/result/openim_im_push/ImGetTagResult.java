/**
 * 
 */
package com.logaa.tim.result.openim_im_push;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取用户标签
 * @author logaa
 *
 */
public class ImGetTagResult extends TimBaseResult{
	
	private List<UserTag> UserTags;
	
	public class UserTag{
		
		private String To_Account;
		
		private List<String> tags;

		public String getTo_Account() {
			return To_Account;
		}

		public void setTo_Account(String to_Account) {
			To_Account = to_Account;
		}

		public List<String> getTags() {
			return tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}
		
	}

	public List<UserTag> getUserTags() {
		return UserTags;
	}

	public void setUserTags(List<UserTag> userTags) {
		UserTags = userTags;
	}

}
