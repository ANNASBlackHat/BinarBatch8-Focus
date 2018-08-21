package com.annasblackhat.sesi12;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by annasblackhat on 21/08/18
 */
public class User {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("instagram_token")
    @Expose
    private Object instagramToken;
    @SerializedName("phone_confirmed")
    @Expose
    private Boolean phoneConfirmed;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("level_badge_url")
    @Expose
    private String levelBadgeUrl;
    @SerializedName("lapak_name")
    @Expose
    private Object lapakName;
    @SerializedName("lapak_desc")
    @Expose
    private String lapakDesc;
    @SerializedName("lapak_header")
    @Expose
    private String lapakHeader;
    @SerializedName("joined_at")
    @Expose
    private String joinedAt;
    @SerializedName("verified_user")
    @Expose
    private Boolean verifiedUser;
    @SerializedName("official")
    @Expose
    private Boolean official;
    @SerializedName("brand")
    @Expose
    private Boolean brand;
    @SerializedName("store_closed")
    @Expose
    private Boolean storeClosed;
    @SerializedName("subscriber_amount")
    @Expose
    private Integer subscriberAmount;
    @SerializedName("last_order_schedule")
    @Expose
    private Object lastOrderSchedule;
    @SerializedName("premium_user")
    @Expose
    private Boolean premiumUser;
    @SerializedName("premium_package")
    @Expose
    private String premiumPackage;
    @SerializedName("top_merchant")
    @Expose
    private Boolean topMerchant;
    @SerializedName("is_seller")
    @Expose
    private Boolean isSeller;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getInstagramToken() {
        return instagramToken;
    }

    public void setInstagramToken(Object instagramToken) {
        this.instagramToken = instagramToken;
    }

    public Boolean getPhoneConfirmed() {
        return phoneConfirmed;
    }

    public void setPhoneConfirmed(Boolean phoneConfirmed) {
        this.phoneConfirmed = phoneConfirmed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelBadgeUrl() {
        return levelBadgeUrl;
    }

    public void setLevelBadgeUrl(String levelBadgeUrl) {
        this.levelBadgeUrl = levelBadgeUrl;
    }

    public Object getLapakName() {
        return lapakName;
    }

    public void setLapakName(Object lapakName) {
        this.lapakName = lapakName;
    }

    public String getLapakDesc() {
        return lapakDesc;
    }

    public void setLapakDesc(String lapakDesc) {
        this.lapakDesc = lapakDesc;
    }

    public String getLapakHeader() {
        return lapakHeader;
    }

    public void setLapakHeader(String lapakHeader) {
        this.lapakHeader = lapakHeader;
    }

    public String getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Boolean getVerifiedUser() {
        return verifiedUser;
    }

    public void setVerifiedUser(Boolean verifiedUser) {
        this.verifiedUser = verifiedUser;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }

    public Boolean getBrand() {
        return brand;
    }

    public void setBrand(Boolean brand) {
        this.brand = brand;
    }

    public Boolean getStoreClosed() {
        return storeClosed;
    }

    public void setStoreClosed(Boolean storeClosed) {
        this.storeClosed = storeClosed;
    }

    public Integer getSubscriberAmount() {
        return subscriberAmount;
    }

    public void setSubscriberAmount(Integer subscriberAmount) {
        this.subscriberAmount = subscriberAmount;
    }

    public Object getLastOrderSchedule() {
        return lastOrderSchedule;
    }

    public void setLastOrderSchedule(Object lastOrderSchedule) {
        this.lastOrderSchedule = lastOrderSchedule;
    }

    public Boolean getPremiumUser() {
        return premiumUser;
    }

    public void setPremiumUser(Boolean premiumUser) {
        this.premiumUser = premiumUser;
    }

    public String getPremiumPackage() {
        return premiumPackage;
    }

    public void setPremiumPackage(String premiumPackage) {
        this.premiumPackage = premiumPackage;
    }

    public Boolean getTopMerchant() {
        return topMerchant;
    }

    public void setTopMerchant(Boolean topMerchant) {
        this.topMerchant = topMerchant;
    }

    public Boolean getSeller() {
        return isSeller;
    }

    public void setSeller(Boolean seller) {
        isSeller = seller;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
}
