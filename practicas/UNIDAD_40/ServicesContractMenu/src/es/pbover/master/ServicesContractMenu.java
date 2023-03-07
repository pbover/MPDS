package es.pbover.master;

class ServicesContractMenu extends DynamicMenu {

    private ServicesContract servicesContract;

    public ServicesContractMenu(ServicesContract servicesContract) {
        super("Gestión de Contratos de Servicios");
        this.servicesContract = servicesContract;
    }

    @Override
    protected void addOptions() {
        this.add(new ListServicesContractOption(this.servicesContract));
        this.add(new CostServicesContractOption(this.servicesContract));
        this.add(new CancelServicesContractOption(this.servicesContract));
        this.add(new EnlargeServicesContractOption(this.servicesContract));
        this.add(new ShiftServicesContractOption(this.servicesContract));
    }

}
