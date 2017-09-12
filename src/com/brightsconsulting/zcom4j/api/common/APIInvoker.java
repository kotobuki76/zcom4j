package com.brightsconsulting.zcom4j.api.common;

import com.brightsconsulting.zcom4j.util.APIClient;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class APIInvoker {
	APIClient client;
	ObjectMapper mapper;

	public APIInvoker() {
		this.client = new APIClient();
		this.mapper = new ObjectMapper();
	}

	public APIClient getAPIClient() {
		return this.client;

	}

	public ObjectMapper getObjectMapper() {
		return this.mapper;
	}

	public void close() {
		this.client.close();
	}
}
