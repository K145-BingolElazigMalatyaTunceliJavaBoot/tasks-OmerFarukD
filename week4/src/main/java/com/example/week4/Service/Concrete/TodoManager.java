package com.example.week4.Service.Concrete;

import com.example.week4.Core.Results.*;
import com.example.week4.DataAccess.ITodoRepository;
import com.example.week4.Dto.Requests.CreateTodoRequest;
import com.example.week4.Dto.Requests.DeleteTodoRequest;
import com.example.week4.Dto.Requests.UpdateTodoRequest;
import com.example.week4.Dto.Response.ListTodoResponse;
import com.example.week4.Entity.Todo;
import com.example.week4.Service.Abstract.ITodoService;
import com.example.week4.Service.Constants.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoManager implements ITodoService {

    @Autowired
    private ITodoRepository todoRepository;

    @Override
    public Result add(CreateTodoRequest request) {
        Todo todo=new Todo();
        todo.setDays(request.getDay());
        todo.setTitle(request.getTitle());
        todo.setDone(request.isDone());
        todo.setWeekByNumber(request.getWeekByNumber());


        this.todoRepository.save(todo);

        return new SuccessResult(Messages.todoAddedMessage);
    }

    @Override
    public DataResult<List<ListTodoResponse>> getAll() {
        return new SuccessDataResult<List<ListTodoResponse>>(this.todoRepository.getAllDetails());
    }

    @Override
    public DataResult<List<ListTodoResponse>> getAllOneWeek(int weekByNumber) {
        return new SuccessDataResult<List<ListTodoResponse>>(this.todoRepository.getAllOneWeek(weekByNumber));
    }

    @Override
    public Result toDoUpdate(UpdateTodoRequest request) {
        Todo todo=this.todoRepository.getById(request.getId());


        todo.setDone(request.isDone());

        this.todoRepository.save(todo);
        return new SuccessResult(Messages.UpdateTodoMessage);
    }

    @Override
    public Result deleteTodo(DeleteTodoRequest request) {
        Todo todo=this.todoRepository.getById(request.getId());
        this.todoRepository.delete(todo);
        return new SuccessResult(Messages.deletedTodo);
    }

}
