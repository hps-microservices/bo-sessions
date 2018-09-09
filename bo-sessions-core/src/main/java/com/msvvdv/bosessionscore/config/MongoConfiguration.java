package com.msvvdv.bosessionscore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = {"com.msvvdv.bosessionscore.repository"})
public class MongoConfiguration {}
