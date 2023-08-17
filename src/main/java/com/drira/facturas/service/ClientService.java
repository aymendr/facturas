package com.drira.facturas.service;

import com.drira.facturas.exception.UserNotFoundException;
import com.drira.facturas.model.Client;
import com.drira.facturas.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    private final ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }


    public Client addClient(Client client){
        client.setCode(UUID.randomUUID().toString());
        return clientRepo.save(client);
    }

    public List<Client> findAllClients(){
        return clientRepo.findAll();
    }

    public Client updateClient(Client client){
        return clientRepo.save(client);
    }

    public void deleteClientById(Long id) { clientRepo.deleteById(id); }
    public void deleteClient(Client client){ clientRepo.deleteById(client.getId()); }

    public Client findClientById(Long id){
        return clientRepo
                .findClientById(id).orElseThrow(() -> new UserNotFoundException("User was not found")  );
    }

}
