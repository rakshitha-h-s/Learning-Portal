package com.effigo.LearningPortal.dto.response;

import java.io.Serializable;

import com.effigo.LearningPortal.entity.CourseEntity;
import com.effigo.LearningPortal.entity.UserEntity;

import lombok.Data;
@Data
public class UserCourseEnrollmentresponse implements Serializable {
	private Long enrollment_id;
	private UserEntity u_id;
	private CourseEntity course_id;
	private String enrollment_date;
}
