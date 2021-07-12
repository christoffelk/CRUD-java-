package net.tutorial.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name ="buku")
public class Buku {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name ="name")
	public String Name;
	
	@Column(name ="pengarang")
	public String Pengarang;
	
	@Column(name ="penerbit")
	public String Penerbit;
	
	@Column(name ="tahunterbit")
	public String Tahunterbit;
	
	public long getId () {
		return id;
	}
	public void setId (long Id) {
		this.id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getPengarang() {
		return Pengarang;
	}
	public void setPengarang(String Pengarang) {
		this.Pengarang = Pengarang;
	}
	public String getPenerbit() {
		return Penerbit;
	}
	public void setPenerbit(String Penerbit) {
		this.Penerbit = Penerbit;
	}
	public String getTahunterbit() {
		return Tahunterbit;
	}
	public void setTahunterbit(String Tahunterbit) {
		this.Tahunterbit = Tahunterbit;
	}
}
