package com.riawolf.TodoTypescript.model.services;

import com.riawolf.TodoTypescript.model.mapper.TodoItemsMapper;
import com.riawolf.TodoTypescript.model.vo.TodoItemVO;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class TodoItemsService {

    private final TodoItemsMapper todoItemsMapper;

    public TodoItemsService(TodoItemsMapper todoItemsMapper) {
        this.todoItemsMapper = todoItemsMapper;
    }

    public ArrayList<TodoItemVO> getAllItems() {
        return this.todoItemsMapper.getAllItems();
    }

    public TodoItemVO addItem(TodoItemVO todoItemVO) {
        this.todoItemsMapper.addItem(todoItemVO);
        return todoItemVO;
    }

    public TodoItemVO updateItem (TodoItemVO todoItemVO) {
        this.todoItemsMapper.updateItem(todoItemVO);
        return todoItemVO;
    }

    public TodoItemVO deleteItem(TodoItemVO todoItemVO) {
        this.todoItemsMapper.deleteItems(todoItemVO);
        return todoItemVO;
    }
}
