package com.example.demo.entity;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Setter
@Getter
@Data
public class User   implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer age;
    private String email;


}
