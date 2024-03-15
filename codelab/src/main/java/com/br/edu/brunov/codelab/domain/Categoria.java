package com.br.edu.brunov.codelab.domain;


import jakarta.persistence.*;
import lombok.Data;
import org.apache.tomcat.jni.Library;

@Data
@Entity
public class Categoria {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String name;


}
