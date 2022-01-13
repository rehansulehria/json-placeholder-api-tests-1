package com.api.jsonplaceholder.common;

import com.api.jsonplaceholder.api.endpoints;
import com.api.jsonplaceholder.report.AllureManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Spec {
    @BeforeSuite
    public void beforeSuite() {
        AllureManager.setAllureEnvironmentInformation();
    }

    @BeforeClass
    public static RequestSpecification getCommonSpec() {
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setBaseUri(endpoints.BASE_URI)
                .setContentType(ContentType.JSON)
                .setUrlEncodingEnabled(false);
        return reqBuilder.build();
    }
}
