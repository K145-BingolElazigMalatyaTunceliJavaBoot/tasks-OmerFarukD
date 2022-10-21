package com.example.week4.Service.Abstract;

import com.example.week4.Core.Results.DataResult;
import com.example.week4.Core.Results.Result;
import com.example.week4.Dto.Requests.CreateTodoRequest;
import com.example.week4.Dto.Requests.DeleteTodoRequest;
import com.example.week4.Dto.Requests.UpdateTodoRequest;
import com.example.week4.Dto.Response.ListTodoResponse;

import java.util.List;

public interface ITodoService {
    Result add(CreateTodoRequest request);
    DataResult<List<ListTodoResponse>> getAll();
    DataResult<List<ListTodoResponse>> getAllOneWeek(int weekByNumber);
    Result toDoUpdate(UpdateTodoRequest request);
    Result deleteTodo(DeleteTodoRequest request);
}
