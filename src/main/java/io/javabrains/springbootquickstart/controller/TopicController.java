package io.javabrains.springbootquickstart.controller;

import io.javabrains.springbootquickstart.dao.Topics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return Arrays.asList(
                new Topics("spring", "Spring Framework", "Spring Framework Description"),
                new Topics("java", "core java", "Core java Description"),
                new Topics("javascript", "JavaScript", "JavaScript Description")
        );
    }
}
