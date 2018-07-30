/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.openim_sendmsg.BatchsendmsgResult;
import com.logaa.tim.result.openim_sendmsg.SendmsgResult;

import cn.hutool.json.JSONUtil;

/**
 * 单发消息
 * @author logaa
 *
 */
public class OpenimSendmsgRequest extends TimBaseHttpRequest{

	/**
	 * 单发单聊消息
	 * 注意，当使用服务端集成 REST API 发送单聊消息时，存在是否将消息同步至发送方（管理员账户或者由管理员指定的某账户）问题，同步方式包括在线终端和漫游，REST API 提供 SyncOtherMachine 参数用于说明是否进行同步
	 * @param body
	 */
	public static SendmsgResult sendmsg(String body) {
		return JSONUtil.parseObj(post(ApiEnum.sendmsg, body)).toBean(SendmsgResult.class);
	}
	
	/**
	 * 批量发单聊消息
	 * 注意，当使用服务端集成 REST API 发送批量消息时，存在是否将消息同步至发送方（管理员账户或者由管理员指定的某账户）问题，同步方式包括在线终端和漫游，REST API 提供 SyncOtherMachine 参数用于说明是否进行同步
	 * @param body
	 */
	public static BatchsendmsgResult batchsendmsg(String body) {
		return JSONUtil.parseObj(post(ApiEnum.batchsendmsg, body)).toBean(BatchsendmsgResult.class);
	}
	
	/**
	 * 导入单聊消息
	 * @param body
	 */
	public static TimBaseResult importmsg(String body) {
		return JSONUtil.parseObj(post(ApiEnum.importmsg, body)).toBean(TimBaseResult.class);
	}
}
