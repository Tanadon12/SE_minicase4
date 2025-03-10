
class DealerInstalledOptions {
    private final String optionCode;
    private final String description;
    private final double price;

    public DealerInstalledOptions(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dealer Installed Option [Code: " + optionCode + ", Description: " + description + ", Price: $" + price + "]";
    }
}