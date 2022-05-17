package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface showRepository extends JpaRepository<Show, Long>{
}


