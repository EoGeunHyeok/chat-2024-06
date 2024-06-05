package com._1.chat_2024_06_03.domain.chat.chatMessage.entity;

import com._1.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import com._1.chat_2024_06_03.domain.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static lombok.AccessLevel.PROTECTED;

@Entity
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {


    @ManyToOne
    private ChatRoom chatRoom;


    private String writerName;


    private String content;





}
