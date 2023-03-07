package es.pbover.master;

public class ShiftServicesContractOption extends ServicesContractOption {

    public ShiftServicesContractOption(ServicesContract servicesContract) {
        super("Desplazar Contrato de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        Date date = new Date(Console.getInstance().readString("Introduzca la fecha en formato dd/mm/yyyy:"));
        Double shiftment = Console.getInstance().readDouble("Introduzca el desplazamiento:");
        Console.getInstance().writeln();
        servicesContract.desplazar(date, shiftment);
    }

}
