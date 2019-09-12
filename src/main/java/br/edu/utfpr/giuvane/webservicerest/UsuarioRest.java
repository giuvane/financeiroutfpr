/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.giuvane.webservicerest;

import br.edu.utfpr.giuvane.modelo.usuario.Usuario;
import br.edu.utfpr.giuvane.modelo.usuario.UsuarioRN;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author Giuvane Conti
 */
@Path("/usuarios")
public class UsuarioRest {
    
    private UsuarioRN usuarioRN;
    
    @GET
    @Path("/")
    @Produces("application/json")
    public Response listarUsuarios() {
        usuarioRN = new UsuarioRN();
        
        List<Usuario> usuarios = usuarioRN.listar();
        System.out.println("Listando usuários REST.....................");
        GenericEntity<List<Usuario>> entity = new GenericEntity<List<Usuario>>(usuarios) {};
        return Response.status(Status.OK).entity(entity).build();
    }
    
}
