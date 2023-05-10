package apiEngine.request;

import lombok.Data;

import java.util.List;

@Data
public class UlbEntity {
    public String creator;
    public String createdAt;
    public String createdBy;
    public String modifiedAt;
    public String modifiedBy;
    public String modifier;
    public String ulbCode;
    public String name;
    public String districtName;
    public String latitude;
    public String longitude;
    public String magnitude;
    public Integer gradeId;
    public String gradeName;
    public String licenseId;
    public String subClientId;
    public Boolean enableCloudMbRecordings;
    public String type;
    public String departmentGSTNumber;
    public String boundaryLatLng;
    public String schemeCode;
    public SchemeEntity schemeEntity;
    public String schemeName;
    public String agencyCode;
    public String agencyName;
    public String parentUlbCode;
    public String parentUlbEntity;
    public String schemeHierarchy;
    public String schemeHierarchyLevelOrder;
    public String schemeHierarchyLocation;
    public List<ChildAgencyDetail> childAgencyDetails;
    public ChildAgencyDetail childAgencyDetail;
    public String userNumber;
    public String bankName;
    public String branchName;
    public String bankAccountNumber;
    public String ifscCode;
    public String holdingAccountNumber;
    public String holdingAccountIfscCode;
    public String pmntRootuName;
    public String pmntRootuNumber;
    public Boolean ispmtRootDeleted;
    public Boolean deleted;
}
