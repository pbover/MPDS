package es.pbover.master;

class PrintServicesContractOption extends ServicesContractOption {

    public PrintServicesContractOption(ServicesContract servicesContract) {
        super("Imprimir Contratos de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        this.servicesContract.writeln();
    }

}
