package com.softtek.bitacora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.bitacora.assembler.BitacoraAuditoriaAssembler;
import com.softtek.bitacora.entity.BitacoraAuditoriaEntity;
import com.softtek.bitacora.model.BitacoraAuditoriaModel;
import com.softtek.bitacora.repository.BitacoraAuditoriaRepository;

import lombok.Getter;

@Service
public class BitacoraAuditoriaService {

	@Autowired
	private BitacoraAuditoriaAssembler bitacoraAuditoriaAssembler;

	@Autowired
	BitacoraAuditoriaRepository bitacoraAuditoriaRepository;

	public void savedBitacora(BitacoraAuditoriaModel bitacoraAuditoriaModel) {

		BitacoraAuditoriaEntity bitacoraAuditoriaEntity = bitacoraAuditoriaAssembler.toEntity(bitacoraAuditoriaModel);

		bitacoraAuditoriaRepository.save(bitacoraAuditoriaEntity);
	}

}
