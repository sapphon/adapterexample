package org.sapphon.adapterexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public String skinColor;

    public String variety;

    public float pithWidth;

    public int acidity;
}
