/**
 * 
 */
package com.logaa.tim.result.im_open_login_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * @author logaa
 *
 */
public class MultiaccountImportResult extends TimBaseResult{

	private List<String> FailAccounts;	// 	导入失败的帐号列表

	public List<String> getFailAccounts() {
		return FailAccounts;
	}

	public void setFailAccounts(List<String> failAccounts) {
		FailAccounts = failAccounts;
	}
	
}
