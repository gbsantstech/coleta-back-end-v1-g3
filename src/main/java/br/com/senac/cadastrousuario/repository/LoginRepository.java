package br.com.senac.cadastrousuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.cadastrousuario.entity.Login;

public interface LoginRepository extends JpaRepository<Login, String>{
	Login findByEmail(String email);
}
