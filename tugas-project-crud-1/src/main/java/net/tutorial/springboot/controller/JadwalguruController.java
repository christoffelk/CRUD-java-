package net.tutorial.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import net.tutorial.springboot.service.JadwalguruService;
import net.tutorial.springboot.model.Jadwalguru;

@Controller
public class JadwalguruController {
	@Autowired
	private JadwalguruService jadwalguruService;
	
	//menampilkan list jadwal
	@GetMapping("/jadwal")
	public String viewJadwalPage(Model model) {
		model.addAttribute("ListJadwal",jadwalguruService.getAllJadwal());
		return "jadwal/jadwal";
	}
	@GetMapping("/jadwal/showNewJadwalForm")
	public String ShowNewJadwalForm(Model model) {
		Jadwalguru jadwalguru = new Jadwalguru();
		model.addAttribute("jadwal",jadwalguru);
		return "jadwal/new_jadwal";
	}
	@PostMapping("/jadwal/saveJadwal")
	public String saveJadwal(@ModelAttribute("jadwal") Jadwalguru jadwalguru) {
		//simpan data ke database
		jadwalguruService.saveJadwal(jadwalguru);
		return "redirect:/jadwal";
	}
	
	
	@GetMapping("/jadwal/showFormForUpdatejadwal/{id}")
	public String showFormForUpdate3(@PathVariable(value = "id") long id, Model model) {
		Jadwalguru jadwalguru = jadwalguruService.getJadwalById(id);
		model.addAttribute("jadwal",jadwalguru);
		return "jadwal/update_jadwal";
	}
	
	@GetMapping("/jadwal/deleteJadwal/{id}")
	public String deleteBuku(@PathVariable (value = "id")long id) {
		this.jadwalguruService.deleteJadwalById(id);
		return "redirect:/jadwal";
	}
}
