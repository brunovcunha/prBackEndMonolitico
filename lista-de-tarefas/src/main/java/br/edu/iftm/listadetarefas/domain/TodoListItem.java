package br.edu.iftm.listadetarefas.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TodoListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nomeDoItem;

    @ManyToOne
    private TodoList todoList;
}
