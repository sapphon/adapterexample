package org.sapphon.adapterexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String skinColor;
    String variety;
    int ciderSweetness;
    int ciderDryness;
}
