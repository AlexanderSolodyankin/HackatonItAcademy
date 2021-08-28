package kg.itacademy.restapi.service;

import kg.itacademy.restapi.entity.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> getAll();
    Topic seve(Topic topic);

}
