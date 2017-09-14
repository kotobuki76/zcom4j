package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;

/**
 * JSONオブジェクト ユーザー情報
 * @author kotobuki76
 *
 */
public class User {
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
	public ArrayList<Role> roles;
	/**
	 * 
	 */
	public ArrayList<String> roles_links;
	/**
	 * 
	 */
	public String username;
}
