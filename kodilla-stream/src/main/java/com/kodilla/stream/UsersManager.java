package com.kodilla.stream;

        import java.util.List;
        import java.util.stream.Collectors;


public class UsersManager {

    public static List<String> filterChemistGroupUsernames(List<User> newUsers) {
        List<String> usernames = newUsers
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsernames();
    }

    public static List<Integer> filterUsersOlderThan(List<User> newUsers) {
        List<Integer> oldUsers = newUsers
                .stream()
                .filter(i -> getUserAge(i) > 40)
                .map(UsersManager:: getUserAge)
                .collect(Collectors.toList());
        return oldUsers;
    }
    public static Integer getUserAge(User userAge){
        return userAge.getAge();
    }
    public static List<Integer> filterUsersWithNameLength(List<User> newUsers){
        List<Integer> nameLength = newUsers
                .stream()
                .filter(i -> getUserNameLength(i) > 7)
                .map(UsersManager::getUserNameLength)
                .collect(Collectors.toList());
        return nameLength;

    }
    public static Integer getUserNameLength(User user){
        return user.getUsernames().length();
    }
}