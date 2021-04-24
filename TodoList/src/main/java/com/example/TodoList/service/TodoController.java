/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TodoList.service;

import com.example.TodoList.model.TodoModel;
import com.example.TodoList.repository.TodoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MUAZ
 */
@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    
    
    @PostMapping("/addNewTodo")
    public String createTodo(@RequestBody TodoModel todoModel){
        todoRepository.save(todoModel);
        return "Added todo with Id : "+ todoModel.getId();
    }
    
    /**
     *
     * @return
     */
    @GetMapping("/getAllBooks")
    public List<TodoModel> getAllBooks(){
        return todoRepository.findAll();
    }
    
    
    @GetMapping("/getBook/{id}")
    public Optional<TodoModel> getBookId(@PathVariable int id){
        return todoRepository.findById(id);
    }
    
    
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBookId(@PathVariable int id){
        todoRepository.deleteById(id);
        return "Deleted todo with Id : "+ id;
    }

}
