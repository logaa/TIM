/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.openim_dirty_words.GetResult;

import cn.hutool.json.JSONUtil;

/**
 * 脏字管理
 * @author logaa
 *
 */
public class OpenimDirtyWordsRequest extends TimBaseHttpRequest{

	/**
	 * 查询APP自定义脏字
	 * @param body
	 */
	public static GetResult get(String body) {
		return JSONUtil.parseObj(post(ApiEnum.get, body)).toBean(GetResult.class);
	}
	
	/**
	 * 添加APP自定义脏字
	 * @param body
	 */
	public static TimBaseResult add(String body) {
		return JSONUtil.parseObj(post(ApiEnum.add, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 删除APP自定义脏字
	 * @param body
	 */
	public static TimBaseResult delete(String body) {
		return JSONUtil.parseObj(post(ApiEnum.delete, body)).toBean(TimBaseResult.class);
	}
}
