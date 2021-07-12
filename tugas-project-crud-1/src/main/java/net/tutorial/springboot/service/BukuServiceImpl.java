package net.tutorial.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import net.tutorial.springboot.repository.BukuRepository;
import net.tutorial.springboot.model.Buku;
import org.springframework.stereotype.Service;

@Service
public class BukuServiceImpl implements BukuService {
	@Autowired
	private BukuRepository bukuRepository;
	
	@Override
	public List<Buku> getAllBuku(){
		return bukuRepository.findAll();
	}
	@Override
	public void saveBuku (Buku buku) {
		this.bukuRepository.save(buku);
	}
	@Override
	public Buku getBukuById(long id) {
		Optional<Buku> optional = bukuRepository.findById(id);
		Buku buku = null;
		if(optional.isPresent()) {
			buku = optional.get();
		}
		else {
			throw new RuntimeException("Buku tidak ditemukan dengan id :: "+ id);
		}
		return buku;
	}
	@Override
	public void deleteBukuById(long id) {
		this.bukuRepository.deleteById(id);
	}
}
