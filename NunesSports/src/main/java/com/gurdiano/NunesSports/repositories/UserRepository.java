package com.gurdiano.NunesSports.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurdiano.NunesSports.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
