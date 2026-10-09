package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

public class ClientService implements IClientService {

private ClientRepository ClientRepo;
    @Override
    public Client addClient(Client client) {
        return ClientRepo.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        ClientRepo.deleteById(id);

    }

    @Override
    public List<Client> recupererClient() {
        return ClientRepo.findAll();
    }

    @Override
    public Client updateClient(Client client) {
        return ClientRepo.save(client);
    }
}
