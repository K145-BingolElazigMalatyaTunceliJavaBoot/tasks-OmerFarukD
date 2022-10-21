package com.example.week4.DataAccess;

import com.example.week4.Dto.Response.ListTodoResponse;
import com.example.week4.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ITodoRepository extends JpaRepository<Todo,Integer> {

    Todo getByTitleAndId(String title, int id);
    @Query("SELECT new com.example.week4.Dto.Response.ListTodoResponse(td.title,td.days,td.weekByNumber,td.done) from Todo td")
    List<ListTodoResponse> getAllDetails();


    @Query("SELECT new com.example.week4.Dto.Response.ListTodoResponse(td.title,td.days,td.weekByNumber,td.done) from Todo td where td.weekByNumber=:weekByNumber")
    List<ListTodoResponse> getAllOneWeek(int weekByNumber );

    Todo getById(int id);


}
