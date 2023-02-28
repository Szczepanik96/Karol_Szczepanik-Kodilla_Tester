package com.kodilla.homework;

import java.util.*;

public class WeatherHazardSystemService {


    public HashMap<Location,Set<User>> usersInLocation = new HashMap<>();

    public void sendAlert(Location location,Alert alert){
       usersInLocation.forEach((locations,users) -> users.forEach(user -> user.receive(alert)));
    }

    public void addLocation(Location location){
        usersInLocation.put(location,new HashSet<>());
    }

    public void removeLocation(Location location){
        usersInLocation.remove(location);
    }

    public void addUserToLocation(Location location,User user){
        usersInLocation.get(location).add(user);
    }

    public void removeUserFromLocation(Location location,User user){
        usersInLocation.get(location).remove(user);
    }

    public void removeUserFromAllLocations(User user){
        usersInLocation.forEach(((location, users) -> users.remove(user)));
    }
}
