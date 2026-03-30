package io.github.MoreiraGabryel.arquiteturaspring;

import io.github.MoreiraGabryel.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ExemploInjecaoDependencia {
    public static void main ( String[]args){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("username");
        dataSource.setPassword("Password");

       // Connection connection = dataSource.getConnection();

        //TodoRepository repository =  new SimpleJpaRepository<TodoEntity, Integer>(MailSender,EntityManager,TOT);
       // EntityManager entityManager =null;
       // TodoValidator todoValidator = new TodoValidator(repository);
        //MailSender sender =  new MailSender();
        //TodoService todoService=  new TodoService(repository,todoValidator,sender);
       // TodoController controller =new TodoController(repository,todoValidator,);






    }
}
