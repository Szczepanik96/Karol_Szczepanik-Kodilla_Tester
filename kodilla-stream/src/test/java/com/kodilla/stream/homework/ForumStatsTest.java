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
//        List<User> buddy = new ArrayList<>();

//        buddy.add(new User("Buddy1", 17, 743, "Dancer"));
//        buddy.add(new User("Buddy2", 66, 323, "Fireman"));
//        buddy.add(new User("Buddy3", 40, 626, "Dancer"));
//        buddy.add(new User("Buddy4", 41, 11, "Sniper"));
//        buddy.add(new User("Buddy5", 39, 262, "Fireman"));
//        buddy.add(new User("Buddy6", 24, 2622, "Sniper"));

        double expectNumberOfPostUsersUnder40 = (double)(UserRepository.getUserList().get(1).getNumberOfPost() + UserRepository.getUserList().get(2).getNumberOfPost())/2;

        assertEquals(expectNumberOfPostUsersUnder40,forumStats.numberOfPostUnder40(userRepository));
    }
}