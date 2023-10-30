package com.softtek.bitacora.entity;

import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SOFTTEK_BITACORA_AUDITORIA")
public class BitacoraAuditoriaEntity implements Serializable {

	private static final long serialVersionUID = 7840959649068863469L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "CVE_BITACORA_AUDITORIA")
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FEC_REGISTRO_ALTA", updatable = false)
	private Date fechaIngreso;

	@Column(name = "DES_USUARIO_VENTANILLA", updatable = false)
	private String usuarioVentanilla;

	@Column(name = "REF_USUARIO_SOLICITANTE", updatable = false)
	private String usuarioSolicitante;

	@Column(name = "CVE_ESTADO_SOLICITUD", updatable = false)
	private String claveEstadoSolicitud;

	@Column(name = "REF_EVENTO", updatable = false)
	private String evento;

	@Column(name = "REF_ROL", updatable = false)
	private String rol;

	@Column(name = "ID_SOLICITUD_CERTIFICACION", updatable = false)
	private Long idSolicitudCertificacion;

}
