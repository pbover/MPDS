package es.pbover.master;

public class EnlargeServicesContractOption extends ServicesContractOption {

    public EnlargeServicesContractOption(ServicesContract servicesContract) {
        super("Alargar Contrato de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        Date date = new Date(new Console().readString("Introduzca la fecha en formato dd/mm/yyyy:"));
        Double factor = new Console().readDouble("Introduzca el factor:");
        servicesContract.enlarge(date, factor);
    }

}
