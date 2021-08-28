package kg.itacademy.restapi.repository;

import kg.itacademy.restapi.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
