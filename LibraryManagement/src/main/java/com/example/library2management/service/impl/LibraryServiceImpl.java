package com.example.library2management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.library2managment.entity.*;
import com.example.library2management.repository.Libraryrepository;
import com.example.library2management.service.LibraryService;

@Service
class LibraryServiceImpl implements LibraryService{

	private final Libraryrepository libraryRepository;
	public LibraryServiceImpl(Libraryrepository libraryRepository)
	{
		this.libraryRepository=libraryRepository;
	}
	@Override
	public List<Entityclass> findAllLibrary() {
		// TODO Auto-generated method stub
		return libraryRepository.findAll();
	}

	@Override
	public Optional<Entityclass> findById(Long id) {
		// TODO Auto-generated method stub
		return libraryRepository.findById(id);
	}

	@Override
	public Entityclass saveLibrary(Entityclass libraryEntity) {
		// TODO Auto-generated method stub
		return libraryRepository.save(libraryEntity);
	}

	@Override
	public Entityclass updateLibrary(Entityclass libraryEntity) {
		// TODO Auto-generated method stub
		return libraryRepository.save(libraryEntity);
	}

	@Override
	public void deleteLibrary(Long id) {
		// TODO Auto-generated method stub
		libraryRepository.deleteById(id);
	}
	
}