/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.sns.BlackListGetResult;
import com.logaa.tim.result.sns.FriendResult;
import com.logaa.tim.result.sns.FriendGetAllResult;
import com.logaa.tim.result.sns.GroupDeleteResult;

import cn.hutool.json.JSONUtil;

/**
 * 关系链
 * @author logaa
 *
 */
public class SnsRequest extends TimBaseHttpRequest{

	/**
	 * 添加好友
	 * @param body
	 */
	public static FriendResult friendAdd(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_add, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 导入好友
	 * @param body
	 */
	public static FriendResult friendImport(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_import, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 更新好友
	 * @param body
	 */
	public static FriendResult friendUpdate(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_update, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 删除好友
	 * @param body
	 */
	public static FriendResult friendDelete(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_delete, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 删除所有好友
	 * @param body
	 */
	public static TimBaseResult friendDeleteAll(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_delete_all, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 校验好友
	 * @param body
	 */
	public static FriendResult friendCheck(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_check, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 拉取好友
	 * @param body
	 */
	public static FriendGetAllResult friendGetAll(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_get_all, body)).toBean(FriendGetAllResult.class);
	}
	
	/**
	 * 拉取指定好友
	 * @param body
	 */
	public static FriendResult friendGetList(String body) {
		return JSONUtil.parseObj(post(ApiEnum.friend_get_list, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 添加黑名单
	 * @param body
	 */
	public static FriendResult blackListAdd(String body) {
		return JSONUtil.parseObj(post(ApiEnum.black_list_add, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 删除黑名单
	 * @param body
	 */
	public static FriendResult blackListDelete(String body) {
		return JSONUtil.parseObj(post(ApiEnum.black_list_delete, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 拉取黑名单
	 * @param body
	 */
	public static BlackListGetResult blackListGet(String body) {
		return JSONUtil.parseObj(post(ApiEnum.black_list_get, body)).toBean(BlackListGetResult.class);
	}
	
	/**
	 * 校验黑名单
	 * @param body
	 */
	public static FriendResult blackListCheck(String body) {
		return JSONUtil.parseObj(post(ApiEnum.black_list_check, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 添加分组
	 * @param body
	 */
	public static FriendResult groupAdd(String body) {
		return JSONUtil.parseObj(post(ApiEnum.group_add, body)).toBean(FriendResult.class);
	}
	
	/**
	 * 删除分组
	 * @param body
	 */
	public static GroupDeleteResult groupDelete(String body) {
		return JSONUtil.parseObj(post(ApiEnum.group_delete, body)).toBean(GroupDeleteResult.class);
	}
}
