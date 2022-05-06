
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Usuario;
import com.ejemplo.SpringBoot.model.dto.UserDto;
import com.ejemplo.SpringBoot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins = {"http://localhost:4200/"})
@RestController
public class AuthController {
    
    @Autowired
    AuthService service;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    
    //desactivar registros luego 
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
       service.crearUsuario(usuario);
    }
}
