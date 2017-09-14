# zcom4jについて
zcom4jは[Z.com API](https://cloud.z.com/sg/ja/cloud/docs/index.html)をJava上から扱いやすくするためのライブラリです。
## JRE
Java8
## 依存ライブラリ
- Apache HttpClient 4.5.3
- Apache Jackson 2.9.0
- JUnit 4.12

# 対応しているAPI

## Identity API v2.0

### パッケージ：com.brightsconsulting.zcom4j.api.identity

|名称|クラス|
|:--|:--|
|[バージョン情報取得](https://cloud.z.com/sg/ja/cloud/docs/identity-get_version_list.html)|GetVersionList|
|[バージョン情報詳細取得](https://cloud.z.com/sg/ja/cloud/docs/identity-get_version_detail.html)|GetVersionDetail|
|[トークン発行](https://cloud.z.com/sg/ja/cloud/docs/identity-post_tokens.html)|PostTokens|

## Compute API v2

### パッケージ：com.brightsconsulting.zcom4j.api.compute

|名称|クラス|
|:--|:--|
|[バージョン情報取得](https://cloud.z.com/sg/ja/cloud/docs/compute-get_version_list.html)|GetVersionList|
|[バージョン情報詳細取得](https://cloud.z.com/sg/ja/cloud/docs/compute-get_version_detail.html)|GetVersionDetail|
|[VM追加](https://cloud.z.com/sg/ja/cloud/docs/compute-create_vm.html)|CreateVm|
|[VM詳細取得（アイテム指定) ](https://cloud.z.com/sg/ja/cloud/docs/compute-get_vms_detail_specified.html)|GetVmsDetailSpecified|
