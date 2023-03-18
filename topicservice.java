package com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    public List<Topics> getAllTopics(){
        List<Topics> topics1  = new ArrayList<>();
        topicRepository.findAll().forEach(topics1::add);
        return topics1;
    }

    public Topics getTopic(String id){
        return topicRepository.findOne(id);
    }

    public void addTopic(Topics topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topics topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
