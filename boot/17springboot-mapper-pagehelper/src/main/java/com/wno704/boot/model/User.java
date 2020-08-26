package com.wno704.boot.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 部门ID
     */
    @Column(name = "DEPT_ID")
    private Long deptId;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 联系电话
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 状态 0锁定 1有效
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    /**
     * 最近访问时间
     */
    @Column(name = "LAST_LOGIN_TIME")
    private Date lastLoginTime;

    /**
     * 性别 0男 1女 2保密
     */
    @Column(name = "SSEX")
    private String ssex;

    /**
     * 是否开启tab，0关闭 1开启
     */
    @Column(name = "IS_TAB")
    private String isTab;

    /**
     * 主题
     */
    @Column(name = "THEME")
    private String theme;

    /**
     * 头像
     */
    @Column(name = "AVATAR")
    private String avatar;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户ID
     *
     * @return USER_ID - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取部门ID
     *
     * @return DEPT_ID - 部门ID
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置部门ID
     *
     * @param deptId 部门ID
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取联系电话
     *
     * @return MOBILE - 联系电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系电话
     *
     * @param mobile 联系电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取状态 0锁定 1有效
     *
     * @return STATUS - 状态 0锁定 1有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 0锁定 1有效
     *
     * @param status 状态 0锁定 1有效
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return MODIFY_TIME - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取最近访问时间
     *
     * @return LAST_LOGIN_TIME - 最近访问时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最近访问时间
     *
     * @param lastLoginTime 最近访问时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取性别 0男 1女 2保密
     *
     * @return SSEX - 性别 0男 1女 2保密
     */
    public String getSsex() {
        return ssex;
    }

    /**
     * 设置性别 0男 1女 2保密
     *
     * @param ssex 性别 0男 1女 2保密
     */
    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    /**
     * 获取是否开启tab，0关闭 1开启
     *
     * @return IS_TAB - 是否开启tab，0关闭 1开启
     */
    public String getIsTab() {
        return isTab;
    }

    /**
     * 设置是否开启tab，0关闭 1开启
     *
     * @param isTab 是否开启tab，0关闭 1开启
     */
    public void setIsTab(String isTab) {
        this.isTab = isTab == null ? null : isTab.trim();
    }

    /**
     * 获取主题
     *
     * @return THEME - 主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置主题
     *
     * @param theme 主题
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * 获取头像
     *
     * @return AVATAR - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", deptId=").append(deptId);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", ssex=").append(ssex);
        sb.append(", isTab=").append(isTab);
        sb.append(", theme=").append(theme);
        sb.append(", avatar=").append(avatar);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}