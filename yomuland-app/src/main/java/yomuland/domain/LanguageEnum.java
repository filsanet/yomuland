package yomuland.domain;

public enum LanguageEnum {

    ENGLISH (1, "en"),
    JAPANESE (2, "ja");

    private final int id;
    private final String isoCode; // ISO 639-1 Language Code

    LanguageEnum(int id, String isoCode) {
        this.id = id;
        this.isoCode = isoCode;
    }

    private int getId() { return id; }
    private String getIsoCode() { return isoCode; }


}
