package com.drira.facturas.service;

import com.drira.facturas.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientResource {
    private final ClientService clientService;


    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }
    @CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> clients = clientService.findAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Long id){
        Client client = clientService.findClientById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        Client newClient = clientService.addClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client){
        Client updateClient = clientService.updateClient(client);
        return new ResponseEntity<>(updateClient, HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    public void deleteClient(@PathVariable("id") Long id){
        clientService.deleteClientById(id);
    }
}
