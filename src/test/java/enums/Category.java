package enums;

public enum Category {
    ONLINER_PRIME("12", "Onlíner Prime"),
    ELECTRONICS("1", "Электроника"),
    COMPUTERS_AND_NETWORK("2", "Компьютеры и сети"),
    HOUSEHOLD_APPLIANCES("3", "Бытовая техника"),
    CONSTRUCTION_AND_REPAIR("4", "Стройка и ремонт"),
    HOUSE_AND_GARDEN("5", "Дом и сад"),
    AUTO_AND_MOTO("6", "Авто и мото"),
    BEAUTY_AND_SPORT("7", "Красота и спорт"),
    FOR_CHILDREN_AND_MOTHER("8", "Детям и мамам"),
    WORK_AND_OFFICE("9", "Работа и офис");

    private final String xpathValue;
    private final String name;

    Category(String xpathValue, String name) {
        this.xpathValue = xpathValue;
        this.name = name;
    }

    public String getXpathValue() {
        return xpathValue;
    }

    public String getName() {
        return name;
    }
}