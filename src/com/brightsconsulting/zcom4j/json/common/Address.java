package com.brightsconsulting.zcom4j.json.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	@JsonProperty("OS-EXT-IPS-MAC:mac_addr")
	public String macAddr;
	@JsonProperty("OS-EXT-IPS:type")
	public String type;
	public String addr;
	public String version;
}
