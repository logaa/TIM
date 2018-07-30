package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.openconfigsvr.GetappinfoResult;
import com.logaa.tim.result.openconfigsvr.GetnospeakingResult;

import cn.hutool.json.JSONUtil;

/**
 * 全局禁言
 * @author logaa
 *
 */
public class OpenconfigsvrRequest extends TimBaseHttpRequest{

	/**
	 * 设置全局禁言
	 * @param body
	 */
	public static TimBaseResult setnospeaking(String body) {
		return JSONUtil.parseObj(post(ApiEnum.setnospeaking, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 查询全局禁言
	 * @param body
	 */
	public static GetnospeakingResult getnospeaking(String body) {
		return JSONUtil.parseObj(post(ApiEnum.getnospeaking, body)).toBean(GetnospeakingResult.class);
	}
	
	/**
	 * 拉取运营数据
	 * @param body
	 */
	public static GetappinfoResult getappinfo(String body) {
		return JSONUtil.parseObj(post(ApiEnum.getappinfo, body)).toBean(GetappinfoResult.class);
	}
}
