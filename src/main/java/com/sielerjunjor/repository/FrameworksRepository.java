package com.sielerjunjor.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.sielerjunjor.models.Frameworks;

public interface FrameworksRepository extends MongoRepository<Frameworks, String> {

	Frameworks findById(ObjectId id);
	
}
