package net.tutorial.springboot.service;
import java.util.List;
import net.tutorial.springboot.model.Shift;
public interface ShiftService {
	List<Shift> getAllShift();
	void saveShift(Shift shift);
	Shift getShiftById(long id);
	void deleteShiftById(long id);
}
