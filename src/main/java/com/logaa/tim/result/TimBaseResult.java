package com.logaa.tim.result;

public class TimBaseResult {

	private String ActionStatus;
	
	private String ErrorInfo;
	
	private String ErrorDisplay;
	
	private Integer ErrorCode;

	public String getActionStatus() {
		return ActionStatus;
	}

	public void setActionStatus(String actionStatus) {
		ActionStatus = actionStatus;
	}

	public String getErrorInfo() {
		return ErrorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		ErrorInfo = errorInfo;
	}

	public String getErrorDisplay() {
		return ErrorDisplay;
	}

	public void setErrorDisplay(String errorDisplay) {
		ErrorDisplay = errorDisplay;
	}

	public Integer getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(Integer errorCode) {
		ErrorCode = errorCode;
	}
}
