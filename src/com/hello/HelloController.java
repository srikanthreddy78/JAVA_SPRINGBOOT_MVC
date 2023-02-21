package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topics topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topic,@PathVariable String id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
