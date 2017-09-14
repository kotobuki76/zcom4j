package com.brightsconsulting.zcom4j.json.response.identity;

import com.brightsconsulting.zcom4j.json.common.Version;

/**
 * 
 * @author kotobuki76
 *
 */
public class GetVersionDetailResponse {
	
	/**
	 * 
	 */
	public Version version;
	
	/**
	 * 
	 */
	public GetVersionDetailResponse(){
		this.version = new Version();
	}
}
