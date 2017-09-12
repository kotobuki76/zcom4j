package com.brightsconsulting.zcom4j.json.response.identity;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.Version;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostTokensResponseTest {

	String json = "{\"access\":{\"token\":{\"issued_at\":\"2017-09-12T08:11:10.746830\",\"expires\":\"2017-09-13T08:11:10Z\",\"id\":\"84ced8b5c9544e2fa1f430c541a5c951\",\"tenant\":{\"name\":\"zjpt90363803\",\"enabled\":true,\"tyo1_image_size\":\"550GB\",\"id\":\"a9a571dba3e34f448c6fce1ff838e5fd\",\"sin1_image_size\":\"50GB\",\"sjc1_image_size\":\"50GB\",\"domain_id\":\"zjp\",\"description\":\"\"},\"audit_ids\":[\"aBYnr8mzTUWyCwACWpzNdQ\"]},\"serviceCatalog\":[{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://account.tyo1.cloud.z.com/v1/a9a571dba3e34f448c6fce1ff838e5fd\"}],\"endpoints_links\":[],\"type\":\"account\",\"name\":\"Account Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://compute.tyo1.cloud.z.com/v2/a9a571dba3e34f448c6fce1ff838e5fd\"}],\"endpoints_links\":[],\"type\":\"compute\",\"name\":\"Compute Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://networking.tyo1.cloud.z.com\"}],\"endpoints_links\":[],\"type\":\"network\",\"name\":\"Network Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://block-storage.tyo1.cloud.z.com/v2/a9a571dba3e34f448c6fce1ff838e5fd\"}],\"endpoints_links\":[],\"type\":\"volumev2\",\"name\":\"Volume Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://image-service.tyo1.cloud.z.com\"}],\"endpoints_links\":[],\"type\":\"image\",\"name\":\"Image Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://database-hosting.tyo1.cloud.z.com/v1\"}],\"endpoints_links\":[],\"type\":\"databasehosting\",\"name\":\"Database Hosting Service\"},{\"endpoints\":[{\"region\":\"tyo1\"}],\"endpoints_links\":[],\"type\":\"emailhosting\",\"name\":\"Email Hosting Service\"},{\"endpoints\":[{\"region\":\"tyo1\"}],\"endpoints_links\":[],\"type\":\"webhosting\",\"name\":\"Web Hosting Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://mail-hosting.tyo1.cloud.z.com/v1\"}],\"endpoints_links\":[],\"type\":\"mailhosting\",\"name\":\"Mail Hosting Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://dns-service.tyo1.cloud.z.com\"}],\"endpoints_links\":[],\"type\":\"dns\",\"name\":\"DNS Service\"},{\"endpoints\":[{\"region\":\"tyo1\"}],\"endpoints_links\":[],\"type\":\"wordpresshosting\",\"name\":\"WordPress Hosting Service\"},{\"endpoints\":[{\"region\":\"tyo1\",\"publicURL\":\"https://object-storage.tyo1.cloud.z.com/v1/zc_a9a571dba3e34f448c6fce1ff838e5fd\"}],\"endpoints_links\":[],\"type\":\"object-store\",\"name\":\"Object Storage Service\"},{\"endpoints\":[{\"region\":\"tyo1\"}],\"endpoints_links\":[],\"type\":\"webfont\",\"name\":\"Web Font Service\"},{\"endpoints\":[{\"region\":\"sjc1\",\"publicURL\":\"https://identity.sjc1.cloud.z.com/v2.0\"},{\"region\":\"tyo1\",\"publicURL\":\"https://identity.tyo1.cloud.z.com/v2.0\"},{\"region\":\"sin1\",\"publicURL\":\"https://identity.sin1.cloud.z.com/v2.0\"}],\"endpoints_links\":[],\"type\":\"identity\",\"name\":\"Identity Service\"},{\"endpoints\":[{\"region\":\"tyo1\"}],\"endpoints_links\":[],\"type\":\"domainforwarding\",\"name\":\"Domain Forwarding Service\"}],\"user\":{\"username\":\"zjpu90363803\",\"roles_links\":[],\"id\":\"47809633003b478298a0bc9436b91545\",\"roles\":[{\"name\":\"SwiftOperator\"},{\"name\":\"_member_\"}],\"name\":\"zjpu90363803\"},\"metadata\":{\"is_admin\":0,\"roles\":[\"ea04ba71916e434c8fdc1b9c327f8dae\",\"e79e6014598348f192a03f8456a084a3\"]}}}";

	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			PostTokensResponse res = mapper.readValue(this.json, PostTokensResponse.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
