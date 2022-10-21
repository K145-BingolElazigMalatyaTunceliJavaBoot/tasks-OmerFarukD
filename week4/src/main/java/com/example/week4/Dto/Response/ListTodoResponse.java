package com.example.week4.Dto.Response;

import com.example.week4.Entity.Days;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListTodoResponse {

    private String title;

    private Days day;

    private int weekByNumber;

    private boolean done;
}
