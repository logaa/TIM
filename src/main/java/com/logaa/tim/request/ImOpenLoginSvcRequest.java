/**
 * 
 */
package com.logaa.tim.request;

import com.logaa.tim.ApiEnum;
import com.logaa.tim.result.TimBaseResult;
import com.logaa.tim.result.im_open_login_svc.MultiaccountImportResult;

import cn.hutool.json.JSONUtil;

/**
 * 账号管理
 * @author logaa
 *
 */
public class ImOpenLoginSvcRequest extends TimBaseHttpRequest{

	/**
	 * 独立模式账号导入接口
	 * @param body
	 */
	public static TimBaseResult accountImport(String body) {
		return JSONUtil.parseObj(post(ApiEnum.account_import, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 独立模式帐号批量导入接口
	 * @param body
	 */
	public static MultiaccountImportResult multiaccountImport(String body) {
		return JSONUtil.parseObj(post(ApiEnum.multiaccount_import, body)).toBean(MultiaccountImportResult.class);
	}
	
	/**
	 * 帐号登录态失效接口
	 * @param body
	 */
	public static TimBaseResult kick(String body) {
		return JSONUtil.parseObj(post(ApiEnum.kick, body)).toBean(TimBaseResult.class);
	}
	
	/**
	 * 托管模式存量账号导入
	 * @param body
	 */
	public static TimBaseResult registerAccountV1(String body) {
		return JSONUtil.parseObj(post(ApiEnum.register_account_v1, body)).toBean(TimBaseResult.class);
	}
}







