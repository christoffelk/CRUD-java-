package net.tutorial.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import net.tutorial.springboot.service.BukuService;
import net.tutorial.springboot.model.Buku;

@Controller
public class BukuController {
	@Autowired
	private BukuService bukuService;
	
	
	//menampilkan list buku
	@GetMapping("/book")
	public String viewHomePage(Model model) {
		model.addAttribute("ListBuku",bukuService.getAllBuku());
		return "book/book";
	}
	@GetMapping("/book/showNewBukuForm")
	public String ShowNewBukuForm(Model model) {
		Buku buku = new Buku();
		model.addAttribute("buku",buku);
		return "book/new_buku";
	}
	
	@PostMapping("/book/saveBuku")
	public String saveBuku(@ModelAttribute("buku") Buku buku) {
		//simpan data ke database
		bukuService.saveBuku(buku);
		return "redirect:/book";
	}
	
	
	@GetMapping("/book/showFormForUpdatebuku/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Buku buku = bukuService.getBukuById(id);
		model.addAttribute("buku",buku);
		return "book/update_buku";
	}
	
	@GetMapping("/book/deleteBuku/{id}")
	public String deleteBuku(@PathVariable (value = "id")long id) {
		this.bukuService.deleteBukuById(id);
		return "redirect:/book";
	}
	
	
}
