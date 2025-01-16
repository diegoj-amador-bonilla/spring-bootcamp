package io.javabrains.springbootquickstart.repository;

import io.javabrains.springbootquickstart.dao.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
