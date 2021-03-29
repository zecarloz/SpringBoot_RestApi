package com.jose.myapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jose.myapi.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
