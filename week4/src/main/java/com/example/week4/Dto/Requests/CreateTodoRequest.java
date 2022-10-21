package com.example.week4.Dto.Requests;

import com.example.week4.Entity.Days;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CreateTodoRequest {

    @NotEmpty
    @NotNull
    private String title;

    @NotNull
    private Days day;

    @NotNull
    private int weekByNumber;

    @NotNull
    private boolean done;
}
