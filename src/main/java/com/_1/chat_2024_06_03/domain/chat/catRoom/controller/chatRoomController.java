package com._1.chat_2024_06_03.domain.chat.catRoom.controller;

import com._1.chat_2024_06_03.domain.chat.catRoom.entity.ChatRoom;
import com._1.chat_2024_06_03.domain.chat.catRoom.sevice.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chat/room")
@RequiredArgsConstructor
public class chatRoomController {
    private final ChatRoomService chatRoomService ;
    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(
            @PathVariable("roomId") final long roomId,
            @RequestParam(name = "writerName", defaultValue = "NoName") final String writerName
    ) {
        return "%d번 채팅방 입니담. writer : %s".formatted(roomId, writerName);
    }

    @GetMapping("/make")
    public String showMake() {
        return "domain/chat/chatRoom/make";
    }
    @PostMapping("/make")
    public String showMake(
            final String name
    ) {
        chatRoomService.make(name);
        return "redirect:/chat/room/make?message=Chat Room Created";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<ChatRoom> showList() {
        return chatRoomService.findAll();
    }
}
