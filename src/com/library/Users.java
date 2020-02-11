package com.library;

import java.util.ArrayList;

public class Users {

    private ArrayList<User> users;

    public Users() {
        this.users = new ArrayList<User>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public void addUser(String name, String category){
        if(checkUser(name) == null){
            this.users.add(new User(name, category));
            System.out.println(name+" has been added to the "+ category + " category.");
        }
    }
    public User checkUser(String name){
        for(User userCheck: this.users){
            if(userCheck.getName().equals(name)){
                return userCheck;
            }
        } return null;
    }
    public void findUser(String name){
        for(User userCheck: this.users){
            if(userCheck.getName().equals(name)){
                System.out.println(name +" is a library user.");
            } else {
                System.out.println(name +" is not a library user.");
            }
        }
    }
    public String printUsers(){
        StringBuilder userList = new StringBuilder();
        userList.append('[');
        for(int i=0; i < users.size(); i++){
            userList.append(users.get(i).toString());
            if(i != users.size() - 1){
                userList.append(", ");
            }
        }
        userList.append(']');

        return userList.toString();
    }
}

