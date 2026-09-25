package pe.com.rapidosyfuriosos.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "EstadoCivilEntity")
@Table(name = "estadocivil")
public class EstadoCivilEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codestc",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long codigo;
	
	@Column(name = "nomestc",nullable = false,length = 30)
	public String nombre;
	
	@Column(name = "estestc",nullable = false)
	public boolean estado;
}
