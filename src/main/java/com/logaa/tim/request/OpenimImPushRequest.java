/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.openim_im_push.ImGetAttrNameResult;
import com.logaa.tim.result.openim_im_push.ImGetAttrResult;
import com.logaa.tim.result.openim_im_push.ImGetPushReportResult;
import com.logaa.tim.result.openim_im_push.ImGetTagResult;
import com.logaa.tim.result.openim_im_push.ImPushResult;

import cn.hutool.json.JSONUtil;

/**
 * 消息推送
 * @author logaa
 *
 */
public class OpenimImPushRequest extends TimBaseHttpRequest{

	/**
	 * 推送
	 * 注意：当前推送功能比较适合低频次推送场景（例如每天或每周一次的营销推送）。如果推送频次过高，则推送可能会有延迟
	 * @param body
	 */
	public static ImPushResult imPush(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_push, body)).toBean(ImPushResult.class);
	}
	
	/**
	 * 获取推送报告
	 * 注意：每次最多只能查询500个任务
	 * @param body
	 */
	public static ImGetPushReportResult imGetPushReport(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_get_push_report, body)).toBean(ImGetPushReportResult.class);
	}
	
	/**
	 * 设置应用属性名称
	 * @param body
	 */
	public static TimBaseResult imSetAttrName(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_set_attr_name, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 获取应用属性名称
	 * @param body
	 */
	public static ImGetAttrNameResult imGetAttrName() {
		return JSONUtil.parseObj(post(ApiEnum.im_get_attr_name)).toBean(ImGetAttrNameResult.class);
	}
	
	/**
	 * 设置用户属性
	 * @param body
	 */
	public static TimBaseResult imSetAttr(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_set_attr, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 获取用户属性
	 * @param body
	 */
	public static ImGetAttrResult imGetAttr(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_get_attr, body)).toBean(ImGetAttrResult.class);
	}
	
	/**
	 * 删除用户属性
	 * 注意:每次最多只能给 500 个用户删除属性
	 * @param body
	 */
	public static TimBaseResult imRemoveAttr(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_remove_attr, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 添加用户标签
	 * 注意：
	 *	每次请求最多只能给 100 个用户添加标签，请求体中单个用户添加标签数最多为 10 个。
	 *	单个用户可设置最大标签数为 100 个，若用户当前标签超过 100，则添加新标签之前请先删除旧标签。
	 *	单个标签最大长度为 50 字节。
	 * @param body
	 */
	public static TimBaseResult imAddTag(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_add_tag, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 获取用户标签
	 * @param body
	 */
	public static ImGetTagResult imGetTag(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_get_tag, body)).toBean(ImGetTagResult.class);
	}
	
	/**
	 * 删除用户标签
	 * @param body
	 */
	public static TimBaseResult imRemoveTag(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_remove_tag, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 删除用户所有标签
	 * @param body
	 */
	public static TimBaseResult imRemoveAllTags(String body) {
		return JSONUtil.parseObj(post(ApiEnum.im_remove_all_tags, body)).toBean(TimBaseResult.class);
	}
}
