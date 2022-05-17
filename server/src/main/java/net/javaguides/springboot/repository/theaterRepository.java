package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface theaterRepository extends JpaRepository<Theater, Long>{
}


