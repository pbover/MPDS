package es.pbover.master;

class ListServicesContractOption extends ServicesContractOption {

    public ListServicesContractOption(ServicesContract servicesContract) {
        super("Listado Contratos de Servicios", servicesContract);
    }

    @Override
    public void interact() {
        Console.getInstance().writeln();
        this.servicesContract.writeln();
    }

}
