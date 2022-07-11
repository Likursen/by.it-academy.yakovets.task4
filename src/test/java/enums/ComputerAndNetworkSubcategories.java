package enums;

public enum ComputerAndNetworkSubcategories {
    LAPTOPS_COMPUTER_MONITORS("Ноутбуки, компьютеры, мониторы"),
    ACCESSORIES("Комплектующие"),
    DATA_STORAGE("Хранение данных"),
    NETWORK_HARDWARE("Сетевое оборудование");

    private final String subcategoryName;

    ComputerAndNetworkSubcategories(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public String getName() {
        return subcategoryName;
    }
}