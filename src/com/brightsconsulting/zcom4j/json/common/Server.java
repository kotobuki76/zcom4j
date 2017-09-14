package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Server {
	@JsonProperty("OS-DCF:diskConfig")
	public String OS_DCF_diskConfig;
	public String id;
	public String imageRef;
	public String flavorRef;
	public String adminPass;
	public String key_name;
	public Metadata metadata;
	public ArrayList<SecurityGroup> security_groups;
	public ArrayList<Link> links;

	public Server() {
		this.security_groups = new ArrayList<SecurityGroup>();
		this.links = new ArrayList<Link>();
		this.metadata = new Metadata();
	}

}
