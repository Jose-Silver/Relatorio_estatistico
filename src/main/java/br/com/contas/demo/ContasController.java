package br.com.contas.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import br.com.contas.demo.ContasService;
@RestController
public class ContasController {

    @Autowired
    public ContasService service;

    @PostMapping

    public ResponseEntity<?> relatoro ( @RequestBody final numeros num ){

    return  service.relatorio(num.getNumeros());
    };


}
