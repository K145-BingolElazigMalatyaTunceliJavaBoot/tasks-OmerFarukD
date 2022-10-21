package com.example.week4.Api.Controller;

import com.example.week4.Core.ApiError.ApiError;
import com.example.week4.Dto.Requests.CreateTodoRequest;
import com.example.week4.Dto.Requests.DeleteTodoRequest;
import com.example.week4.Dto.Requests.UpdateTodoRequest;
import com.example.week4.Service.Abstract.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoController {


    @Autowired
    private ITodoService todoService;

    @PostMapping("/add")
    public ResponseEntity<?> addTodo(@Valid @RequestBody CreateTodoRequest request){
        var data= this.todoService.add(request);
        if (!data.isSuccess()) return   ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data.getMessage());
        return ResponseEntity.status(HttpStatus.CREATED).body(data);
    }

    @GetMapping("/getalldetails")
    public ResponseEntity<?> getAllDetails(){
        var data=this.todoService.getAll();
        if (!data.isSuccess()) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data.getMessage());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
    }
    @PostMapping("/todoupdate")
    public ResponseEntity<?> toDoUpdate(@Valid @RequestBody UpdateTodoRequest request){
        var data=this.todoService.toDoUpdate(request);
        if (!data.isSuccess()) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data.getMessage());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
    }
    @GetMapping("/getallweekbynumber")
    public ResponseEntity<?> getAllWeekByNumber(@RequestParam int weekByNumber){
        var data=this.todoService.getAllOneWeek(weekByNumber);
        if (!data.isSuccess()) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data.getMessage());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
    }


    @PostMapping("/delete")
    public ResponseEntity<?> deleteByMapping(@RequestBody DeleteTodoRequest request){
        var data=this.todoService.deleteTodo(request);
        if (!data.isSuccess()) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data.getMessage());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
    }




    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleException(MethodArgumentNotValidException exception){
        ApiError error=new ApiError(400,"validation error","/api/1.0/todos");
        Map<String,String> validationErrors=new HashMap<String,String>();
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        error.setValidationErrors(validationErrors);
        return error;
    }
}
