package br.com.senac.cadastrousuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senac.cadastrousuario.entity.Usuario;
import br.com.senac.cadastrousuario.repository.UsuarioRepository;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuariorepo;
	
	@GetMapping
	public List<Usuario> findAll(){
		return usuariorepo.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Usuario findAll(@PathVariable Long id) {
		return usuariorepo.findById(id).get();
	}
}
