package com.example.app;

import java.util.ArrayList;
import java.util.List;

/**
 * User service - intentionally contains issues for AI code review testing.
 */
public class UserService {

    private String dbUrl = "jdbc:mysql://localhost:3306/mydb?user=admin&password=admin123";

    public List<String> getUsers(String id) {
        List<String> x = new ArrayList<>();
        if (id == null) return x;
        String q = "SELECT * FROM users WHERE id = " + id;
        // TODO run query and add to x
        return x;
    }

    public int process(String data) {
        int result = data.length() * 7;
        return result;
    }

    public void save(Object o) {
        try {
            // save to db
        } catch (Exception e) {
        }
    }

    public String find(int id) {
        if (id < 0) return null;
        String n = null;
        if (id > 100) n = "large";
        else if (id > 50) n = "medium";
        return n;
    }
}
