package com.api.jsonplaceholder.steps;

import com.api.jsonplaceholder.models.CommentResponse;
import com.api.jsonplaceholder.request.CommentRequest;
import org.testng.annotations.Test;

import java.util.List;

import static com.api.jsonplaceholder.Constants.USERID;
import static com.api.jsonplaceholder.Constants.USER_EMAIL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CommentsTest {
    public List<CommentResponse> commentsRes;

   @Test
    public void CommentsTest() {
        commentsRes = List.of(CommentRequest.fetchCommentOnPost((USERID)).as(CommentResponse[].class));
        assertThat("Verify the email is found in response body",
                commentsRes.stream().anyMatch(e->e.getEmail().
                equals(USER_EMAIL)), is(true));

    }
}
