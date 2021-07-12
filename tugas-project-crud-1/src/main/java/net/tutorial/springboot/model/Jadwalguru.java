package net.tutorial.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="jadwal")
public class Jadwalguru {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name ="nama")
	public String Nama;
	
	@Column(name ="hari")
	public String Hari;
	@Column(name = "matpel")
	public String Matpel;
	
	@Column(name ="lama")
	public String Lama;
	
	@Column(name = "kelas")
	public String Kelas;
	
	public long getId () {
		return id;
	}
	public void setId (long Id) {
		this.id = Id;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String Nama) {
		this.Nama = Nama;
	}
	public String getHari() {
		return Hari;
	}
	public void setHari(String Hari) {
		this.Hari = Hari;
	}
	public String getMatpel() {
		return Matpel;
	}
	public void setMatpel(String Matpel) {
		this.Matpel = Matpel;
	}
	public String getLama() {
		return Lama;
	}
	public void setLama(String Lama) {
		this.Lama = Lama;
	}
	public String getKelas() {
		return Kelas;
	}
	public void setKelas(String Kelas) {
		this.Kelas =Kelas;
	}
}
