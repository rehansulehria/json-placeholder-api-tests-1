package com.api.jsonplaceholder.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersResponse {
    @JsonProperty("id")
    public int id;

    @JsonProperty("email")
    public String email;

    @JsonProperty("username")
    public String username;

    @JsonProperty("name")
    public String name;

    @JsonProperty("website")
    public String website;

    @JsonProperty("address")
    public Map address;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("company")
    public Map company;

}
