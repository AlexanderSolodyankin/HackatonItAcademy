package kg.itacademy.restapi.service.impl;


import kg.itacademy.restapi.entity.Topic;
import kg.itacademy.restapi.repository.TopicRepository;
import kg.itacademy.restapi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> getAll() {
        return topicRepository.findAll();
    }

    @Override
    public Topic seve(Topic topic) {
        return topicRepository.save(topic);
    }
}
