package com.latihanrediscache.latihancache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.latihanrediscache.latihancache.model.Book;
import com.latihanrediscache.latihancache.repository.BookRepository;

@SpringBootApplication
@EnableCaching
public class LatihanCacheApplication implements CommandLineRunner{
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	BookRepository bookRepository;
//	private final BookRepository bookRepository;
//	
//	@Autowired
//	  public LatihanCacheApplication(BookRepository bookRepository) {
//	    this.bookRepository = bookRepository;
//	  }


	public static void main(String[] args) {
		SpringApplication.run(LatihanCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}

//	@Override
//	public void run(String... args) throws Exception {
//		//Populating embedded database here
//	    LOG.info("Saving users. Current user count is {}.", bookRepository.count());
//	    Book Book1 = new Book("Inferno", "Dan Brown", "Vintage Espanol");
//	    Book Book2 = new Book("The Davinci Code","Dan Brown", "Vintage Espanol");
//	    Book Book3 = new Book("Angel and Demon","Dan Brown","Vintage Espanol");
//
//	    bookRepository.save(Book1);
//	    bookRepository.save(Book2);
//	    bookRepository.save(Book3);
//	    LOG.info("Done saving books. Data: {}.", bookRepository.findAll());
//		
//	}

}
