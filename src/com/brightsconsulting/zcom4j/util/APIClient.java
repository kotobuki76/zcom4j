package com.brightsconsulting.zcom4j.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

public class APIClient {
	RequestConfig requestConfig;
	List<Header> headers = new ArrayList<Header>();
	int socketTimeout = 30;
	int connectionTimeout = 30;
	HttpClient client;

	public APIClient() {
		this.requestConfig = RequestConfig.DEFAULT;
		// .setConnectTimeout(this.connectionTimeout)
		// .setSocketTimeout(this.socketTimeout).build();

	}

	private void createClient() {
		this.client = HttpClientBuilder.create()
				.setDefaultRequestConfig(this.requestConfig)
				.setDefaultHeaders(this.headers).build();
	}

	public void setHeader(String k, String v) {
		this.headers.add(new BasicHeader(k, v));
	}

	public void setParam() {

	}

	public String get(String url) throws ClientProtocolException, IOException {
		this.createClient();
		HttpGet get = new HttpGet(url);
		HttpResponse response = this.client.execute(get);
		HttpEntity entity = response.getEntity();
		int code = response.getStatusLine().getStatusCode();
		if ((code == 200) || (code == 300)) {
			String html = EntityUtils.toString(entity, "UTF-8");
			return html;
		} else {
			System.out.println(response.getStatusLine().getStatusCode());
			throw new FileNotFoundException();
		}

	}

	public String post(String url, String data) throws ClientProtocolException,
			IOException, AuthenticationException {
		this.createClient();
		HttpPost post = null;
		post = new HttpPost(url);
		post.setHeader("Content-Type",
				"application/x-www-form-urlencoded; charset=UTF-8");
		post.setHeader("Accept", "Accept: application/json");
		StringEntity requestEntity = new StringEntity(data,
				ContentType.APPLICATION_JSON);
		post.setEntity(requestEntity);

		HttpResponse response = this.client.execute(post);

		HttpEntity entity = response.getEntity();
		int code = response.getStatusLine().getStatusCode();
		if ((code == 200) || (code == 300)) {
			String html = EntityUtils.toString(entity, "UTF-8");
			return html;
		} else if (code == 404) {
			throw new FileNotFoundException();
		} else if (code == 401) {
			throw new AuthenticationException();
		} else {
			System.out.println(response.getStatusLine().getStatusCode());
			throw new UnsupportedOperationException();
		}
	}

	public String put() {
		return null;
	}

	public String delete() {
		return null;
	}

	public void close() {
		HttpClientUtils.closeQuietly(this.client);
	}
}
