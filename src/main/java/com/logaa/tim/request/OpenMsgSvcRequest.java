/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.open_msg_svc.GetHistoryResult;

import cn.hutool.json.JSONUtil;

/**
 * 数据下载
 * @author logaa
 *
 */
public class OpenMsgSvcRequest extends TimBaseHttpRequest{

	/**
	 * 消息记录下载
	 * @param body
	 */
	public static GetHistoryResult getHistory(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get_history, body)).toBean(GetHistoryResult.class);
	}
}
