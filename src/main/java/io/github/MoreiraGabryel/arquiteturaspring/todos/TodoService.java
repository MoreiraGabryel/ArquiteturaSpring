package io.github.MoreiraGabryel.arquiteturaspring.todos;

import org.apache.el.util.Validation;
import org.springframework.stereotype.Service;

@Service

public class TodoService {
    private  TodoRepository repository;
    private  TodoValidator validator;
    private  MailSender mailSender;

    // Injetando a Depêndencia
    public TodoService(TodoRepository repository,
                       TodoValidator validator,
                       MailSender mailSender) {
        this.repository = repository;
        this.mailSender = mailSender;
        this.validator = validator;
    }

    public TodoEntity salvar (TodoEntity novoTodo){
        validator.validar((novoTodo));
        return repository.save(novoTodo);
    }


    // Atualizar ToDOS que já tem um ID
    public  void atualizarStatus (TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não Concluido" ;
        mailSender.enviar("Todo " + todo.getDescricao() + "foi Atualizado para " + status);
    }

    public  TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
