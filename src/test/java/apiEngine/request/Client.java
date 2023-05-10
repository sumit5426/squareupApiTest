package apiEngine.request;

import lombok.Data;

@Data
public class Client {
    public Integer clientCode;
    public String clientName;
    public String description;
    public String abbreviation;
    public Boolean isDeleted;
    public Boolean deleted;
}
