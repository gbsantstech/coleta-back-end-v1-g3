package br.com.senac.cadastrousuario.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import br.com.senac.cadastrousuario.entity.Login;

@RestController
public class LoginController {
    @PostMapping("/login")
    public String login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) auth.getPrincipal();
        return "Olá, " + userDetails.getUsername() + "! Você está logado com sucesso.";
    }

    @PostMapping("/register")
    public String register(@RequestBody Login login) {
       
        return "Usuário registrado com sucesso!";
    }
}

