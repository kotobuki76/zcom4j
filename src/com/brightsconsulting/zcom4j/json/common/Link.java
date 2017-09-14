package com.brightsconsulting.zcom4j.json.common;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * JSONオブジェクト リンク情報
 * 
 * @author kotobuki76
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {
	/**
	 * 
	 */
	public String href;
	/**
	 * 
	 */
	public String rel;
	/**
	 * 
	 */
	public String type;

}
