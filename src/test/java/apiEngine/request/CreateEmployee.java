package apiEngine.request;


import lombok.Data;

import java.util.List;

@Data
public class CreateEmployee {
    public List<EmployeeULBDesignationEntity> employeeULBDesignationEntities;
    public String designation;
    public String permissions;
    public String profilePicture;
    public String employeeId;
    public Integer designationId;
    public DesignationsEntity designationsEntity;
    public List<DesignationPermissionEntity> designationPermissionEntities;
    public String name;
    public String password;
    public String mobileNumber;
    public String gender;
    public String email;
    public String pan;
    public String photoPath;
    public String createdBy;
    public String createdAt;
    public String modifiedBy;
    public String modifiedAt;
    public Boolean enabled;
    public Boolean isDeleted;
    public Boolean isTransferred;
    public Boolean hasWritePermission;
    public String ipAddress;
    public String cloudLastLog;
    public String mobileLastLog;
    public Boolean accountNonExpired;
    public Boolean accountNonLocked;
    public Boolean credentialsNonExpired;
    public String otp;
    public String otpMobileNumber;
    public String otpVerifiedAt;
    public String otpExpiresAt;
    public Boolean hasAgreedTerms;
    public String regId;
    public String deviceModel;
    public String mobileVersion;
    public String mobileSessionId;
    public String mobileLoginStatus;
    public String aadharNumber;
    public String address;
    public String versionName;
    public String deviceId;
    public String ulbCode;
    public String ulbName;
    public List<EmployeeULBDesignation> employeeULBDesignations;
    public String oldPhotoPath;
    public String designationName;
    public String departmentName;
    public String token;
    public String mobileIpAddress;
    public String mobileLastLocation;
    public String lastSyncTime;
    public String transferOtp;
    public String transferOtpExpiresAt;
    public String username;
    public Boolean deleted;
    public Boolean transferred;
}
