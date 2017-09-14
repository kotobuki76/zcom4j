package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSONオブジェクト トークン情報
 * 
 * @author kotobuki76
 * 
 */
public class Token {
	/**
	 * 
	 */
	@JsonProperty("audit_ids")
	public ArrayList<String> auditIds;
	/**
	 * 
	 */
	public Date expires;
	/**
	 * 
	 */
	public String id;
	/**
	 * 
	 */
	@JsonProperty("issued_at")
	public String issuedAt;
	/**
	 * 
	 */
	public Tenant tenant;

	public Token() {
		this.auditIds = new ArrayList<String>();
	}

	@JsonIgnore
	public boolean isExpired() {
		if (this.expires.before(new Date())) {
			return true;
		} else {
			return false;
		}
	}
}
