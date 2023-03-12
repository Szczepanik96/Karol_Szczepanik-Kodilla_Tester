package com.kodilla.homework;

import java.util.*;

public class WeatherHazardSystemService {


    public HashMap<Location,Set<User>> usersLocationsMap = new HashMap<>();

    public void sendAlertToAll(Alert alert){
       usersLocationsMap.forEach((locations, users) -> users.forEach(user -> user.receive(alert)));
    }
    public void sendAlertToUsersInLocation(Location location,Alert alert){
        usersLocationsMap.get(location).forEach(user -> user.receive(alert));
    }

    public void addLocation(Location location){
        usersLocationsMap.put(location,new HashSet<>());
    }

    public void removeLocation(Location location){
        usersLocationsMap.remove(location);
    }

    public void addUserToLocation(Location location,User user){
        usersLocationsMap.get(location).add(user);
    }

    public void removeUserFromLocation(Location location,User user){
        usersLocationsMap.get(location).remove(user);
    }

    public void removeUserFromAllLocations(User user){
        usersLocationsMap.forEach(((location, users) -> users.remove(user)));
    }
}