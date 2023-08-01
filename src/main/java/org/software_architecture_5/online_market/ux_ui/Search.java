package org.software_architecture_5.online_market.ux_ui;

public interface Search {
//    public String name = null;
//    public String nameP = null;
//    User user = null;

    public default String findUser(User user, String name){
        if(user.getName() == name) return user.name;
        else return null;

    }
    
}
