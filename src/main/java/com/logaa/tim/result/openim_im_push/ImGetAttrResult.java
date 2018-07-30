/**
 * 
 */
package com.logaa.tim.result.openim_im_push;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取用户属性
 * @author logaa
 *
 */
public class ImGetAttrResult extends TimBaseResult{

	private List<UserAttr> UserAttrs;
	
	public class UserAttr{
		
		private String To_Account;
		
		private Attrs Attrs;

		public String getTo_Account() {
			return To_Account;
		}

		public void setTo_Account(String to_Account) {
			To_Account = to_Account;
		}

		public Attrs getAttrs() {
			return Attrs;
		}

		public void setAttrs(Attrs attrs) {
			Attrs = attrs;
		}
	}
	
	public class Attrs{
		
		private String sex;
		
		private String city;

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	}

	public List<UserAttr> getUserAttrs() {
		return UserAttrs;
	}

	public void setUserAttrs(List<UserAttr> userAttrs) {
		UserAttrs = userAttrs;
	}
	
}
