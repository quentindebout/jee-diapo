package fr.cpe.rest.impl;



import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import fr.cpe.model.UserModel;


/**
 * @author ubuntu
 *
 */
@Path("/WatcherAuth")
public class WatcherAuthServlet{

	@POST
    
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String Watcher(UserModel User) {
        return "{login : "+User.getLogin()+",validAuth :true,role : ‘ADMIN’}";
    }
	
	
}
