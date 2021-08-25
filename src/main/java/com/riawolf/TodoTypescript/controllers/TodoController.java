package com.riawolf.TodoTypescript.controllers;


import com.riawolf.TodoTypescript.model.services.TodoItemsService;
import com.riawolf.TodoTypescript.model.vo.TodoItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    private TodoItemsService todoItemsService;

//    public TodoController(){
//        this.todoItems = new ArrayList<>();
////            this.todoItems.add(new TodoItem(UUID.randomUUID(),"1", false));
////            this.todoItems.add(new TodoItem(UUID.randomUUID(),"2", false));
////            this.todoItems.add(new TodoItem(UUID.randomUUID(),"3", false));
////            this.todoItems.add(new TodoItem(UUID.randomUUID(),"4", false));
////            this.todoItems.add(new TodoItem(UUID.randomUUID(),"5", false));
////            this.todoItems.add(new TodoItem(UUID.randomUUID(),"6", false));
//    }

//    private ArrayList<TodoItemVO> todoItems;

    @GetMapping("/todo")
    public ArrayList<TodoItemVO> getTodo (){

        return this.todoItemsService.getAllItems();
    }

    @PostMapping("/post")
    public TodoItemVO postTodo (@RequestBody TodoItemVO item){
        TodoItemVO result =this.todoItemsService.addItem(item);
        return result;

    }

    @PutMapping("/{id}")
    public TodoItemVO putTodo (@RequestBody TodoItemVO item){

        this.todoItemsService.updateItem(item);
        return item;
//        for (int i =0; i < this.todoItems.size(); i++){
//            TodoItemVO entry = this.todoItems.get(i);
//            if(entry.getId().equals(item.getId())){
//                this.todoItems.set(i, item);
//                break;
//            }
//        }
//        return item;

    }


    @DeleteMapping("delete/{id}")
    public void deleteItem ( TodoItemVO item){
       this.todoItemsService.deleteItem(item);
    }
}



