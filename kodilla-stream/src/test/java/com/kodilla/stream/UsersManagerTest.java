package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void shouldReturnAllChemists() {

        UsersManager usersManager = new UsersManager();
        List<User> newUsers = new ArrayList<>();

        newUsers.add(new User("Maria Curie", 51, 6, "Chemists"));
        newUsers.add(new User("Nobel", 12, 64, "Chemists"));
        newUsers.add(new User("Edison", 62, 90, "Engineer"));
        newUsers.add(new User("Tesla", 25, 22, "Engineer"));
        newUsers.add(new User("Einstein", 53, 1243, "Chemists"));

        List<String> chemists = usersManager.filterChemistGroupUsernames(newUsers);
        assertEquals(3, chemists.size());
    }

    @Test
    public void shouldReturnUsersOlderThan(){
        UsersManager usersManager = new UsersManager();
        List<User> newUsers = new ArrayList<>();

        newUsers.add(new User("Maria Curie", 51, 6, "Chemists"));
        newUsers.add(new User("Nobel", 12, 64, "Chemists"));
        newUsers.add(new User("Edison", 62, 90, "Engineer"));
        newUsers.add(new User("Tesla", 40, 22, "Engineer"));
        newUsers.add(new User("Einstein", 41, 1243, "Chemists"));

        List<Integer> olderThan = usersManager.filterUsersOlderThan(newUsers);
        assertEquals(3,olderThan.size());
    }
    @Test
    public void shouldReturnUsersWithNameLength(){
        UsersManager usersManager = new UsersManager();
        List<User> newUsers = new ArrayList<>();

        newUsers.add(new User("Maria Curie", 51, 6, "Chemists"));
        newUsers.add(new User("Nobel", 12, 64, "Chemists"));
        newUsers.add(new User("Edison", 62, 90, "Engineer"));
        newUsers.add(new User("Tesla", 40, 22, "Engineer"));
        newUsers.add(new User("Einstein", 41, 1243, "Chemists"));

        List<Integer> nameLength = usersManager.filterUsersWithNameLength(newUsers);
        assertEquals(2,nameLength.size());

    }
}