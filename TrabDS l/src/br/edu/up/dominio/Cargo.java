package br.edu.up.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "cargos")
@TableGenerator(
	
	name = "gerador_de_id",
	table = "sqlite_sequence",
	pkColumnName = "name",
	valueColumnName = "seq",
	pkColumnValue = "pacientes",
	initialValue = 1,
	allocationSize = 1

)
public class Cargo {

	@Id
	@GeneratedValue (strategy = GenerationType.TABLE, generator = "gerador_de_id")
	@Column (name = "id_cargo")
	private int id;
	private String nomeCargo;
	
	public Cargo() {
		
	}
	
	public Cargo(String nomeCargo) {
		super();
		this.nomeCargo = nomeCargo;
	}
	
	public Cargo(int id_cargo, String nomeCargo) {
		super();
		this.id = id_cargo;
		this.nomeCargo = nomeCargo;
	}
	public int getId_cargo() {
		return id;
	}
	public void setId_cargo(int id_cargo) {
		this.id = id_cargo;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	
}
