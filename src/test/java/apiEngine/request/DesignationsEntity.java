package apiEngine.request;

import lombok.Data;

@Data
public class DesignationsEntity {
    public String creator;
    public String createdAt;
    public String createdBy;
    public String modifiedAt;
    public String modifiedBy;
    public String modifier;
    public Integer id;
    public String name;
    public String abbrevation;
    public Boolean deleted;
}
