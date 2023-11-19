package java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/income-tax")
public class IncomeTaxService {
    @GET
    @Path("/{income}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateIncomeTax(@PathParam("income") double income) {
        double tax = IncomeTaxCalculator.calculateTax(income);
        return "Income tax for $" + income + ": $" + tax;
    }
}
