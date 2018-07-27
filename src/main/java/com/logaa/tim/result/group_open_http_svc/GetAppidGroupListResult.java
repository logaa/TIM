package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取APP中的所有群组
 * @author logaa
 *
 */
public class GetAppidGroupListResult extends TimBaseResult{

	private List<Group> GroupIdList;
	
	public class Group{
		
		private String GroupId;

		public String getGroupId() {
			return GroupId;
		}

		public void setGroupId(String groupId) {
			GroupId = groupId;
		}
	}

	public List<Group> getGroupIdList() {
		return GroupIdList;
	}

	public void setGroupIdList(List<Group> groupIdList) {
		GroupIdList = groupIdList;
	}
}
