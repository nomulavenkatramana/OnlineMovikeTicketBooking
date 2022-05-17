package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.Getbookingsbyemail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetbookingsbyemailRepository extends JpaRepository<Getbookingsbyemail, String>{
}


