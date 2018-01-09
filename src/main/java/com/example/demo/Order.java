package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity

public class Order {

     private @Id @GeneratedValue Long  id;
     private String name;
      

     private Order (){}

      public Order (String name ){
      this.name  = name;
      

}
}


