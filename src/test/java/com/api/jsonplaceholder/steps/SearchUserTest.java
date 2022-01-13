package com.api.jsonplaceholder.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import com.api.jsonplaceholder.models.UsersResponse;
import com.api.jsonplaceholder.request.UserRequest;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SearchUserTest {
    private UsersResponse[] response;

   @Test
    public void searchUser() {
        response = UserRequest.getUser().as(UsersResponse[].class);
       assertThat(Arrays.stream(response)
               .anyMatch(s -> s.getUsername()
                       .contains("Delphine")), is(true));

    }
}
