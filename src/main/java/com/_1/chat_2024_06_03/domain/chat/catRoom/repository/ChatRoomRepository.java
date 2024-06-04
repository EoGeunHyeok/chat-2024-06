package com._1.chat_2024_06_03.domain.chat.catRoom.repository;

import com._1.chat_2024_06_03.domain.chat.catRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

}
