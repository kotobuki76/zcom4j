package com.brightsconsulting.zcom4j.json.common;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.zcom4j.util.JsonWriter;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ServerTest {

	String json = "{\"OS-DCF:diskConfig\":\"MANUAL\",\"OS-EXT-AZ:availability_zone\":\"nova\",\"OS-EXT-SRV-ATTR:host\":\"cn-a11022.g2.tyo1.v4\",\"OS-EXT-SRV-ATTR:hypervisor_hostname\":\"cn-a11022.g2.tyo1.v4\",\"OS-EXT-SRV-ATTR:instance_name\":\"tyo1-000024b2\",\"OS-EXT-STS:power_state\":4,\"OS-EXT-STS:task_state\":null,\"OS-EXT-STS:vm_state\":\"stopped\",\"OS-SRV-USG:launched_at\":\"2015-05-07T09:23:03.000000\",\"OS-SRV-USG:terminated_at\":null,\"accessIPv4\":\"\",\"accessIPv6\":\"\",\"addresses\":{\"ext-133-130-48-0-xxx\":[{\"OS-EXT-IPS-MAC:mac_addr\":\"02:01:85:82:31:xx\",\"OS-EXT-IPS:type\":\"fixed\",\"addr\":\"133.130.49.xxx\",\"version\":4},{\"OS-EXT-IPS-MAC:mac_addr\":\"02:01:85:82:31:xx\",\"OS-EXT-IPS:type\":\"fixed\",\"addr\":\"2400:8500:1301:727:133:130:49:xxx\",\"version\":6}]},\"config_drive\":\"True\",\"created\":\"2015-05-07T09:22:57Z\",\"flavor\":{\"id\":\"7eea7469-0d85-4f82-8050-6ae742394681\",\"links\":[{\"href\":\"https://compute.tyo1.cloud.z.com/1864e71d2deb46f6b47526b69c65a45d/flavors/7eea7469-0d85-4f82-8050-6ae742394681\",\"rel\":\"bookmark\"}]},\"hostId\":\"fa6657fcc777a69cf26009030762961bbeb41d2cd02074b651b1e6f6\",\"id\":\"6d9e8d64-236d-4057-a899-f4cf797405cf\",\"image\":{\"id\":\"e2b62c96-abbc-41ae-a5f2-b0fe514b755c\",\"links\":[{\"href\":\"https://compute.tyo1.cloud.z.com/1864e71d2deb46f6b47526b69c65a45d/images/e2b62c96-abbc-41ae-a5f2-b0fe514b755c\",\"rel\":\"bookmark\"}]},\"key_name\":null,\"links\":[{\"href\":\"https://compute.tyo1.cloud.z.com/v2/1864e71d2deb46f6b47526b69c65a45d/servers/6d9e8d64-236d-4057-a899-f4cf797405cf\",\"rel\":\"self\"},{\"href\":\"https://compute.tyo1.cloud.z.com/1864e71d2deb46f6b47526b69c65a45d/servers/6d9e8d64-236d-4057-a899-f4cf797405cf\",\"rel\":\"bookmark\"}],\"metadata\":{\"backup_id\":\"\",\"backup_set\":\"0\",\"backup_status\":\"active\",\"instance_name_tag\":\"vps-2015-05-07-18-22\",\"properties\":\"{\\\"vnc_keymap\\\":\\\"ja\\\",\\\"hw_video_model\\\":\\\"vga\\\",\\\"hw_vif_model\\\":\\\"virtio\\\",\\\"hw_disk_bus\\\":\\\"virtio\\\",\\\"cdrom_path\\\":\\\"\\\"}\"},\"name\":\"server1\",\"os-extended-volumes:volumes_attached\":[{\"id\":\"997d6052-4b17-4500-8d41-c08fb9667aae\"}],\"security_groups\":[{\"name\":\"gncs-ipv4-ssh\"},{\"name\":\"gncs-ipv6-ssh\"}],\"status\":\"SHUTOFF\",\"tenant_id\":\"1864e71d2deb46f6b47526b69c65a45d\",\"updated\":\"2015-05-07T10:43:29Z\",\"user_id\":\"068ae7141b3a4e15bebb8b9ca177e9d3\"}";

	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Server vv = mapper.readValue(this.json, Server.class);
			System.out.println(JsonWriter.toString(vv));
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
