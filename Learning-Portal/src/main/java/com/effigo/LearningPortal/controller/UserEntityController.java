package com.effigo.LearningPortal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.effigo.LearningPortal.dto.request.UserEntityrequest;
import com.effigo.LearningPortal.dto.response.UserEntityresponse;
import com.effigo.LearningPortal.entity.UserEntity;
import com.effigo.LearningPortal.service.UserEntityService;
import com.effigo.LearningPortal.service.impl.UserEntityServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/userentity")
public class UserEntityController {
	private final UserEntityService userService;
	public UserEntityController(UserEntityService userService) {
		this.userService = userService;
	}
	@GetMapping
	public List<UserEntity> findAllUser()
	{
		return userService.findAllUser();
	}
	@GetMapping("/{u_id}")
	public Optional<UserEntity> findById(@PathVariable("u_id") Long id){
		return userService.findById(id);
	}
	/*@PostMapping
	public UserEntity saveUserEntity(@RequestBody UserEntity userEntity) {
		return userService.saveUserEntity(userEntity);
	}*/
	@PostMapping
	public UserEntity saveUserEntity(@RequestBody UserEntity user) {
        //UserEntity createdUser = userService.saveUserEntity(user);
        return userService.saveUserEntity(user);
    }

	@PutMapping
	public UserEntity updateUserEntity(@RequestBody UserEntity userEntity) {
		return userService.updateUserEntity(userEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteUserEntity(@PathVariable("id") Long id) {
		userService.deleteUserentity(id);
	}
	@PostMapping("/res")
	public UserEntityresponse saveUserEntityResponse(@RequestBody UserEntityrequest userRequest) {
		return userService.saveUserEntity(userRequest);
	}


}
