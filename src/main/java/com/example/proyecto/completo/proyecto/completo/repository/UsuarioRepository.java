package com.example.proyecto.completo.proyecto.completo.repository;


import com.example.proyecto.completo.app.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

    @Query(value = "SELECT u.* FROM usuario u where u.nombre = :nombre",nativeQuery = true)
    List<UsuarioEntity> buscarPorNombreUsuario(String nombre);

    @Query("SELECT u FROM  UsuarioEntity u WHERe u.nombre = :nombre")
    List<UsuarioEntity> buscarPorNombreUsuarioJPQL(String nombre);

    List<UsuarioEntity> findByNombre(String nombre);


}


