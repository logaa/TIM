/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.profile.PortraitGetResult;

import cn.hutool.json.JSONUtil;

/**
 * 用户资料
 * @author logaa
 *
 */
public class ProfileRequest extends TimBaseHttpRequest{

	/**
	 * 拉取资料
	 * @param body
	 */
	public static PortraitGetResult portraitGet(String body) {
		return JSONUtil.parseObj(post(ApiEnum.portrait_get, body)).toBean(PortraitGetResult.class);
	}
	
	/**
	 * 设置资料
	 * @param body
	 */
	public static TimBaseResult portraitSet(String body) {
		return JSONUtil.parseObj(post(ApiEnum.portrait_set, body)).toBean(TimBaseResult.class);
	}
}
