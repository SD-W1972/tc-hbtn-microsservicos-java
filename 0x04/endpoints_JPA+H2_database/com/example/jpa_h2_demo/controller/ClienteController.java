package com.example.jpa_h2_demo.controller;

import com.example.jpa_h2_demo.model.Cliente;
import com.example.jpa_h2_demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        Cliente c = clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {
        List<Cliente> allClients = clienteRepository.findAll();
        return ResponseEntity.ok(allClients);
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
        Optional<Cliente> c = clienteRepository.findById(idClient);

        if(c.isPresent()){
            return ResponseEntity.ok(c.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
       Optional<Cliente> c = clienteRepository.findById(id);

       if(c.isPresent()){
           Cliente clientToUpdate = c.get();

           clientToUpdate.setNome(cliente.getNome());
           clientToUpdate.setEmail(cliente.getEmail());
           clientToUpdate.setEnderecoList(cliente.getEnderecoList());
           clientToUpdate.setIdade(cliente.getIdade());
           clientToUpdate.setTelefoneList(cliente.getTelefoneList());

       }
    }
}
