package com.shoal.qa.tests;


import com.shoal.qa.api.base.StatusCode;
import com.shoal.qa.api.base.UserApi;
import com.shoal.qa.api.pojo.User;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Epic("End-to-End Test- SHOAL CASE STUDY")
@Feature("API Validation - Rest Backend INVCOM API")
public class UserAPITests extends BaseTest {


    @Test(description = "should be able to create an user")
    public void ShouldBeAbleToCreateAnUser(){
        User requestUser = UserListsBuilder();
        Response response = UserApi.post(requestUser);
        assertStatusCode(response.statusCode(), StatusCode.CODE_201);
        assertUserListEqual(response.as(User.class), requestUser);
    }


    @Step
    public User UserListsBuilder() {
        return User.builder()
                .phone("1234")
                .accountNumber("888458")
                .emailID("abc@gmail.com")
                .customerID("111111")
                .nationalID("222222").
                build();
    }

    @Step
    public void assertUserListEqual(User responseUserList, User requestUserList){
        assertThat(responseUserList.getPhone(), equalTo(requestUserList.getPhone()));
        assertThat(responseUserList.getAccountNumber(), equalTo(requestUserList.getAccountNumber()));
        assertThat(responseUserList.getCustomerID(), equalTo(requestUserList.getCustomerID()));
        assertThat(responseUserList.getEmailID(), equalTo(requestUserList.getEmailID()));
        assertThat(responseUserList.getNationalID(), equalTo(requestUserList.getNationalID()));
    }

    @Step
    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
        assertThat(actualStatusCode, equalTo(statusCode.code));
    }

    @Step
    public void assertError(Error responseErr, StatusCode statusCode){
        assertThat(responseErr.getCause(), equalTo(statusCode.code));
        assertThat(responseErr.getCause().getMessage(), equalTo(statusCode.msg));
    }
}
