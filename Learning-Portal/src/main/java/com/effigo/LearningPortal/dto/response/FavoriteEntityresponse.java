package com.effigo.LearningPortal.dto.response;

import java.io.Serializable;

import com.effigo.LearningPortal.entity.CourseEntity;
import com.effigo.LearningPortal.entity.UserEntity;

import lombok.Data;
@Data
public class FavoriteEntityresponse implements Serializable{
	private Long f_id;
	private UserEntity u_id;
	private CourseEntity course_id;

}
