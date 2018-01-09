package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity

public class EMS{

     private @Id @GeneratedValue Long  id;
     private String name;
	private String price;

     private EMS(){}

      public EMS(String name ,String price){
      this.name  = name;
     	this.price = price;

}
}


