package es.pbover.master;

abstract class ServicesContractOption extends Option {

    protected ServicesContract servicesContract;

    public ServicesContractOption(String string, ServicesContract servicesContract) {
        super(string);
        this.servicesContract = servicesContract;
    }

}
