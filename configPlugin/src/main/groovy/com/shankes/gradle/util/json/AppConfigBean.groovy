package com.shankes.gradle.util.json;

/**
 * 作者： yanshili
 * 日期： 2017/6/25
 * 邮箱： shili_yan@sina.com
 * 描述： app配置信息
 */

class AppConfigBean {

    /**
     * 包名
     */
    private String applicationId;

    /**
     * app端类型
     */
    private String clientKey;

    /**
     * 版本号
     */
    private int versionCode;

    /**
     * 版本名称
     */
    private String versionName;

    /**
     * 发不版密钥的别名
     */
    private String keyAlias;

    /**
     * 发不版密钥的密码
     */
    private String keyPassword;

    /**
     * 发不版密钥的密码
     */
    private String keyStorePassword;

    /**
     * app名字
     */
    private String appName;

    /**
     * 预览环境接口地址
     */
    private String apiPreview;

    /**
     * 正式环境接口地址
     */
    private String apiRelease;

    /**
     * 默认城市百度编码
     */
    private String defaultCityCode;

    /**
     * 容联云appId
     */
    private String imAppId;

    /**
     * 容联云appToken
     */
    private String imAppToken;

    /**
     * 短信key
     */
    private String mobAppKey;

    /**
     * 短信secret
     */
    private String mobAppSecret;

    /**
     * 百度地图
     */
    private String baiduAppKey;

    /**
     * 友盟key
     */
    private String umengAppKey;

    /**
     * 友盟secret
     */
    private String umengAppSecret;

    /**
     * 友盟packageName
     */
    private String umengPackageName;

    /**
     * 友盟channel
     */
    private String umengChannel;

    /**
     * 腾讯bugly appId
     */
    private String buglyAppId;

    /**
     * 腾讯bugly Key
     */
    private String buglyAppKey;

    /**
     * 腾讯qq appid
     */
    private String qqAppId;

    /**
     * 腾讯qq key
     */
    private String qqAppKey;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApiPreview() {
        return apiPreview;
    }

    public void setApiPreview(String apiPreview) {
        this.apiPreview = apiPreview;
    }

    public String getApiRelease() {
        return apiRelease;
    }

    public void setApiRelease(String apiRelease) {
        this.apiRelease = apiRelease;
    }

    public String getDefaultCityCode() {
        return defaultCityCode;
    }

    public void setDefaultCityCode(String defaultCityCode) {
        this.defaultCityCode = defaultCityCode;
    }

    public String getImAppId() {
        return imAppId;
    }

    public void setImAppId(String imAppId) {
        this.imAppId = imAppId;
    }

    public String getImAppToken() {
        return imAppToken;
    }

    public void setImAppToken(String imAppToken) {
        this.imAppToken = imAppToken;
    }

    public String getMobAppKey() {
        return mobAppKey;
    }

    public void setMobAppKey(String mobAppKey) {
        this.mobAppKey = mobAppKey;
    }

    public String getMobAppSecret() {
        return mobAppSecret;
    }

    public void setMobAppSecret(String mobAppSecret) {
        this.mobAppSecret = mobAppSecret;
    }

    public String getBaiduAppKey() {
        return baiduAppKey;
    }

    public void setBaiduAppKey(String baiduAppKey) {
        this.baiduAppKey = baiduAppKey;
    }

    public String getUmengAppKey() {
        return umengAppKey;
    }

    public void setUmengAppKey(String umengAppKey) {
        this.umengAppKey = umengAppKey;
    }

    public String getUmengAppSecret() {
        return umengAppSecret;
    }

    public void setUmengAppSecret(String umengAppSecret) {
        this.umengAppSecret = umengAppSecret;
    }

    public String getUmengPackageName() {
        return umengPackageName;
    }

    public void setUmengPackageName(String umengPackageName) {
        this.umengPackageName = umengPackageName;
    }

    public String getUmengChannel() {
        return umengChannel;
    }

    public void setUmengChannel(String umengChannel) {
        this.umengChannel = umengChannel;
    }

    public String getBuglyAppId() {
        return buglyAppId;
    }

    public void setBuglyAppId(String buglyAppId) {
        this.buglyAppId = buglyAppId;
    }

    public String getQqAppId() {
        return qqAppId;
    }

    public void setQqAppId(String qqAppId) {
        this.qqAppId = qqAppId;
    }

    public String getQqAppKey() {
        return qqAppKey;
    }

    public void setQqAppKey(String qqAppKey) {
        this.qqAppKey = qqAppKey;
    }

    public String getBuglyAppKey() {
        return buglyAppKey;
    }

    public void setBuglyAppKey(String buglyAppKey) {
        this.buglyAppKey = buglyAppKey;
    }

    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public String getKeyPassword() {
        return keyPassword;
    }

    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }
}
