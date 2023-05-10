package apiEngine.request;

import lombok.Data;

@Data

public class SchemeEntity {
    public String creator;
    public String createdAt;
    public String createdBy;
    public String modifiedAt;
    public String modifiedBy;
    public String modifier;
    public String code;
    public String name;
    public String description;
    public String ulbCode;
    public String ulbEntity;
    public String type;
    public String ulbName;
    public String schemeEntity;
    public Integer clientCode;
    public Client client;
    public String abbreviation;
    public Integer totalApprovedAmount;
    public Integer fundsReleased;
    public String financialYear;
    public String schemeCode;
    public Boolean isEditing;
    public String changes;
    public Boolean editing;
    public Boolean deleted;
}
