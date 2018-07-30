/**
 * 
 */
package com.logaa.tim.result.sns;

import com.logaa.tim.result.TimBaseResult;

/**
 * 删除分组
 * @author logaa
 *
 */
public class GroupDeleteResult extends TimBaseResult{

	 private Integer CurrentSequence;

	public Integer getCurrentSequence() {
		return CurrentSequence;
	}

	public void setCurrentSequence(Integer currentSequence) {
		CurrentSequence = currentSequence;
	}
	 
}
