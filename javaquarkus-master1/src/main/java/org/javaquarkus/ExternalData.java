package org.javaquarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class ExternalData extends PanacheEntity {
    public String name;
    public String description;
}

