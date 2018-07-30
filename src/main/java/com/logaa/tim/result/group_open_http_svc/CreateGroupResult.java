/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import com.logaa.tim.result.TimBaseResult;

/**
 * 创建群组
 * @author logaa
 *
 */
public class CreateGroupResult extends TimBaseResult{
	
	private String GroupId;

	public String getGroupId() {
		return GroupId;
	}

	public void setGroupId(String groupId) {
		GroupId = groupId;
	}
	
}
