package es.pbover.master;

public class ShiftServicesContractOption extends ServicesContractOption {

    public ShiftServicesContractOption(ServicesContract servicesContract) {
        super("Desplazar Contrato de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        Date date = new Date(new Console().readString("Introduzca la fecha en formato dd/mm/yyyy:"));
        Double shiftment = new Console().readDouble("Introduzca el desplazamiento:");
        servicesContract.desplazar(date, shiftment);
    }

}
