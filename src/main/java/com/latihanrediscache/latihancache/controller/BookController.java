package com.latihanrediscache.latihancache.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.latihanrediscache.latihancache.model.Book;
import com.latihanrediscache.latihancache.repository.BookRepository;


@RestController
@RequestMapping(value = "/book")

public class BookController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	BookRepository bookRepository;
	
	@Cacheable(value ="booksAll")
	@GetMapping("getAll")
	public List<Book> getAll(){
		List<Book> result = new ArrayList<>();
		
		bookRepository.findAll().forEach(result::add);
		LOG.info("Done findAll books. Data: {}.", bookRepository.findAll());
		return result;	
	}
	
	@Cacheable(value = "books", key = "#id")	
	@GetMapping("getOne/{id}")
	public Book getOne(@PathVariable Long id) {
		LOG.info("Getting book with ID {}.", id);
		return bookRepository.findById(id).orElse(null);
	}
	
}
