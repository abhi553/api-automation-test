package com.shoal.qa.api.base;


import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class RestResource {

    public static Response postUser(String path, String token, Object requestUserList){
        return given(SpecBuilder.getUserRequestSpec()).
                body(requestUserList).
                auth().oauth2(token).
        when().post(path).
        then().spec(SpecBuilder.getResponseSpec()).
                extract().
                response();
    }

    public static Response postUser(HashMap<String, String> formParams){
        return given(SpecBuilder.getUserRequestSpec()).
                formParams(formParams).
        when().post(Route.API + Route.TOKEN).
        then().spec(SpecBuilder.getResponseSpec()).
                extract().
                response();
    }

    public static Response getUser(String path, String token){
        return given(SpecBuilder.getUserRequestSpec()).
                auth().oauth2(token).
        when().get(path).
        then().spec(SpecBuilder.getResponseSpec()).
                extract().
                response();
    }

    public static Response updateUser(String path, String token, Object requestUserList){
        return given(SpecBuilder.getUserRequestSpec()).
                auth().oauth2(token).
                body(requestUserList).
        when().put(path).
        then().spec(SpecBuilder.getResponseSpec()).
                extract().
                response();
    }
}
