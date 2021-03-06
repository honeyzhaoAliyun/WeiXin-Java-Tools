package me.chanjar.weixin.cp.api;

import me.chanjar.weixin.common.bean.WxAccessToken;

/**
 * 基于内存的微信配置provider，在实际生产环境中应该将这些配置持久化
 * @author Daniel Qian
 *
 */
public class WxCpInMemoryConfigStorage implements WxCpConfigStorage {

  protected String corpId;
  protected String corpSecret;

  protected String token;
  protected String accessToken;
  protected String aesKey;
  protected String agentId;
  protected int expiresIn;

  protected String oauth2redirectUri;

  protected String http_proxy_host;
  protected int http_proxy_port;
  protected String http_proxy_username;
  protected String http_proxy_password;

  public void updateAccessToken(WxAccessToken accessToken) {
    updateAccessToken(accessToken.getAccessToken(), accessToken.getExpiresIn());
  }
  
  public void updateAccessToken(String accessToken, int expiresIn) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
  }

  public String getAccessToken() {
    return this.accessToken;
  }

  public String getCorpId() {
    return this.corpId;
  }

  public String getCorpSecret() {
    return this.corpSecret;
  }

  public String getToken() {
    return this.token;
  }

  public int getExpiresIn() {
    return this.expiresIn;
  }

  public void setCorpId(String corpId) {
    this.corpId = corpId;
  }

  public void setCorpSecret(String corpSecret) {
    this.corpSecret = corpSecret;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getAesKey() {
    return aesKey;
  }

  public void setAesKey(String aesKey) {
    this.aesKey = aesKey;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }

  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public String getOauth2redirectUri() {
    return this.oauth2redirectUri;
  }

  public void setOauth2redirectUri(String oauth2redirectUri) {
    this.oauth2redirectUri = oauth2redirectUri;
  }

  public String getHttp_proxy_host() {
    return http_proxy_host;
  }

  public void setHttp_proxy_host(String http_proxy_host) {
    this.http_proxy_host = http_proxy_host;
  }

  public int getHttp_proxy_port() {
    return http_proxy_port;
  }

  public void setHttp_proxy_port(int http_proxy_port) {
    this.http_proxy_port = http_proxy_port;
  }

  public String getHttp_proxy_username() {
    return http_proxy_username;
  }

  public void setHttp_proxy_username(String http_proxy_username) {
    this.http_proxy_username = http_proxy_username;
  }

  public String getHttp_proxy_password() {
    return http_proxy_password;
  }

  public void setHttp_proxy_password(String http_proxy_password) {
    this.http_proxy_password = http_proxy_password;
  }

  public String toString() {
    return "WxCpInMemoryConfigStorage{" +
        "corpId='" + corpId + '\'' +
        ", corpSecret='" + corpSecret + '\'' +
        ", token='" + token + '\'' +
        ", accessToken='" + accessToken + '\'' +
        ", aesKey='" + aesKey + '\'' +
        ", agentId='" + agentId + '\'' +
        ", expiresIn=" + expiresIn +
        ", http_proxy_host='" + http_proxy_host + '\'' +
        ", http_proxy_port=" + http_proxy_port +
        ", http_proxy_username='" + http_proxy_username + '\'' +
        ", http_proxy_password='" + http_proxy_password + '\'' +
        '}';
  }

}
