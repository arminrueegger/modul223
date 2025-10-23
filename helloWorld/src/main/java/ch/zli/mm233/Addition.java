package ch.zli.mm233;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/math")
public class Addition {

    @GET
    @Path("/{firstNumber}/{secondNumber}")
    @Produces(MediaType.TEXT_PLAIN)
    public String addTwoNumbers(
            @PathParam("firstNumber") int firstNumber,
            @PathParam("secondNumber") int secondNumber) {
        return String.valueOf(firstNumber + secondNumber);
    }
}
