package cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.service;

import cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.model.bd.Rol;
import cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.model.bd.Usuario;
import cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.repository.RolRepository;
import cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public Usuario findByNomusuario(String nomusuario){
        return usuarioRepository.findByNomusuario(nomusuario);
    }

    public Usuario saveUser(Usuario usuario){
        usuario.setPassword(
                bCryptPasswordEncoder.encode(usuario.getPassword())
        );
        Rol usuarioRol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }
    public boolean cambiarContraseña(String nombreUsuario, String nuevaContraseña) {
        Usuario usuario = usuarioRepository.findByNomusuario(nombreUsuario);
        if (usuario != null) {
            String nuevaContraseñaHash = bCryptPasswordEncoder.encode(nuevaContraseña);
            usuario.setPassword(nuevaContraseñaHash);
            usuarioRepository.save(usuario);
            return true;
        }
        return false;
    }
}
