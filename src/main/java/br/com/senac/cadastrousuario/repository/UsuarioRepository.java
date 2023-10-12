package br.com.senac.cadastrousuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.cadastrousuario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
