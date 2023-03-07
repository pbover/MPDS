package es.pbover.master;

class ServicesContractMenu extends DynamicMenu {

    private ServicesContract servicesContract;

    /*
     * menu principal
     * 1.- Imprimir Contratos de Servicios
     * 2 - Cancelar Contrato de Servicios
     * 3.- Ampliar Contrato de Servicios
     * 4.- Desplazar Contrato de Servicios
     * 5.- Salir
     */

    public ServicesContractMenu(ServicesContract servicesContract) {
        super("Gestión de Contratos de Servicios");
        this.servicesContract = servicesContract;
    }

    @Override
    protected void addOptions() {
        this.add(new PrintServicesContractOption(this.servicesContract));
        this.add(new CostServicesContractOption(this.servicesContract));
        this.add(new CancelServicesContractOption(this.servicesContract));
        this.add(new EnlargeServicesContractOption(this.servicesContract));
        this.add(new ShiftServicesContractOption(this.servicesContract));
    }

}
