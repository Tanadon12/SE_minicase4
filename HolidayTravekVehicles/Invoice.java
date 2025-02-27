class Invoice {
    private final String invoiceNumber;
    private final Customer customer;
    private final Vehicle vehicle;
    private final double tradeInAllowance;
    private final double dealerOptionsCost;
    private final double taxes;
    private final double licenseFees;
    private final double finalPrice;

    public Invoice(String invoiceNumber, Customer customer, Vehicle vehicle, double tradeInAllowance, double dealerOptionsCost, double taxes, double licenseFees) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.vehicle = vehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.dealerOptionsCost = dealerOptionsCost;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.finalPrice = calculateFinalPrice();
    }

    private double calculateFinalPrice() {
        return vehicle.getBaseCost() + dealerOptionsCost + taxes + licenseFees - tradeInAllowance;
    }

    public void requestDealerInstallOptions() {
        System.out.println("Requesting dealer-installed options for invoice " + invoiceNumber);
    }

    public void sumFinalNegotiatedPrice() {
        System.out.println("Final negotiated price: $" + finalPrice);
    }

    @Override
    public String toString() {
        return "Invoice No: " + invoiceNumber + "\nCustomer: " + customer.getName() + "\nVehicle: " + vehicle.getName() + 
               "\nTrade-In Allowance: $" + tradeInAllowance + "\nDealer Options Cost: $" + dealerOptionsCost + 
               "\nTaxes: $" + taxes + "\nLicense Fees: $" + licenseFees + "\nFinal Price: $" + finalPrice;
    }
}