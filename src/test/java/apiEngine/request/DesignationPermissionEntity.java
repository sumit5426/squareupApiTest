package apiEngine.request;

import lombok.Data;

@Data
public class DesignationPermissionEntity {
    public String permissions;
    public Integer designationId;
    public DesignationsEntity designationsEntity;
    public Integer type;
    public String title;
    public String module;
    public String moduleName;
    public Boolean isAssigned;
    public String name;
    public String description;
    public Boolean isEnabled;
    public Integer permissionOrder;
    public String projectCategory;
    public Boolean enabled;
    public Boolean assigned;
}
