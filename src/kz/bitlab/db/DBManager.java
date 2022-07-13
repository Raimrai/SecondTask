package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("Asylkhan","Aldanazar","Manager","600000"));
        users.add(new User("Nurtore","Knyazbek","HR","500000"));
        users.add(new User("Askar","Mukhmetkhanov","PR","400000"));
        users.add(new User("Nurbek","Aitkul","Management","300000"));
        users.add(new User("Raimbek","Nabiyev","IT","200000"));
    }
    public static void addUser(User user){
        users.add(user);
    }
    public static ArrayList<User> getAllUsers(){
        return users;
    }
}
