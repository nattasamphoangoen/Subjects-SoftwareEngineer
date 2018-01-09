package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity

public class Product{

     private @Id @GeneratedValue Long  id;
     private String name;
      private String ID;
	private String price;

     private Product(){}

      public Subjects(String name ,String ID,String price){
      this.name  = name;
      this.ID=ID;
	this.price = price;

}
}


