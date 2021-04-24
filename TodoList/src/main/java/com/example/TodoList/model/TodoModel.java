/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TodoList.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author MUAZ
 */
@Setter
@Getter
@ToString

@Document(collection = "TodoList")

public class TodoModel {
    @Id
    private int id;
    private String note;
    private String description;
    
}
