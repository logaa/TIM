package com.logaa.tim;

import com.logaa.tim.result.group_open_http_svc.GetAppidGroupListResult;

import junit.framework.TestCase;

public class TimHttpRequestTest extends TestCase {

	public void testPostApiEnumString() {
		String result = TimHttpRequest.post(ApiEnum.get_appid_group_list);
		System.out.println(result);
	}
	
	public void testPostApiEnumString1() {
		GetAppidGroupListResult result = TimHttpRequest.getAppidGroupList();
		System.out.println(result.toString());
	}

	public void testPostApiEnum() {
		fail("Not yet implemented");
	}

}
