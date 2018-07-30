package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.group_open_http_svc.AddGroupMemberResult;
import com.logaa.tim.result.group_open_http_svc.CreateGroupResult;
import com.logaa.tim.result.group_open_http_svc.GetAppidGroupListResult;
import com.logaa.tim.result.group_open_http_svc.GetGroupInfoResult;
import com.logaa.tim.result.group_open_http_svc.GetGroupMemberInfoResult;
import com.logaa.tim.result.group_open_http_svc.GetGroupShuttedUinResult;
import com.logaa.tim.result.group_open_http_svc.GetJoinedGroupListResult;
import com.logaa.tim.result.group_open_http_svc.GetRoleInGroupResult;
import com.logaa.tim.result.group_open_http_svc.GroupMsgGetSimpleResult;
import com.logaa.tim.result.group_open_http_svc.GroupMsgRecallResult;
import com.logaa.tim.result.group_open_http_svc.ImportGroupMemberResult;
import com.logaa.tim.result.group_open_http_svc.ImportGroupMsgResult;
import com.logaa.tim.result.group_open_http_svc.ImportGroupResult;
import com.logaa.tim.result.group_open_http_svc.SendGroupMsgResult;

import cn.hutool.json.JSONUtil;

/**
 * 群组系统
 * @author logaa
 *
 */
public class GroupOpenHttpSvcRequest extends TimBaseHttpRequest{

	/**
	 * 获取APP中的所有群组
	 * @return
	 */
	public static GetAppidGroupListResult getAppidGroupList(){
		return JSONUtil.parseObj(post(ApiEnum.get_appid_group_list)).toBean(GetAppidGroupListResult.class);
	}
	
	/**
	 * 创建群组
	 * 说明：创建互动直播聊天室和在线成员广播大群时不能拉人入群，如果创建时指定了拉入的群成员会返回 10007 错误。用户加入互动直播聊天室和在线成员广播大群的唯一方式是用户申请加群。
	 * @param body
	 * @return
	 */
	public static CreateGroupResult createGroup(String body) {
		return JSONUtil.parseObj(post(ApiEnum.create_group, body)).toBean(CreateGroupResult.class);
	}
	
	/**
	 * 获取群组详细资料
	 * @param body
	 */
	public static GetGroupInfoResult getGroupInfo(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get_group_info, body)).toBean(GetGroupInfoResult.class);
	}
	
	/**
	 * 获取群组成员详细资料
	 * 说明 ：因为内部实现的差异，互动直播聊天室只能获取 300 人以内的群成员资料，群人数达到 300 后加入的群成员的成员资料无法被获取；而在线成员广播大群则无法获取群成员资料。
	 * @param body
	 */
	public static GetGroupMemberInfoResult getGroupMemberInfo(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get_group_member_info, body)).toBean(GetGroupMemberInfoResult.class);
	}
	
	/**
	 * 修改群组基础资料
	 * @param body
	 * @return
	 */
	public static TimBaseResult modifGroupBaseInfo(String body) {
		return JSONUtil.parseObj(post(ApiEnum.modify_group_base_info, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 增加群组成员
	 * 说明：互动直播聊天室和在线成员广播大群不支持增加群成员，对这两种类型的群组进行操作时会返回 10007 错误。用户加入这两种群组的唯一方式是用户申请加群。
	 * @param body
	 */
	public static AddGroupMemberResult addGroupMember(String body) {
		return JSONUtil.parseObj(post(ApiEnum.add_group_member, body)).toBean(AddGroupMemberResult.class);
	}
	
	/**
	 * 删除群组成员
	 * 说明：
	 * 	互动直播聊天室不支持删除群成员，对这种类型的群组进行操作时会返回 10004 错误。如果管理员希望达到删除群成员的效果，可以通过 设置禁言 的方式实现。
	 * 	在线成员广播大群也不支持删除群成员，对这种类型的群组进行操作时同样会返回 10004 错误。且该类型群组只支持 App 管理员推送广播消息。
	 * @param body
	 */
	public static TimBaseResult deleteGroupMember(String body) {
		return JSONUtil.parseObj(post(ApiEnum.delete_group_member, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 修改群成员资料
	 * 说明：互动直播聊天室因为内部实现的问题，只能修改管理员和群主的成员资料，修改普通成员资料时会返回 10007 错误。
	 * @param body
	 */
	public static TimBaseResult modifyGroupMemberInfo(String body) {
		return JSONUtil.parseObj(post(ApiEnum.modify_group_member_info, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 解散群组
	 * @param body
	 */
	public static TimBaseResult destroyGroup(String body) {
		return JSONUtil.parseObj(post(ApiEnum.destroy_group, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 获取用户所加入的群组
	 * 说明：互动直播聊天室和在线成员广播大群因为内部实现的差异，获取用户加入的群组时不会获取到这两种类型的群组。
	 * @param body
	 */
	public static GetJoinedGroupListResult getJoinedGroupList(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get_joined_group_list, body)).toBean(GetJoinedGroupListResult.class);
	}
	
	/**
	 * 查询用户在群组中的身份
	 * 说明：
	 *	互动直播聊天室不支持使用该 REST API 查询用户在群组中的身份，如果对这种群组进行操作将返回 10007 错误。如果管理员希望达到查询用户身份的效果，可以通过 获取群组成员详细资料 实现。
	 *	在线成员广播大群不支持设置管理员和群主，全部成员都为普通成员。所以也不支持使用该 REST API 查询用户在群组中的身份。
	 * @param body
	 */
	public static GetRoleInGroupResult getRoleInGroup(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get_role_in_group, body)).toBean(GetRoleInGroupResult.class);
	}
	
	/**
	 * 批量禁言和取消禁言
	 * @param body
	 */
	public static TimBaseResult forbidSendMsg(String body) {
		return JSONUtil.parseObj(post(ApiEnum.forbid_send_msg, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 获取群组被禁言用户列表
	 * @param body
	 */
	public static GetGroupShuttedUinResult getGroupShuttedUin(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get_group_shutted_uin, body)).toBean(GetGroupShuttedUinResult.class);
	}
	
	/**
	 * 在群组中发送普通消息
	 * @param body
	 */
	public static SendGroupMsgResult sendGroupMsg(String body) {
		return JSONUtil.parseObj(post(ApiEnum.send_group_msg, body)).toBean(SendGroupMsgResult.class);
	}
	
	/**
	 * 在群组中发送系统通知
	 * @param body
	 */
	public static TimBaseResult sendGroupSystemNotification(String body) {
		return JSONUtil.parseObj(post(ApiEnum.send_group_system_notification, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 群组消息撤回
	 * @param body
	 */
	public static GroupMsgRecallResult groupMsgRecall(String body) {
		return JSONUtil.parseObj(post(ApiEnum.group_msg_recall, body)).toBean(GroupMsgRecallResult.class);
	}
	
	/**
	 * 转让群组
	 * @param body
	 */
	public static TimBaseResult changeGroupOwner(String body) {
		return JSONUtil.parseObj(post(ApiEnum.change_group_owner, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 导入群基础资料
	 * 说明：互动直播聊天室和在线成员广播大群不支持导入群基础资料，对这两种类型的群组进行操作时会返回 10007 错误。如果需要达到导入群组基础资料的效果，可以通过 创建群组 和 修改群组基础资料 的方式实现。
	 * @param body
	 */
	public static ImportGroupResult importGroup(String body) {
		return JSONUtil.parseObj(post(ApiEnum.import_group, body)).toBean(ImportGroupResult.class);
	}
	
	/**
	 * 导入群消息
	 * @param body
	 */
	public static ImportGroupMsgResult importGroupMsg(String body) {
		return JSONUtil.parseObj(post(ApiEnum.import_group_msg, body)).toBean(ImportGroupMsgResult.class);
	}
	
	/**
	 * 导入群成员
	 * 说明：互动直播聊天室和在线成员广播大群不支持导入群成员，对这两种类型的群组进行操作时会返回 10007 错误。因为这两种类型群组所适用的场景一般不需要导入成员，所以没有提供这一功能。
	 * @param body
	 */
	public static ImportGroupMemberResult importGroupMember(String body) {
		return JSONUtil.parseObj(post(ApiEnum.import_group_member, body)).toBean(ImportGroupMemberResult.class);
	}
	
	/**
	 * 设置成员未读消息计数
	 * 说明 ：聊天室、互动直播聊天室和在线成员广播大群的客户端不支持未读消息计数，所以对这三种类型的群组成员设置未读消息计数是无效的（但是不会返回错误）。
	 * @param body
	 */
	public static TimBaseResult setUnreadMsgNum(String body) {
		return JSONUtil.parseObj(post(ApiEnum.set_unread_msg_num, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 删除指定用户发送的消息
	 * 说明：互动直播聊天室和在线成员广播大群不会存储漫游消息（这里的删除消息即删除漫游消息），对这两种类型的群组中的用户删除消息是无效的（但是不会返回错误）。而且在在线成员广播大群中，只允许 App 管理员发送消息，普通用户无法发送消息。
	 * @param body
	 */
	public static TimBaseResult deleteGroupMsgBySender(String body) {
		return JSONUtil.parseObj(post(ApiEnum.delete_group_msg_by_sender, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 拉取群漫游消息
	 * 说明 ：互动直播聊天室和在线成员广播大群不存储漫游消息。
	 * @param body
	 */
	public static GroupMsgGetSimpleResult groupMsgGetSimple(String body) {
		return JSONUtil.parseObj(post(ApiEnum.group_msg_get_simple, body)).toBean(GroupMsgGetSimpleResult.class);
	}
}













