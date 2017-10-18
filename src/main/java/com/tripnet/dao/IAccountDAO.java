package com.tripnet.dao;

public interface IAccountDAO<T> {
    boolean accountExists(String username, String email);
}
