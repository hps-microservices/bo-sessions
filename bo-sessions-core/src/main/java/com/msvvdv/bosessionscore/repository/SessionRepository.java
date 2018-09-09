package com.msvvdv.bosessionscore.repository;

import com.msvvdv.bosessionscore.entity.Session;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SessionRepository extends MongoRepository<Session,String> {}
