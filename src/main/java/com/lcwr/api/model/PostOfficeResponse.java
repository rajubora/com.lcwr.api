package com.lcwr.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostOfficeResponse {

    @JsonProperty("Message")
     private  String message;
  @JsonProperty("Status")
  private String status;

    @JsonProperty("PostOffice")

    private List<PostOfficeDetails>   postOffice;

}
