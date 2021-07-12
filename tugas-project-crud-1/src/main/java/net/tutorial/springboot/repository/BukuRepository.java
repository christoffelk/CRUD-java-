package net.tutorial.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.tutorial.springboot.model.Buku;

@Repository
public interface BukuRepository extends JpaRepository<Buku,Long>{

}
