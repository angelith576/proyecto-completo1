package com.example.proyecto.completo.proyecto.completo.service;


import com.example.proyecto.completo.proyecto.completo.dto.UsuarioDTO;
import com.example.proyecto.completo.proyecto.completo.dto.UsuarioLombokDTO;
import com.example.proyecto.completo.proyecto.completo.model.UsuarioEntity;
import org.springframework.http.ResponseEntity;



public interface InterfazUsuarioService {


        ResponseEntity guardarUsuario(UsuarioEntity usuarioEntity);

        ResponseEntity getAllUser();


        ResponseEntity getUserNameNativeQuery(String nombre);

        ResponseEntity getUserNameForJPQL(String nombre);


        ResponseEntity getUserNameForJpaRepository(String nombre);


        ResponseEntity putUserInformation(UsuarioEntity usuarioEntity);


        ResponseEntity actualizarUsuario(Long id, UsuarioDTO usuarioDTO);

        ResponseEntity deleteHard(Long id);

        ResponseEntity deleteLogic(Long id);

        ResponseEntity saveUser(UsuarioLombokDTO usuarioLombokDTO);

    }



