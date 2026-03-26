package io.github.MoreiraGabryel.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service

public class TodoService {
    private  TodoRepository repository;

    // Injetando a Depêndencia
    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity salvar (TodoEntity novoTodo){
        return repository.save(novoTodo);
    }


    // Atualizar ToDOS que já tem um ID
    public  void atualizarStatus (TodoEntity todo){
        repository.save(todo);
    }

    public  TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
