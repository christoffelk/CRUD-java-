package net.tutorial.springboot.service;
import java.util.List;
import net.tutorial.springboot.model.Jadwalguru;
public interface JadwalguruService {
	List<Jadwalguru> getAllJadwal();
	void saveJadwal(Jadwalguru jadwalguru);
	Jadwalguru getJadwalById(long id);
	void deleteJadwalById(long id);
}
