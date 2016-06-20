package com.lionxxw.babasport.user.entity;

import java.util.Date;

public class Buyer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.user_name
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.password
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.gender
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private Integer gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.email
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.real_name
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.register_time
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private Date registerTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.province
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.city
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.town
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String town;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.addr
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private String addr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_buyer.is_del
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    private Boolean isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.user_name
     *
     * @return the value of bbs_buyer.user_name
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.user_name
     *
     * @param userName the value for bbs_buyer.user_name
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.password
     *
     * @return the value of bbs_buyer.password
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.password
     *
     * @param password the value for bbs_buyer.password
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.gender
     *
     * @return the value of bbs_buyer.gender
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.gender
     *
     * @param gender the value for bbs_buyer.gender
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.email
     *
     * @return the value of bbs_buyer.email
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.email
     *
     * @param email the value for bbs_buyer.email
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.real_name
     *
     * @return the value of bbs_buyer.real_name
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.real_name
     *
     * @param realName the value for bbs_buyer.real_name
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.register_time
     *
     * @return the value of bbs_buyer.register_time
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.register_time
     *
     * @param registerTime the value for bbs_buyer.register_time
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.province
     *
     * @return the value of bbs_buyer.province
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.province
     *
     * @param province the value for bbs_buyer.province
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.city
     *
     * @return the value of bbs_buyer.city
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.city
     *
     * @param city the value for bbs_buyer.city
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.town
     *
     * @return the value of bbs_buyer.town
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getTown() {
        return town;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.town
     *
     * @param town the value for bbs_buyer.town
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.addr
     *
     * @return the value of bbs_buyer.addr
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.addr
     *
     * @param addr the value for bbs_buyer.addr
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_buyer.is_del
     *
     * @return the value of bbs_buyer.is_del
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_buyer.is_del
     *
     * @param isDel the value for bbs_buyer.is_del
     *
     * @mbggenerated Sun Jun 19 20:18:14 CST 2016
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}