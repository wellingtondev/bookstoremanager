package com.wellingtondev.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Indica que é uma classe controladora
//do spring com suporte a API Rest que vai retornar um conteudo Json
@RestController
//Informamos o endpoint que queremos acessar em atravez de seu browser
@RequestMapping("/api/v1/books")
public class BookController {

    @ApiOperation(value = "Return an example hello world")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success method return")
    })
    @GetMapping // Indica a criação de uma requisicao do tipo REST GET
    public String hello(){
        return "Hello Bookstore Manager";
    }
}
