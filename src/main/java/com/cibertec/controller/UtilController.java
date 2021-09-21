package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Ciclo;
import com.cibertec.entity.Usuario;
import com.cibertec.service.CicloService;
import com.cibertec.service.UsuarioService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilController {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private CicloService cicloService;
	
	@GetMapping("/usuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario(){
		List<Usuario> lista = usuarioService.listaUsuario();
		
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/ciclo")
	@ResponseBody
	public ResponseEntity<List<Ciclo>> listaCiclo(){
		List<Ciclo> lista = cicloService.listaCiclo();
		
		return ResponseEntity.ok(lista);
	}
}
