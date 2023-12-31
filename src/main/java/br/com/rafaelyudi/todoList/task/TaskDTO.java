package br.com.rafaelyudi.todoList.Task;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDTO(String description, String title, String priority, LocalDateTime startAt, LocalDateTime endAt, UUID idUser) {
    
}
