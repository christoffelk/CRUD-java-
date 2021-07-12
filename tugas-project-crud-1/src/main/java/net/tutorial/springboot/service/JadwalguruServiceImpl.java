package net.tutorial.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import net.tutorial.springboot.repository.JadwalguruRepository;
import net.tutorial.springboot.model.Jadwalguru;
import org.springframework.stereotype.Service;

@Service
public class JadwalguruServiceImpl implements JadwalguruService{
	@Autowired
	private JadwalguruRepository jadwalguruRepository;
	
	@Override
	public List<Jadwalguru> getAllJadwal(){
		return jadwalguruRepository.findAll();
	}
	@Override
	public void saveJadwal(Jadwalguru jadwalguru) {
		this.jadwalguruRepository.save(jadwalguru);
	}
	
	@Override
	public Jadwalguru getJadwalById(long id) {
		Optional <Jadwalguru> optional = jadwalguruRepository.findById(id);
		Jadwalguru jadwalguru = null;
		if(optional.isPresent()) {
			jadwalguru = optional.get();
		}
		else
		{
			throw new RuntimeException("Jadwal tidak ditemukan");
		}
		return jadwalguru;
	}
	@Override
	public void deleteJadwalById(long id) {
		this.jadwalguruRepository.deleteById(id);
	}
	
}
