package com.riawolf.TodoTypescript.model.mapper;

import com.riawolf.TodoTypescript.model.vo.TodoItemVO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;

@Mapper
public interface TodoItemsMapper {
    @Select("SELECT * FROM Todo_table")
    ArrayList<TodoItemVO> getAllItems();

    @Insert("INSERT INTO `Todo_table` (`title`) VALUES (#{title})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void addItem(TodoItemVO todoItemVO);

    @Update("UPDATE `Todo_table` SET `title` = #{title}, `checked` = #{checked} WHERE `Todo_table`.`id` = #{id}")
    void updateItem(TodoItemVO todoItemVO);

    @Delete("DELETE FROM `Todo_table` WHERE id = #{id}")
    void deleteItems(TodoItemVO todoItemVO);


}
