package com.effigo.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.effigo.LearningPortal.dto.request.CategoryEntityrequest;
import com.effigo.LearningPortal.dto.request.CourseEntityrequest;
import com.effigo.LearningPortal.dto.response.CategoryEntityresponse;
import com.effigo.LearningPortal.dto.response.CourseEntityResponse;
import com.effigo.LearningPortal.entity.CategoryEntity;
import com.effigo.LearningPortal.entity.CourseEntity;
import com.effigo.LearningPortal.service.CategoryService;
import com.effigo.LearningPortal.service.CourseService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	private final CategoryService userService;
	public CategoryController(CategoryService userService) {
		this.userService = userService;
	}
	@GetMapping
	public List<CategoryEntity> findAllCategory()
	{
		return userService.findAllCategory();
	}
	@GetMapping("/{u_id}")
	public Optional<CategoryEntity> findById(@PathVariable("u_id") Long id){
		return userService.findById(id);
	}
	@PostMapping
	public CategoryEntity saveCategoryEntity(@RequestBody CategoryEntity user) {
        //UserEntity createdUser = userService.saveUserEntity(user);
        return userService.saveCategoryEntity(user);
    }

	@PutMapping
	public CategoryEntity updateCategoryEntity(@RequestBody CategoryEntity userEntity) {
		return userService.updateCategoryEntity(userEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteCategoryEntity(@PathVariable("id") Long id) {
		userService.deleteCategoryentity(id);
	}
	@PostMapping("/res")
	public CategoryEntityresponse saveCategoryResponse(@RequestBody CategoryEntityrequest userRequest) {
		return userService.saveCategoryEntity(userRequest);
	}

}
