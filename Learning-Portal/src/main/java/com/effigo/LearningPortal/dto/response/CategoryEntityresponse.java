package com.effigo.LearningPortal.dto.response;

import java.io.Serializable;

import lombok.Data;
@Data
public class CategoryEntityresponse implements Serializable{
	private Long category_id;
	private String name;

}
