/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.openim_querystate.QuerystateResult;

import cn.hutool.json.JSONUtil;

/**
 * 在线状态
 * @author logaa
 *
 */
public class OpenimQuerystateRequest extends TimBaseHttpRequest{

	/**
	 * 获取用户在线状态
	 * @param body
	 */
	public static QuerystateResult querystate(String body) {
		return JSONUtil.parseObj(post(ApiEnum.querystate, body)).toBean(QuerystateResult.class);
	}
}
