package com.softtek.bitacora.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitacoraAuditoriaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date fechaIngreso;

	private String usuarioVentanilla;

	private String usuarioSolicitante;

	private String claveEstadoSolicitud;

	private String evento;

	private String rol;

	private Long idSolicitudCertificacion;

	@Override
	public String toString() {

		return this.getClass().getName();
	}

}
