package com.example.demo;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Data
@Entity
public class ManageEvent {

	private @Id @GeneratedValue Long id;
    private String EventName;
    private String EventDescrpt;
	

	private ManageEvent() {}

	public ManageEvent(
        String name,String EventDescrpt
        ) {
        this.name = name;
        this.eventdescrpt = eventdescrpt;
	}
}