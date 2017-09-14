package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;

/**
 * JSONオブジェクト アクセス情報
 * @author kotobuki76
 *
 */
public class Access {
	
	/**
	 * メタデータ情報
	 */
	public Metadata metadata;
	/**
	 * サービスカタログ情報配列
	 */
	public ArrayList<ServiceCatalog> serviceCatalog;
	/**
	 * トークン情報
	 */
	public Token token;
	/**
	 * ユーザー情報
	 */
	public User user;
	
}
