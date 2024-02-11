package com.example.library2management.service;

import java.util.List;
import java.util.Optional;
import com.example.library2managment.entity.*;
public interface LibraryService {
	List<Entityclass> findAllLibrary();
	Optional<Entityclass> findById(Long id);
	Entityclass saveLibrary(Entityclass libraryEntity);
	Entityclass updateLibrary(Entityclass libraryEntity);
	void deleteLibrary(Long id);
}
