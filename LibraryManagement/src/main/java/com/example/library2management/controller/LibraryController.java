package com.example.library2management.controller;

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

import com.example.library2managment.entity.Entityclass;
import com.example.library2management.service.*;

@RestController
@RequestMapping("/library")
public class LibraryController {
private final LibraryService libraryService;



public LibraryController(LibraryService libraryService) {
	this.libraryService = libraryService;
}
public List<Entityclass> findAllLibrary()
{
	return libraryService.findAllLibrary();
}
@GetMapping("/{id}")
public Optional<Entityclass> findLibraryById(@PathVariable("id") Long id){
	return libraryService.findById(id);
}
@PostMapping
public Entityclass saveLibrary(@RequestBody Entityclass libraryEntity) {
	return libraryService.saveLibrary(libraryEntity);
}

@PutMapping
public Entityclass updateLibrary(@RequestBody Entityclass libraryEntity) {
	return libraryService.updateLibrary(libraryEntity);
}

@DeleteMapping("/{id}")
public void deleteLibrary(@PathVariable("id") Long id) {
	libraryService.deleteLibrary(id);
}

}