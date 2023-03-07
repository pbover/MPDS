package es.pbover.master;

public class EnlargeServicesContractOption extends ServicesContractOption {

    public EnlargeServicesContractOption(ServicesContract servicesContract) {
        super("Alargar Contrato de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        servicesContract.enlarge();
    }

}
