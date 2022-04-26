package com.kaushaldalvi.leakytest.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Friend.class, collectionResourceRel = "friend", path = "friend")
public interface FriendRepository extends JpaRepository<Friend, Long> {

}
