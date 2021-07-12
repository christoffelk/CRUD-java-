package net.tutorial.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.tutorial.springboot.model.Jadwalguru;

@Repository
public interface JadwalguruRepository extends JpaRepository <Jadwalguru,Long>{

}
