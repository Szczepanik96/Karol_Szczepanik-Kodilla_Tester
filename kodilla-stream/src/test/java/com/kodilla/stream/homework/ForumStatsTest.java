package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void shouldReturnNumberOfPostUsersUnder40() {
        UserRepository userRepository = new UserRepository();
        ForumStats forumStats = new ForumStats();

        double expectNumberOfPostUsersUnder40 = (double)(UserRepository.getUserList().get(1).getNumberOfPost() + UserRepository.getUserList().get(2).getNumberOfPost())/2;

        assertEquals(expectNumberOfPostUsersUnder40,forumStats.numberOfPostUnder40(userRepository));

        System.out.println(forumStats.numberOfPostOver40(userRepository));
    }
}