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
import com.effigo.LearningPortal.dto.request.UserCourseEnrollmentrequest;
import com.effigo.LearningPortal.dto.response.UserCourseEnrollmentresponse;
import com.effigo.LearningPortal.entity.UserCourseEnrollmentEntity;
import com.effigo.LearningPortal.service.UserCourseEnrollmentService;
@RestController
@RequestMapping("/usercourseenrollment")
public class UserCourseEnrollmentController {
	private final UserCourseEnrollmentService usercourseenrollmentService;
	public UserCourseEnrollmentController(UserCourseEnrollmentService usercourseenrollmentService) {
		this.usercourseenrollmentService = usercourseenrollmentService;
	}
	@GetMapping
	public List<UserCourseEnrollmentEntity> findAllCourseEnrollment()
	{
		return usercourseenrollmentService.findAllCourseEnrollment();
	}
	@GetMapping("/{u_id}")
	public Optional<UserCourseEnrollmentEntity> findById(@PathVariable("u_id") Long id){
		return usercourseenrollmentService.findById(id);
	}
	@PostMapping
	public UserCourseEnrollmentEntity saveUserCourseEnrollmentEntity(@RequestBody UserCourseEnrollmentEntity user) {
        //UserEntity createdUser = userService.saveUserEntity(user);
        return usercourseenrollmentService.saveUserCourseEnrollmentEntity(user);
    }

	@PutMapping
	public UserCourseEnrollmentEntity updateUserEntity(@RequestBody UserCourseEnrollmentEntity userEntity) {
		return usercourseenrollmentService.updateUserCourseEnrollmentEntity(userEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteUserCourseEnrollmententity(@PathVariable("id") Long id) {
		usercourseenrollmentService.deleteUserCourseEnrollmententity(id);
	}
	@PostMapping("/res")
	public UserCourseEnrollmentresponse saveUserEntityResponse(@RequestBody UserCourseEnrollmentrequest userRequest) {
		return usercourseenrollmentService.saveUserCourseEnrollmentEntity(userRequest);
	}
}
