package com.fv.clientproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fv.clientproject.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}