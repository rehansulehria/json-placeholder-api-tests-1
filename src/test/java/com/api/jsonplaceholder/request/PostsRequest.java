package com.api.jsonplaceholder.request;

import com.api.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static com.api.jsonplaceholder.api.endpoints.POSTS;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PostsRequest {

    public static Response getPostsByUserId(int userId) {
        Response getPostResp = given()
                .spec(Spec.getCommonSpec())
                .queryParam("userId", userId)
                .get(POSTS);
        assertThat(getPostResp.statusCode(), is(equalTo(SC_OK)));
        assertThat(getPostResp.jsonPath().getString("title"), is(notNullValue()));
        assertThat(getPostResp.jsonPath().getString("body"), is(notNullValue()));
        assertThat(getPostResp.jsonPath().getString("userId"), containsString(("9")));
        return getPostResp;
    }
}