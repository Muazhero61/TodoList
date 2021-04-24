/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TodoList.repository;

import com.example.TodoList.model.TodoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author MUAZ
 */
public interface TodoRepository extends MongoRepository<TodoModel, Integer>{//add TodoModel class
    
}
