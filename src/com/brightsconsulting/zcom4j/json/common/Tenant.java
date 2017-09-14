package com.brightsconsulting.zcom4j.json.common;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSONオブジェクト テナント情報
 * @author kotobuki76
 *
 */
public class Tenant {
	/**
	 * 
	 */
	public String description;
	/**
	 * 
	 */
	@JsonProperty("domain_id")
	public String domainId;
	/**
	 * 
	 */
	public boolean enabled;
	/**
	 * 
	 */
	public String id;
	/**
	 * 
	 */
	public String name;
	/**
	 * 
	 */
	@JsonProperty("sin1_image_size")
	public String sin1ImageSize;
	/**
	 * 
	 */
	@JsonProperty("sjc1_image_size")
	public String sjc1ImageSize;	
	/**
	 * 
	 */
	@JsonProperty("tyo1_image_size")
	String tyo1ImageSize;

}
