/**
 * 
 */
package com.logaa.tim.result.openim_im_push;

import com.logaa.tim.result.TimBaseResult;

/**
 * 推送
 * @author logaa
 *
 */
public class ImPushResult extends TimBaseResult{

	private String TaskId;	// 推送任务 ID。可用于推送任务状态查询。

	public String getTaskId() {
		return TaskId;
	}

	public void setTaskId(String taskId) {
		TaskId = taskId;
	}
	
}
