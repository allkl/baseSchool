package com.uas.system.domain;

import com.uas.inte.annotation.ExcelField;
import com.uas.inte.annotation.ExcelSheet;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName ExcelUserDO
 * @Description TODO
 * @Author jinxing.chen
 * @Date 2018/12/3 11:42
 * @Version 1.o
 */

@ExcelSheet(name = "教师列表", headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN)
public class ExcelUserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    //编号
    @ExcelField(name = "编号")
    private Long userId;
    //名字
    @ExcelField(name = "姓名")
    private String userName;
    //密码
    @ExcelField(name = "密码")
    private String userPass;
    //学历
    @ExcelField(name = "学历")
    private String userEducation;
    //岗位
    @ExcelField(name = "岗位")
    private String userStation;
    //状态  1使用  2冻结
    @ExcelField(name = "账户状态")
    private Integer userStatus;
    //微信关联
    @ExcelField(name = "微信关联")
    private String userOpenid;
    //手机号
    @ExcelField(name = "手机号")
    private String userPhone;
    //性别 1男，2女
    @ExcelField(name = "性别")
    private Integer userSex;
    //年龄
    @ExcelField(name = "年龄")
    private Integer userAge;
    //生日
    @ExcelField(name = "生日")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBirthday;
    //头像
    @ExcelField(name = "头像")
    private String userPhoto;
    //地址
    @ExcelField(name = "地址")
    private String userAddress;
    //工号
    @ExcelField(name = "工号")
    private String jobNumber;
    //职业
    @ExcelField(name = "职业")
    private String userProfession;
    //备注
    @ExcelField(name = "备注")
    private String userRemarks;
    //角色
    //@ExcelField(name = "分配的角色")
    //private String roleIds;
    //部门
    //@ExcelField(name = "负责的部门")
   // private String schIds;
    //学生
    //@ExcelField(name = "负责的学生")
    //private String stuIds;

    /**
     * 设置：编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**
     * 获取：编号
     */
    public Long getUserId() {
        return userId;
    }
    /**
     * 设置：名字
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * 获取：名字
     */
    public String getUserName() {
        return userName;
    }
    /**
     * 设置：密码
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    /**
     * 获取：密码
     */
    public String getUserPass() {
        return userPass;
    }
    /**
     * 设置：学历
     */
    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }
    /**
     * 获取：学历
     */
    public String getUserEducation() {
        return userEducation;
    }
    /**
     * 设置：岗位
     */
    public void setUserStation(String userStation) {
        this.userStation = userStation;
    }
    /**
     * 获取：岗位
     */
    public String getUserStation() {
        return userStation;
    }
    /**
     * 设置：微信关联
     */
    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
    }
    /**
     * 获取：微信关联
     */
    public String getUserOpenid() {
        return userOpenid;
    }
    /**
     * 设置：手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    /**
     * 获取：手机号
     */
    public String getUserPhone() {
        return userPhone;
    }
    /**
     * 设置：年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    /**
     * 获取：年龄
     */
    public Integer getUserAge() {
        return userAge;
    }
    /**
     * 设置：生日
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }
    /**
     * 获取：生日
     */
    public Date getUserBirthday() {
        return userBirthday;
    }
    /**
     * 设置：头像
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
    /**
     * 获取：头像
     */
    public String getUserPhoto() {
        return userPhoto;
    }
    /**
     * 设置：地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    /**
     * 获取：地址
     */
    public String getUserAddress() {
        return userAddress;
    }
    /**
     * 设置：工号
     */
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }
    /**
     * 获取：工号
     */
    public String getJobNumber() {
        return jobNumber;
    }
    /**
     * 设置：职业
     */
    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession;
    }
    /**
     * 获取：职业
     */
    public String getUserProfession() {
        return userProfession;
    }
    /**
     * 设置：备注
     */
    public void setUserRemarks(String userRemarks) {
        this.userRemarks = userRemarks;
    }
    /**
     * 获取：备注
     */
    public String getUserRemarks() {
        return userRemarks;
    }
    /**
     * 设置：性别 1男，2女
     */
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }
    /**
     * 获取：性别 1男，2女
     */
    public Integer getUserSex() {
        return userSex;
    }

    /**
     * 设置：状态  1使用  2冻结
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
    /**
     * 获取：状态  1使用  2冻结
     */
    public Integer getUserStatus() {
        return userStatus;
    }

}
