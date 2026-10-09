package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Client;


import java.util.List;

public interface IClientService {
    Client addClient (Client client) ;

    void deleteClient (Long id);
    List<Client> recupererClient ();

    Client updateClient (Client client);
}
