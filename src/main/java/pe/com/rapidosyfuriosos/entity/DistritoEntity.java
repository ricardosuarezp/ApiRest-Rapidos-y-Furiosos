package pe.com.rapidosyfuriosos.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity(name = "DistritoEntity")
@Table(name = "distrito")
public class DistritoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "coddis",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo ;
	
	@Column(name = "nomdis",nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "estdis",nullable = false)
	private Boolean estado;
}
