package com.clg.service;

public interface TestService {
    int run();

    String getUserDefineItem(String id);

    String getUserDefineItem(String table, String id);

    String getUserDefineItemSelective(String userId, String id);
}
