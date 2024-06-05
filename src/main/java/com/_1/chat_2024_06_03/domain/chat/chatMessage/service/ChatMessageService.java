package com._1.chat_2024_06_03.domain.chat.chatMessage.service;

import com._1.chat_2024_06_03.domain.chat.chatMessage.repository.ChatMessageRepository;
import com._1.chat_2024_06_03.domain.chat.chatMessage.entity.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public List<ChatMessage> findByChatRoomAndIdAfter(long roomId, long afterId){
        return chatMessageRepository.findByChatRoomIdAndIdAfter(roomId, afterId);
    }
}
