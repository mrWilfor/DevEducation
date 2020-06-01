package practice.practic_14_28_05_2020.enums;

public enum QualityClass {
    HIGH("Lux"),
    MIDDLE("Not bad"),
    LOW("Low");

    public final String qualityClass;

    QualityClass(String qualityClass) {
        this.qualityClass = qualityClass;
    }
}
