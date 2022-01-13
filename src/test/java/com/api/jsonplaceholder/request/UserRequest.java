package com.api.jsonplaceholder.request;

import com.api.jsonplaceholder.api.endpoints;
import com.api.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRequest {
    public static Response getUser() {
        Response response = given()
                .spec(Spec.getCommonSpec())
                .get(endpoints.USERS);
        return response;
    }
}
