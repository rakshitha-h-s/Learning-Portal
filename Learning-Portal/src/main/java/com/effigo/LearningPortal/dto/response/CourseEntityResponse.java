package com.effigo.LearningPortal.dto.response;

import java.io.Serializable;

import com.effigo.LearningPortal.entity.CategoryEntity;
import com.effigo.LearningPortal.entity.UserEntity;

import lombok.Data;
@Data
public class CourseEntityResponse implements Serializable{
	private Long course_id;
	private String course_name;
    private CategoryEntity category;
    private UserEntity u_id;


}