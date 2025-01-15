package io.javabrains.springbootquickstart.dao;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
