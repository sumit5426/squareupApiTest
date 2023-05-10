package apiEngine.response;

import lombok.Data;

@Data
public class CreateEmployeePositiveResponse {
    public Integer status;
    public Boolean flag;
    public String message;
    public Object response;
    public Object otherInfo;
}
