package com.logaa.tim.request;


import com.logaa.tim.ApiEnum;
import com.logaa.tim.Constants;
import com.logaa.tim.TLSSignature;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

public class TimBaseHttpRequest {

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
	
}
