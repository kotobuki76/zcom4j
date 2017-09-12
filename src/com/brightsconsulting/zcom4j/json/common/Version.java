package com.brightsconsulting.zcom4j.json.common;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Version {

	public static enum Type {

		V1_0("v1"), V2_0("v2.0");

		private final String name;

		Type(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

	};

	public String id;
	public ArrayList<Link> links;
	@JsonProperty("media-types")
	public ArrayList<MediaType> mediaTypes;
	public String status;
	public Date updated;

	public Version() {
		this.links = new ArrayList<Link>();
		this.mediaTypes = new ArrayList<MediaType>();
	}

}
