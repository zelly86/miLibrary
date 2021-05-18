package com.mx.miLib.core.userStory;

import com.mx.miLib.core.boundary.enter.LibroService;
import com.mx.miLib.core.boundary.exit.LibroRepository;
import com.mx.miLib.core.domain.Libro;

public class LibroStory implements LibroService{
	
	private final LibroRepository libroRepository;
	
	public LibroStory(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}
	
	

	@Override
	public Object buscarLibro(Libro libro) {
		
		return libroRepository.buscarLibro(libro);
	}

}
