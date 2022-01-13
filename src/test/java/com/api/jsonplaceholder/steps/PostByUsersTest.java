package com.api.jsonplaceholder.steps;

import com.api.jsonplaceholder.request.PostsRequest;
import com.api.jsonplaceholder.models.PostsResponse;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.api.jsonplaceholder.Constants.USERID;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PostByUsersTest {
    private List<PostsResponse> postsRes;


    @Test
    public void searchPostByUser() {
        postsRes = Arrays.asList(PostsRequest.getPostsByUserId(USERID).getBody().as(PostsResponse[].class));
        assertThat(postsRes.stream().anyMatch(s->s.getUserId().equals(USERID)), is(true));
    }
}
