package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity

public class Sender {

     private @Id @GeneratedValue Long  id;
     private String name;
      private String ID;

     private Sender(){}

      public Subjects(String name ,String ID){
      this.name  = name;
      this.ID = ID;

}
}


