/**
 * 
 */
package com.logaa.tim.result.openim_im_push;

import java.util.Map;

import com.logaa.tim.result.TimBaseResult;

/**
 * 获取应用属性名称
 * @author logaa
 *
 */
public class ImGetAttrNameResult extends TimBaseResult{

	private Map<String, String> AttrNames;

	public Map<String, String> getAttrNames() {
		return AttrNames;
	}

	public void setAttrNames(Map<String, String> attrNames) {
		AttrNames = attrNames;
	}
	
}
