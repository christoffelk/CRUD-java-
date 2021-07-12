package net.tutorial.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name ="shift")
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name ="waktu")
	public String Time;
	
	@Column(name = "penjaga1")
	public String Penjaga1;
	
	@Column (name ="penjaga2")
	public String Penjaga2;
	@Column (name ="keterangan")
	public String Keterangan;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPenjaga1() {
		return Penjaga1;
	}
	public void setPenjaga1(String Penjaga1) {
		this.Penjaga1 = Penjaga1;
	}
	public String getPenjaga2() {
		return Penjaga2;
	}
	public void setPenjaga2(String Penjaga2) {
		this.Penjaga2 = Penjaga2;
	}
	public String getKeterangan() {
		return Keterangan;
	}
	public void setKeterangan(String Keterangan) {
		this.Keterangan = Keterangan;
	}
}
