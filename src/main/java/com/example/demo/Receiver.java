package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity

public class Receiver {

     private @Id @GeneratedValue Long  id;
     private String name;
     private String address;
               private String phone;

     private Receiver(){}

 public Receiver(String name ,String address ,String phone){
      this.name  = name;
      this.address = address ;
	 this.phone = phone ;

}
}


