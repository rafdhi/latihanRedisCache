package com.latihanrediscache.latihancache.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data // kependekan dari @getter, @setter, @to string, @equalsandhashcode
//@EqualsAndHashCode()
@ToString(callSuper = true)
@Entity
@Table(name = "book")
public class Book implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "judul")
    private String judul;
    @Column(name = "penulis")
    private String penulis;
    @Column(name = "penerbit")
    private String penerbit;
    
    public Book() {
    }

    public Book(String judul, String penulis, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

}
