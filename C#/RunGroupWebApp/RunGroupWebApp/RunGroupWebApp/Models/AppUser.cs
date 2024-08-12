namespace RunGroupWebApp.Models
{
    public class AppUser
    {
        //el ? signiica que puede llegar a ser nulo, como si fuera typescript
        public int? Pace { get; set; }
        public int? Mileage { get; set; }
        //tambien es posible tener objetos referenciados a los objetos que ya construimos
        public Address? Address { get; set; }
    }
}
