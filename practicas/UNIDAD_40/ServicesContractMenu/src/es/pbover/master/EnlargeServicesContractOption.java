package es.pbover.master;

public class EnlargeServicesContractOption extends ServicesContractOption {

    public EnlargeServicesContractOption(ServicesContract servicesContract) {
        super("Alargar Contrato de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        Date date = new Date(Console.getInstance().readString("Introduzca la fecha en formato dd/mm/yyyy:"));
        Double factor = Console.getInstance().readDouble("Introduzca el factor:");
        Console.getInstance().writeln();
        servicesContract.enlarge(date, factor);
    }

}
