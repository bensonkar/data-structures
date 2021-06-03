package main;

/**
 * @author bkariuki
 */
public enum BEnum {
    MALE("male"),FEMALE("female");

    private final String code;

    private BEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
