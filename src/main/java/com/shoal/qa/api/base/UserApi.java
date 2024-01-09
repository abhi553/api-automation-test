package com.shoal.qa.api.base;



import com.shoal.qa.api.pojo.User;
import com.shoal.qa.api.utils.ConfigLoader;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class UserApi {

    @Step
    public static Response post(User requestUserList){
        return RestResource.postUser(Route.USERS + "/" + ConfigLoader.getInstance().getUser()
                , TokenManager.getToken(), requestUserList);
    }

    public static Response post(String token, User requestUserList){
        return RestResource.postUser(Route.USERS + "/" + ConfigLoader.getInstance().getUser(),
                token, requestUserList);
    }

    public static Response get(String userListId){
        return RestResource.getUser(Route.USERS +  "/" + userListId, TokenManager.getToken());
    }

    public static Response update(String userListId, User requestUserList){
        return RestResource.updateUser(Route.USERS +   "/" + userListId, TokenManager.getToken(), requestUserList);
    }
}
