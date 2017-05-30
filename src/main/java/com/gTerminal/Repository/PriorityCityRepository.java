package com.gTerminal.Repository;

import com.gTerminal.Entity.PriorityCity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PriorityCityRepository  extends MongoRepository<PriorityCity, String> {


    List<PriorityCity> findByZipCode(String zipCode);
}
