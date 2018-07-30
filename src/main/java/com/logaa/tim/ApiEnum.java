package com.logaa.tim;

/**
 * 接口地址
 * @author logaa
 *
 */
public enum ApiEnum {

	// 账号管理
	account_import("v4/im_open_login_svc/account_import"),  // 独立模式帐号导入
	multiaccount_import("v4/im_open_login_svc/multiaccount_import"),  // 独立模式帐号批量导入
	register_account_v1("v4/registration_service/register_account_v1"),  // 托管模式帐号导入      
	kick("v4/im_open_login_svc/kick"),  // 失效帐号登录态      

	// 单发消息
	sendmsg("v4/openim/sendmsg"),  // 单发单聊消息        
	batchsendmsg("v4/openim/batchsendmsg"),  // 批量发单聊消息      
	importmsg("v4/openim/importmsg"),  // 导入单聊消息      

	// 消息推送
	im_push("v4/openim/im_push"),  // 推送
	im_get_push_report("v4/openim/im_get_push_report"),  // 获取推送报告	       
	im_set_attr_name("v4/openim/im_set_attr_name"),  // 设置应用属性名称	       
	im_get_attr_name("v4/openim/im_get_attr_name"),  // 获取应用属性名称          
	im_set_attr("v4/openim/im_set_attr"),  // 设置用户属性       
	im_remove_attr("v4/openim/im_remove_attr"),  // 删除用户属性	            
	im_get_attr("v4/openim/im_get_attr"),  // 获取用户属性	             
	im_add_tag("v4/openim/im_add_tag"),  // 添加用户标签	     
	im_remove_tag("v4/openim/im_remove_tag"),  // 删除用户标签	      
	im_remove_all_tags("v4/openim/im_remove_all_tags"),  // 删除用户所有标签	     
	im_get_tag("v4/openim/im_get_tag"),  // 获取用户标签

	// 群组系统
	get_appid_group_list("v4/group_open_http_svc/get_appid_group_list"),  // 获取APP中的所有群组
	create_group("v4/group_open_http_svc/create_group"),  // 创建群组          
	get_group_info("v4/group_open_http_svc/get_group_info"),   // 获取群组详细资料	     
	get_group_member_info("v4/group_open_http_svc/get_group_member_info"),  // 获取群成员详细资料	
	modify_group_base_info("v4/group_open_http_svc/modify_group_base_info"),  // 修改群组基础资料	
	add_group_member("v4/group_open_http_svc/add_group_member"),  // 增加群组成员	
	delete_group_member("v4/group_open_http_svc/delete_group_member"),  // 删除群组成员	
	modify_group_member_info("v4/group_open_http_svc/modify_group_member_info"),  // 修改群组成员资料	
	destroy_group("v4/group_open_http_svc/destroy_group"),  // 解散群组	         
	get_joined_group_list("v4/group_open_http_svc/get_joined_group_list"),  // 获取用户所加入的群组	
	get_role_in_group("v4/group_open_http_svc/get_role_in_group"), // 查询用户在群组中的身份	
	forbid_send_msg("v4/group_open_http_svc/forbid_send_msg"),  // 批量禁言和取消禁言	
	get_group_shutted_uin("v4/group_open_http_svc/get_group_shutted_uin"), // 获取群组被禁言用户列表	
	send_group_msg("v4/group_open_http_svc/send_group_msg"),   // 在群组中发送普通消息	
	send_group_system_notification("v4/group_open_http_svc/send_group_system_notification"),  // 在群组中发送系统通知	
	change_group_owner("v4/group_open_http_svc/change_group_owner"),   // 转让群组	
	import_group("v4/group_open_http_svc/import_group"),   // 导入群基础资料	
	import_group_msg("v4/group_open_http_svc/import_group_msg"),  // 导入群消息	
	import_group_member("v4/group_open_http_svc/import_group_member"),   // 导入群成员	
	set_unread_msg_num("v4/group_open_http_svc/set_unread_msg_num"),  // 设置成员未读消息计数	
	delete_group_msg_by_sender("v4/group_open_http_svc/delete_group_msg_by_sender"),  // 删除指定用户发送的消息	
	search_group("v4/group_open_http_svc/search_group"),  // 搜索	
	group_msg_get_simple("v4/group_open_http_svc/group_msg_get_simple"),  // 拉取群漫游消息	
	group_msg_recall("v4/group_open_http_svc/group_msg_recall"),  // 群组消息撤回	

	// 用户资料
	portrait_get("v4/profile/portrait_get"),  // 拉取资料	
	portrait_set("v4/profile/portrait_set"),  // 设置资料	

	// 关系链
	friend_add("v4/sns/friend_add"),  // 添加好友	
	friend_import("v4/sns/friend_import"),   // 导入好友	
	friend_update("v4/sns/friend_update"),   // 更新好友	
	friend_delete("v4/sns/friend_delete"),   // 删除好友	
	friend_delete_all("v4/sns/friend_delete_all"),  // 删除所有好友	
	friend_check("v4/sns/friend_check"),   // 校验好友	
	friend_get_all("v4/sns/friend_get_all"),   // 拉取好友	
	friend_get_list("v4/sns/friend_get_list"),   // 拉取指定好友	
	group_add("v4/sns/group_add"),   // 添加分组
	group_delete("v4/sns/group_delete"),   // 删除分组	
	black_list_add("v4/sns/black_list_add"),  // 添加黑名单	
	black_list_delete("v4/sns/black_list_delete"),  // 删除黑名单
	black_list_get("v4/sns/black_list_get"),  // 拉取黑名单
	black_list_check("v4/sns/black_list_check"),  // 校验黑名单

	// 数据下载
	get_history("v4/open_msg_svc/get_history"),

	// 在线状态
	querystate("v4/openim/querystate"),

	// 脏字管理
	get("v4/openim_dirty_words/get"),  // 查询脏字
	add("v4/openim_dirty_words/add"),  // 添加脏字	
	delete("v4/openim_dirty_words/delete"),  // 删除脏字	

	// 全局禁言
	setnospeaking("v4/openconfigsvr/setnospeaking"),  // 设置全局禁言
	getnospeaking("v4/openconfigsvr/getnospeaking"),  // 查询全局禁言
	
	// 运营相关
	getappinfo("v4/openconfigsvr/getappinfo");	// 拉取运营数据
	
	private final static String BASE_URL = "https://console.tim.qq.com/";
	
	private String api;

	private ApiEnum(String api) {
		this.api = api;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}
	
	public String getUrl(){
		return BASE_URL + this.api;
	}
}
