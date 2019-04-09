package com.szilardz.talkabothomework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.szilardz.talkabothomework.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    Message findAllById(Long id);
}
