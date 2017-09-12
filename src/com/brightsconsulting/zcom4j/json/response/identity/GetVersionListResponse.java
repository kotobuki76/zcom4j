package com.brightsconsulting.zcom4j.json.response.identity;

import com.brightsconsulting.zcom4j.json.common.VersionList;

public class GetVersionListResponse {
	public VersionList versions;

	public GetVersionListResponse() {
		this.versions = new VersionList();
	}
}
