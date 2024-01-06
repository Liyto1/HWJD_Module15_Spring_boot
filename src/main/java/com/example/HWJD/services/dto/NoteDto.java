package com.example.HWJD.services.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteDto {

    private Long id;

    @Size(min = 2, max = 250)
    private String title;

    @NotBlank
    private String content;
}
