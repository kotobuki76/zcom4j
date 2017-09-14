package com.brightsconsulting.zcom4j.api.common;

import com.brightsconsulting.zcom4j.util.APIClient;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * APIを呼び出すクラスのための親クラス
 * @author kotobuki76
 *
 */
public abstract class APIInvoker {
	
	private APIClient client;
	private ObjectMapper mapper;

	/**
	 * コンストラクタ
	 */
	public APIInvoker() {
		this.client = new APIClient();
		this.mapper = new ObjectMapper();
	}

	/**
	 * APIClientの取得
	 * @return　APIClientオブジェクト
	 */
	public APIClient getAPIClient() {
		return this.client;

	}

	/**
	 * ObjectMapperの取得
	 * @return　ObjectMapperオブジェクト
	 */
	public ObjectMapper getObjectMapper() {
		return this.mapper;
	}

	/**
	 * APIClientの接続を閉じる
	 */
	public void close() {
		this.client.close();
	}
}
