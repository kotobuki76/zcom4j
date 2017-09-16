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
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.brightsconsulting.zcom4j.BadRequestException;
import com.brightsconsulting.zcom4j.json.common.Token;

/**
 * 
 * @author kotobuki76
 * 
 */
public class APIClient {

	private RequestConfig requestConfig;
	private List<Header> headers = new ArrayList<Header>();
	private HttpClient client;

	/**
	 * 
	 */
	public APIClient() {
		this.requestConfig = RequestConfig.DEFAULT;

	}

	private void createClient() {
		this.client = HttpClientBuilder.create().setDefaultRequestConfig(this.requestConfig)
				.setDefaultHeaders(this.headers).build();
	}

	/**
	 * 
	 * @param url
	 *            URL文字列
	 * @return レスポンス文字列
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 */
	public String get(String url, Token token) throws ClientProtocolException, IOException, AuthenticationException {
		this.createClient();
		HttpGet get = new HttpGet(url);
		get.setHeader("Accept", "application/json");
		if (token != null) {
			get.setHeader("X-Auth-Token", token.id);
		}
		HttpResponse response = this.client.execute(get);
		HttpEntity entity = response.getEntity();
		int code = response.getStatusLine().getStatusCode();
		if ((code == 200) || (code == 300)) {
			String html = EntityUtils.toString(entity, "UTF-8");
			return html;
		} else if (code == 401) {
			throw new AuthenticationException();
		} else {
			System.out.println(response.getStatusLine().getStatusCode());
			throw new FileNotFoundException();
		}

	}

	public String get(String url) throws ClientProtocolException, IOException, AuthenticationException {
		return this.get(url, null);
	}

	/**
	 * 
	 * @param url
	 *            URL文字列
	 * @param data
	 *            送信JSONデータ
	 * @return レスポンス文字列
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws BadRequestException
	 */
	public String post(String url, String data, Token token)
			throws ClientProtocolException, IOException, AuthenticationException, BadRequestException {
		this.createClient();
		HttpPost post = null;
		post = new HttpPost(url);
		// post.setHeader("Content-Type",
		// "application/x-www-form-urlencoded; charset=UTF-8");
		post.setHeader("Accept", "application/json");
		if (token != null) {
			post.setHeader("X-Auth-Token", token.id);
		}
		StringEntity requestEntity = new StringEntity(data, ContentType.APPLICATION_JSON);
		post.setEntity(requestEntity);

		HttpResponse response = this.client.execute(post);

		HttpEntity entity = response.getEntity();
		String html = EntityUtils.toString(entity, "UTF-8");
		int code = response.getStatusLine().getStatusCode();
		if ((code == 202) || (code == 200) || (code == 300)) {
			return html;
		} else if (code == 404) {
			throw new FileNotFoundException();
		} else if (code == 401) {
			throw new AuthenticationException();
		} else if (code == 400) {
			throw new BadRequestException(html);
		} else {
			System.out.println(response.getStatusLine().getStatusCode());
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * Tokenなしでの呼び出し
	 * 
	 * @param url
	 * @param data
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws BadRequestException
	 */
	public String post(String url, String data)
			throws ClientProtocolException, IOException, AuthenticationException, BadRequestException {
		return this.post(url, data, null);
	}

	public String put() {
		return null;
	}

	/**
	 * DELETEコマンドの発行
	 * @param url
	 * @param token
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 */
	public void delete(String url, Token token) throws ClientProtocolException, IOException, AuthenticationException {

		this.createClient();
		HttpDelete del = new HttpDelete(url);
		del.setHeader("Accept", "application/json");
		if (token != null) {
			del.setHeader("X-Auth-Token", token.id);
		}
		HttpResponse response = this.client.execute(del);
		//HttpEntity entity = response.getEntity();
		int code = response.getStatusLine().getStatusCode();
		if ((code == 200) || (code == 300) || (code == 204)) {
			return;
		} else if (code == 401) {
			throw new AuthenticationException();
		} else {
			System.out.println(response.getStatusLine().getStatusCode());
			throw new FileNotFoundException();
		}
	}

	/**
	 * HttpClientを通信CLOSEして終了する
	 */
	public void close() {
		HttpClientUtils.closeQuietly(this.client);
	}
}
