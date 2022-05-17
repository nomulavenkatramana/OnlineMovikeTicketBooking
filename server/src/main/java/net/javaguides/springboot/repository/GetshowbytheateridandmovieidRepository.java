package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.Getshowbytheateridandmovieid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetshowbytheateridandmovieidRepository extends JpaRepository<Getshowbytheateridandmovieid, String>{
}


