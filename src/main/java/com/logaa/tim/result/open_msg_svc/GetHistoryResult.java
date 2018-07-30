/**
 * 
 */
package com.logaa.tim.result.open_msg_svc;

import java.util.List;

import com.logaa.tim.result.TimBaseResult;

/**
 * 消息记录下载
 * @author logaa
 *
 */
public class GetHistoryResult extends TimBaseResult{

	private List<File> File;
	
	public class File{
		
		private String URL;	// 消息记录文件下载地址。
		
		private String ExpireTime;	// 	下载地址过期时间，请在过期前进行下载，若地址失效，请通过该接口重新获取。
		
		private Integer FileSize;	// 	GZip 压缩前的文件大小（单位 Byte）。
		
		private String FileMD5;	// 	GZip 压缩前的文件 MD5。
		
		private Integer GzipSize;	// GZip 压缩后的文件大小（单位 Byte）。
		
		private String GzipMD5;	// GZip 压缩后的文件 MD5。

		public String getURL() {
			return URL;
		}

		public void setURL(String uRL) {
			URL = uRL;
		}

		public String getExpireTime() {
			return ExpireTime;
		}

		public void setExpireTime(String expireTime) {
			ExpireTime = expireTime;
		}

		public Integer getFileSize() {
			return FileSize;
		}

		public void setFileSize(Integer fileSize) {
			FileSize = fileSize;
		}

		public String getFileMD5() {
			return FileMD5;
		}

		public void setFileMD5(String fileMD5) {
			FileMD5 = fileMD5;
		}

		public Integer getGzipSize() {
			return GzipSize;
		}

		public void setGzipSize(Integer gzipSize) {
			GzipSize = gzipSize;
		}

		public String getGzipMD5() {
			return GzipMD5;
		}

		public void setGzipMD5(String gzipMD5) {
			GzipMD5 = gzipMD5;
		}
		
	}

	public List<File> getFile() {
		return File;
	}

	public void setFile(List<File> file) {
		File = file;
	}
	
}
