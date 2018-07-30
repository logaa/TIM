/**
 * 
 */
package com.logaa.tim.result.openim_dirty_words;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 查询APP自定义脏字
 * @author logaa
 *
 */
public class GetResult extends TimBaseResult{

	private List<String> DirtyWordsList;

	public List<String> getDirtyWordsList() {
		return DirtyWordsList;
	}

	public void setDirtyWordsList(List<String> dirtyWordsList) {
		DirtyWordsList = dirtyWordsList;
	}
}
