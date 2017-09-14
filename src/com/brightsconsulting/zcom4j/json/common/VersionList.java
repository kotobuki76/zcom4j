package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;

/**
 * JSONオブジェクト バージョン一覧情報
 * @author kotobuki76
 *
 */
public class VersionList {
	/**
	 * 
	 */
	public ArrayList<Version> values;

	/**
	 * 
	 */
	public VersionList() {
		this.values = new ArrayList<Version>();
	}
}
