package com.example.schoolw5.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private Integer id;
    @Column(columnDefinition = "varchar(20) not null")
    private String area;
    @Column(columnDefinition = "varchar(20) not null")
    private String street;

    @Column(columnDefinition = "int not null")
    private Integer buildingNumber;



    @OneToOne
    @MapsId
    @JsonIgnore
    Teacher teacher;
}
