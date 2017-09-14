package com.brightsconsulting.zcom4j.json.common;

/**
 * JSONオブジェクト メタデータ情報
 */
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metadata {
	/**
	 * 
	 */
	public String is_admin;
	/**
	 * 
	 */
	public ArrayList<String> roles;
	/**
	 * 
	 */
	public String instance_name_tag;

	public String backup_id;
	public String backup_set;
	public String backup_status;

	public String properties;

}
