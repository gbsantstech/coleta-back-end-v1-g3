package br.com.senac.cadastrousuario.service;

import org.springframework.stereotype.Service;

import br.com.senac.cadastrousuario.entity.Login;
import br.com.senac.cadastrousuario.repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		  Login login = loginRepo.findByEmail(email);

	        if (login == null) {
	            throw new UsernameNotFoundException("Usuário não encontrado");
	        }

	        return org.springframework.security.core.userdetails.User.builder()
	                .username(login.getEmail())
	                .password(login.getSenha())
	                .roles("USER")
	                .build();
	    }
	}
	

