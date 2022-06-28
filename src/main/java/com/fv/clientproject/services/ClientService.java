package com.fv.clientproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fv.clientproject.entities.Client;
import com.fv.clientproject.entities.dto.ClientDTO;
import com.fv.clientproject.repositories.ClientRepository;
import com.fv.clientproject.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	public ClientRepository repo;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(PageRequest pageRequest) {
		Page<Client> list = repo.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repo.findById(id);
		Client entity = obj.orElseThrow(() -> new ObjectNotFoundException("Id not exist: " + id));
		return new ClientDTO(entity);
	}

}
