package net.tutorial.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import net.tutorial.springboot.model.Shift;
import net.tutorial.springboot.service.ShiftService;
@Controller
public class ShiftController {
	@Autowired
	private ShiftService shiftService;
	//menampilkan list buku
	@GetMapping("/shift")
	public String viewShiftPage(Model model) {
		model.addAttribute("ListShift",shiftService.getAllShift());
		return "shift/shift";
	}
	
	@GetMapping("/shift/showNewShiftForm")
	public String ShowNewShiftForm(Model model) {
		Shift shift = new Shift();
		model.addAttribute("shift",shift);
		return "shift/new_shift";
		
	}
	@PostMapping("/shift/saveShift")
	public String saveShift(@ModelAttribute("shift") Shift shift) {
		shiftService.saveShift(shift);
		return "redirect:/shift";
	}
	@GetMapping("/shift/showFormForUpdateshift/{id}")
	public String showFormForUpdate2(@PathVariable(value ="id") long id,Model model) {
		Shift shift = shiftService.getShiftById(id);
		model.addAttribute("shift",shift);
		return "shift/update_shift";
	}
	@GetMapping("/shift/deleteShift/{id}")
	public String deleteShift(@PathVariable(value ="id") long id) {
		this.shiftService.deleteShiftById(id);
		return "redirect:/shift";
	}
}
