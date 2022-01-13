package com.api.jsonplaceholder.request;

import com.api.jsonplaceholder.api.endpoints;
import com.api.jsonplaceholder.common.Spec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CommentRequest {
    public static Response fetchCommentOnPost(int postId) {
        Response commentOnPostRes = given()
                .spec(Spec.getCommonSpec())
                .pathParam("postId", postId)
                .get(endpoints.POSTS + "/{postId}" + endpoints.COMMENTS);
        assertThat(commentOnPostRes.statusCode(), is(equalTo(SC_OK)));
        return commentOnPostRes;
    }
}
