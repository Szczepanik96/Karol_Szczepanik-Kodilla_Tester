package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import static java.util.Arrays.stream;

public class ForumStats {
    public short numberOfPostUnder40(UserRepository userRepository) {
        double avgUnder40;
        avgUnder40 = userRepository.getUserList()
                .stream()
                .mapToDouble(numberOfPost -> numberOfPost.getNumberOfPost())
                .filter(age -> age < 40)
                .average()
                .getAsDouble();
        System.out.println("Users under 39 and their average number of post " + avgUnder40);
        return (short) avgUnder40;

    }

    public short numberOfPostOver40(UserRepository userRepository) {
        double avgOver40;
        avgOver40 = userRepository.getUserList()
                .stream()
                .mapToDouble(User::getNumberOfPost)
                .filter(age -> age >= 40)
                .average()
                .getAsDouble();
        System.out.println("Users over 40 and their average number of post " + avgOver40);
        return (short)avgOver40;
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        UserRepository userRepository = new UserRepository();
        forumStats.numberOfPostOver40(userRepository);
        forumStats.numberOfPostUnder40(userRepository);
    }
}