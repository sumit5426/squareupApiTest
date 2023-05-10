package apiEngine.request;

import lombok.Data;

@Data
public class EmployeeULBDesignationEntity {
    public String employeeDesignationId;
    public String employeeId;
    public String employeeEntity;
    public String ulbCode;
    public UlbEntity ulbEntity;
    public Integer designationId;
    public DesignationsEntity designationsEntity;
    public Boolean activeStatus;
    public String fromDate;
    public String toDate;
    public Boolean deleted;
    public Integer designationsOrder;
    public Boolean baseDesignation;
}
