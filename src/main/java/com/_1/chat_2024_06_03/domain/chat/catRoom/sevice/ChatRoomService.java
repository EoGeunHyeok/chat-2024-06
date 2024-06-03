package com._1.chat_2024_06_03.domain.chat.catRoom.sevice;

import com._1.chat_2024_06_03.domain.chat.catRoom.entity.ChatRoom;
import com._1.chat_2024_06_03.domain.chat.catRoom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    public void make(String name){
        ChatRoom chatRoom = new ChatRoom(name);

        chatRoomRepository.save(chatRoom);
    }

    public List<ChatRoom> findAll() {
        return chatRoomRepository.findAll();

    }
}
