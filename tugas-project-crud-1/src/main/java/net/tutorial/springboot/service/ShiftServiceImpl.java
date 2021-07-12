package net.tutorial.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import net.tutorial.springboot.repository.ShiftRepository;
import net.tutorial.springboot.model.Shift;
import org.springframework.stereotype.Service;

@Service
public class ShiftServiceImpl implements ShiftService{
	@Autowired
	private ShiftRepository shiftRepository;
	
	@Override
	public List<Shift> getAllShift(){
		return shiftRepository.findAll();
	}
	@Override
	public void saveShift(Shift shift) {
		this.shiftRepository.save(shift);
	}
	@Override
	public Shift getShiftById (long id) {
		Optional<Shift> optional = shiftRepository.findById(id);
		Shift shift = null;
		if(optional.isPresent()) {
			shift = optional.get();
		}
		else
		{
			throw new RuntimeException("Buku tidak ditemukan dengan id :: "+ id);
		}
		return shift;
	}
	@Override 
	public void deleteShiftById(long id) {
		this.shiftRepository.deleteById(id);
	}
}
