/**
 * 
 */
package com.logaa.tim.result.openim_im_push;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取推送报告
 * @author logaa
 *
 */
public class ImGetPushReportResult extends TimBaseResult{

	private List<Report> Reports;
	
	public class Report{
		
		private String TaskId;
		
		private Integer Status;	// 0(未处理) / 1（推送中) / 2（推送完成） 。注意：推送完成不代表完全推送成功，具体发送情况见Finished和Total字段数据
		
		private String StartTime;	// 推送开始时间，Status不为0，才有这个字段。
		
		private Integer Finished; 	// 已完成推送人数。
		
		private Integer Total;	// 需推送总人数。

		public String getTaskId() {
			return TaskId;
		}

		public void setTaskId(String taskId) {
			TaskId = taskId;
		}

		public Integer getStatus() {
			return Status;
		}

		public void setStatus(Integer status) {
			Status = status;
		}

		public String getStartTime() {
			return StartTime;
		}

		public void setStartTime(String startTime) {
			StartTime = startTime;
		}

		public Integer getFinished() {
			return Finished;
		}

		public void setFinished(Integer finished) {
			Finished = finished;
		}

		public Integer getTotal() {
			return Total;
		}

		public void setTotal(Integer total) {
			Total = total;
		}
	}

	public List<Report> getReports() {
		return Reports;
	}

	public void setReports(List<Report> reports) {
		Reports = reports;
	}
}
