package com.example.proyecto.completo.proyecto.completo.controllers;


import com.example.proyecto.completo.app.dto.UsuarioDTO;
import com.example.proyecto.completo.app.model.UsuarioEntity;
import com.example.proyecto.completo.app.service.IUsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/usuario")
public class UsuarioControllers {

private IUsuarioService iUsuarioService;

public UsuarioControllers(iUsuarioService iUsuarioServicie) {this.iUsuarioService = iUsuarioServicie; }


  @PostMapping
  public ResponseEntity guardarUsuario(@RequestBody UsuarioEntity usuarioEntity){

      return iUsuarioService.guardarUsuario(usuarioEntity);
  }

    @GetMapping
    public ResponseEntity listAllUser(){
        return iUsuarioService.getAllUser();
    }

    @GetMapping("/nombre/native-query")
    public ResponseEntity getUserForNativeQuery(@PathParam("nombre")String nombre){
        return iUsuarioService.getUserNameNativeQuery(nombre);
    }


    @GetMapping("/nombre/jpql")
    public ResponseEntity getUserForJPQL(@PathParam("nombre") String nombre){
        return iUsuarioService.getUserNameForJPQL(nombre);
    }


    @GetMapping("/nombre/jpa-repository")
    public ResponseEntity getUserForJPARespository(@PathParam("nombre") String nombre){
        return iUsuarioService.getUserNameForJpaRepository(nombre);
    }

    @PutMapping
    public ResponseEntity modificarUsuario(@RequestBody UsuarioEntity usuarioEntity){
        return iUsuarioService.putUserInformation(usuarioEntity) ;
    }

    @PutMapping("/{id}")
    public ResponseEntity putUser(@PathVariable Long id ,@RequestBody UsuarioDTO usuario){
        return iUsuarioService.actualizarUsuario(id,usuario);
    }

    @DeleteMapping("/logic/{id}")
    public ResponseEntity deleteHard(@PathVariable Long id){
        return iUsuarioService.deleteLogic(id);
    }


}






