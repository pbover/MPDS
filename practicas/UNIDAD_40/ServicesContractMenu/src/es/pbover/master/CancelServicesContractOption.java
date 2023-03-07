package es.pbover.master;

public class CancelServicesContractOption extends ServicesContractOption {

    public CancelServicesContractOption(ServicesContract servicesContract) {
        super("Cancelar Contrato de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        Date date = new Date(new Console().readString("Introduzca la fecha en formato dd/mm/yyyy:"));
        servicesContract.cancel(date);
    }

}
