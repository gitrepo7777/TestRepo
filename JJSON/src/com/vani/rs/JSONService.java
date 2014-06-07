package com.vani.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.vani.beans.Track;

@Path("/json/vani")
public class JSONService {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

    /**
     * Default constructor. 
     */
    public JSONService() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of JSONService
     * @return an instance of Track
     */
    @GET
    @Path("/get")
    @Produces("application/json")
    public Track getJson() {
    	
    	Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;
    }

    /**
     * PUT method for updating or creating an instance of JSONService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(Track content) {
    }

}