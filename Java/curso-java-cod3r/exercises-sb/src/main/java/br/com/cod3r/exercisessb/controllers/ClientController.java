package br.com.cod3r.exercisessb.controllers;

import br.com.cod3r.exercisessb.model.entities.Client;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/clients")
public class ClientController {
    @GetMapping("/anyone")
    public Client getClient() {
        return new Client(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Client getClientById1(@PathVariable int id) {
        return new Client(id, "Maria", "987.654.321-00");
    }

    @GetMapping()
    public Client getClientById2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Client(id, "João Augusto", "111.222.333-44");
    }
}
