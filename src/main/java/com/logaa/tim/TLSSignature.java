package com.logaa.tim;

import com.tls.tls_sigature.tls_sigature;
import com.tls.tls_sigature.tls_sigature.GenTLSSignatureResult;

public class TLSSignature {
	
	public static String genTLSSigna(String identifier){
		GenTLSSignatureResult result = tls_sigature.GenTLSSignatureEx(Constants.APPID, identifier, Constants.PRIVATE_KEY);
		return result.urlSig;
	}
	
	public static String getDefSigna(){
		return genTLSSigna(Constants.DEF_IDENTIFIER);
	}
	
}
