package com.componente.factinven.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.componente.factinven.controller.AlmacenController.AlmacenRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Entrada extends EntidadPadre implements Serializable {

	private static final long serialVersionUID = 4664298389131326855L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//@NotNull
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private DetalleComprobante detalleComprobante;
	


}
