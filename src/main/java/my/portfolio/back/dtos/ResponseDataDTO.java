package my.portfolio.back.dtos;


import lombok.Data;

import java.util.List;

@Data
public class ResponseDataDTO {

    private Integer status;
    private String message;
    private List data;


}
