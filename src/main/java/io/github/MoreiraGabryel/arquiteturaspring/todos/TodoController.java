package io.github.MoreiraGabryel.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {
    private TodoService service;

    // Injetando dependence
    public TodoController(TodoService service) {
        this.service = service;
    }

    // CAMINHO DE SAVE
    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo) {
        return this.service.salvar(todo);
    }

    //Atualizar o ToDOS que ja tem um ID
    @PutMapping("{id}")
    public void atualizarStatus (
            @PathVariable("id")Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        service.atualizarStatus(todo);
    }

    //Retornar o Id que foi atualizado
    @GetMapping("{id}")
    public TodoEntity buscar( @PathVariable("id")Integer id ){
        return service.buscarPorId(id);

    }

}

