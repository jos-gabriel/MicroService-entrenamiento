package com.softtek.bitacora.assembler;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.softtek.bitacora.entity.BitacoraAuditoriaEntity;
import com.softtek.bitacora.model.BitacoraAuditoriaModel;

@Component
public class BitacoraAuditoriaAssembler {

	public BitacoraAuditoriaEntity toEntity(BitacoraAuditoriaModel model) {
		BitacoraAuditoriaEntity entity = new BitacoraAuditoriaEntity();
		entity.setFechaIngreso(new Date());
		entity.setUsuarioVentanilla(model.getUsuarioSolicitante());
		entity.setUsuarioSolicitante(model.getUsuarioSolicitante());
		entity.setClaveEstadoSolicitud(model.getClaveEstadoSolicitud());
		entity.setEvento(model.getEvento());
		entity.setRol(model.getRol());
		entity.setIdSolicitudCertificacion(model.getIdSolicitudCertificacion());
		return entity;
	}

}
