package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import static java.util.Arrays.stream;

public class ForumStats {
    public double numberOfPostUnder40(UserRepository userRepository) {
        return userRepository.getUserList()
                .stream()
                .filter(user -> user.getAge()< 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public double numberOfPostOver40(UserRepository userRepository) {
        return userRepository.getUserList()
                .stream()
                .filter(user -> user.getAge()>=40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        UserRepository userRepository = new UserRepository();
        forumStats.numberOfPostOver40(userRepository);
        forumStats.numberOfPostUnder40(userRepository);
    }
}