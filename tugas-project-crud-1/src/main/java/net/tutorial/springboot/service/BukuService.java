package net.tutorial.springboot.service;
import java.util.List;
import net.tutorial.springboot.model.Buku;
public interface BukuService {
	List<Buku> getAllBuku();
	void saveBuku(Buku buku);
	Buku getBukuById(long id);
	void deleteBukuById(long id);
}
