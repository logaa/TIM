/**
 * 
 */
package com.logaa.tim.result.sns;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 拉取黑名单
 * @author logaa
 *
 */
public class BlackListGetResult extends TimBaseResult{

	private List<BlackList> BlackListItem;
	
	private Integer StartIndex;	// 	下页拉取的起始位置，0 表示已拉完。
	
	private Integer CurruentSequence;	// 黑名单最新的 Seq。
	
	public class BlackList{
		
		private String Black_Account;
		
		private Long BlackTimeStamp;	// 添加黑名单的时间。

		public String getBlack_Account() {
			return Black_Account;
		}

		public void setBlack_Account(String black_Account) {
			Black_Account = black_Account;
		}

		public Long getBlackTimeStamp() {
			return BlackTimeStamp;
		}

		public void setBlackTimeStamp(Long blackTimeStamp) {
			BlackTimeStamp = blackTimeStamp;
		}
		
	}

	public List<BlackList> getBlackListItem() {
		return BlackListItem;
	}

	public void setBlackListItem(List<BlackList> blackListItem) {
		BlackListItem = blackListItem;
	}

	public Integer getStartIndex() {
		return StartIndex;
	}

	public void setStartIndex(Integer startIndex) {
		StartIndex = startIndex;
	}

	public Integer getCurruentSequence() {
		return CurruentSequence;
	}

	public void setCurruentSequence(Integer curruentSequence) {
		CurruentSequence = curruentSequence;
	}
	
}
