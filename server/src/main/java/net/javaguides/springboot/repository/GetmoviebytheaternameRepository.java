package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Getmoviebytheatername;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetmoviebytheaternameRepository extends JpaRepository<Getmoviebytheatername, String>{
}


