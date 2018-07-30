/**
 * 
 */
package com.logaa.tim.result.group_open_http_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取用户所加入的群组
 * @author logaa
 *
 */
public class GetJoinedGroupListResult extends TimBaseResult{

	private Integer TotalCount;	// 不论Limit和Offset如何设置，该值总是满足条件的群组总数
	
	private List<GroupId> GroupIdList;
	
	public class GroupId{
		
		private String GroupId;
		
		// ... TODO

		public String getGroupId() {
			return GroupId;
		}

		public void setGroupId(String groupId) {
			GroupId = groupId;
		}
	}

	public Integer getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(Integer totalCount) {
		TotalCount = totalCount;
	}

	public List<GroupId> getGroupIdList() {
		return GroupIdList;
	}

	public void setGroupIdList(List<GroupId> groupIdList) {
		GroupIdList = groupIdList;
	}
	
}
