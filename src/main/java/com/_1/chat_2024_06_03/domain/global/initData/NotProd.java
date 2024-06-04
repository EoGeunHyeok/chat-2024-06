package com._1.chat_2024_06_03.domain.global.initData;

import com._1.chat_2024_06_03.domain.chat.catRoom.entity.ChatRoom;
import com._1.chat_2024_06_03.domain.chat.catRoom.sevice.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;
@Configuration
@Profile("!prod")
public class NotProd {

    @Bean
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.make("요리");
            ChatRoom chatRoom2 = chatRoomService.make("운동");
            ChatRoom chatRoom3 = chatRoomService.make("음악");

            IntStream.rangeClosed(1, 30)
                    .forEach(no -> chatRoomService.write(chatRoom1.getId(), "박현철", "난 비룡보다 요리 잘함" + no));
        };
    }
}
