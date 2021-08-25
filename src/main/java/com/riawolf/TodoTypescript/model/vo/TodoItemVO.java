package com.riawolf.TodoTypescript.model.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoItemVO {
    private Integer id;
    private String title;
    private Boolean checked = false;
}
