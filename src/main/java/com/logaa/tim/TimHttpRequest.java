package com.logaa.tim;


import com.logaa.tim.result.group_open_http_svc.GetAppidGroupListResult;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

public class TimHttpRequest {

	public static String post(ApiEnum api, String body) {
		StringBuilder sb = new StringBuilder(api.getUrl());
		sb.append("?usersig=" + TLSSignature.genTLSSigna(Constants.DEF_IDENTIFIER))
			.append("&apn=1")
			.append("&identifier=" + Constants.DEF_IDENTIFIER)
			.append("&sdkappid=" + Constants.APPID)
			.append("&contenttype=json");
		return HttpUtil.post(sb.toString(), body);
	}
	
	public static String post(ApiEnum api) {
		return post(api, JSONUtil.createObj().toString());
	}
	
	/**
	 * 获取APP中的所有群组
	 * @return
	 */
	public static GetAppidGroupListResult getAppidGroupList(){
		return JSONUtil.parseObj(post(ApiEnum.get_appid_group_list)).toBean(GetAppidGroupListResult.class);
	}
	
}
