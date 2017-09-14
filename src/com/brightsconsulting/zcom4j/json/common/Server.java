package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Server {
	@JsonProperty("OS-DCF:diskConfig")
	public String OS_DCF_diskConfig;
	@JsonProperty("OS-EXT-AZ:availability_zone")
	public String OS_EXT_AZ_availability_zone;
	@JsonProperty("OS-EXT-SRV-ATTR:host")
	public String OS_EXT_SRV_ATTR_host;
	@JsonProperty("OS-EXT-SRV-ATTR:hypervisor_hostname")
	public String OS_EXT_SRV_ATTR_hypervisor_hostname;
	@JsonProperty("OS-EXT-SRV-ATTR:instance_name")
	public String OS_EXT_SRV_ATTR_instance_name;
	@JsonProperty("OS-EXT-STS:power_state")
	public String OS_EXT_STS_power_state;
	@JsonProperty("OS-EXT-STS:task_state")
	public String OS_EXT_STS_task_state;
	@JsonProperty("OS-EXT-STS:vm_state")
	public String OS_EXT_STS_vm_state;
	@JsonProperty("OS-SRV-USG:launched_at")
	public String OS_SRV_USG_launched_at;
	@JsonProperty("OS-SRV-USG:terminated_at")
	public String OS_SRV_USG_terminated_at;
	public String accessIPv4;
	public String accessIPv6;

	public Map<String, ArrayList<Address>> addresses;

	public String config_drive;
	public Date created;
	public Flavor flavor;
	public String hostId;
	public String id;

	public Image image;
	public String key_name;
	public ArrayList<Link> links;
	public Metadata metadata;
	public String name;
	@JsonProperty("os-extended-volumes:volumes_attached")
	public ArrayList<Volume> volumes;
	public ArrayList<SecurityGroup> security_groups;
	public String status;
	public String tenant_id;
	public Date updated;
	public String user_id;

	public String imageRef;
	public String flavorRef;
	public String adminPass;

	public Server() {
		this.security_groups = new ArrayList<SecurityGroup>();
		this.links = new ArrayList<Link>();
		this.metadata = new Metadata();
	}

	@JsonAnySetter
	public void set(String name, Object value) {
		if (name.startsWith("ext-")) {
			this.addresses.put(name, (ArrayList<Address>) value);
		}
	}

}
