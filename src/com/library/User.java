package com.library;

public class User implements Comparable<User>{
    private String name;
    private String category;

    public User(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name + " is in the " + this.category + " Category";
    }

    @Override
    public int compareTo(User user) {
        if ((this.category.equals("teacher") && user.getCategory().equals("senior")) || (this.category.equals("teacher") && user.getCategory().equals("junior")) || (this.category.equals("senior") && user.getCategory().equals("junior"))) {
            return -1;
        }
        if((this.category.equals("junior") && user.getCategory().equals("senior")) || (this.category.equals("junior") && user.getCategory().equals("teacher")) || (this.category.equals("senior") && user.getCategory().equals("teacher"))) {
            return 1;
        }
        return 0;
    }

}