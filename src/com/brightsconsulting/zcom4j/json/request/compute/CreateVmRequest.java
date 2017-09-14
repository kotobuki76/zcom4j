package com.brightsconsulting.zcom4j.json.request.compute;

import com.brightsconsulting.zcom4j.json.common.Server;

/**
 * 
 * @author kotobuki76
 * 
 */
public class CreateVmRequest {

	/**
	 * 
	 */
	public Server server;
	
	public CreateVmRequest(){
		this.server = new Server();
	}
}
