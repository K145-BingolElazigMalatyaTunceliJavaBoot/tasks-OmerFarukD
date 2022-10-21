package com.example.week4.Dto.Requests;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdateTodoRequest {

    @NotNull
    private int id;

    @NotNull
    private boolean done;
}
