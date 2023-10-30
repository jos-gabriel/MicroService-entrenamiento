package com.softtek.bitacora.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.context.annotation.ApplicationScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.softtek.bitacora.model.BitacoraAuditoriaModel;
import com.softtek.bitacora.service.BitacoraAuditoriaService;

@RestController
@RequestMapping("/mssofttek-bitacora")
public class BitacoraEndPoint {

	private static final Logger logger = LoggerFactory.getLogger(BitacoraEndPoint.class);
	
	@Autowired
	BitacoraAuditoriaService bitacoraAuditoriaService;
	
	@GetMapping(path = "/")
	public  @ResponseBody String doGet() {
		return "Bitacora service is active ";
	}
	
	
	@PostMapping(value = "/add", produces = { "application/json" }, consumes = { "application/json" })
	public @ResponseBody String saveBitacoraAuditoria(@RequestBody BitacoraAuditoriaModel bitacoraAuditoriaModel) {
		
		logger.info(bitacoraAuditoriaModel.getEvento());
		bitacoraAuditoriaService.savedBitacora(bitacoraAuditoriaModel);
		
		
		return "Saved";
	}

}
