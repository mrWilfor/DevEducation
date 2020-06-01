package practice.practic_14_28_05_2020.interfaces;

import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;

public interface Car {
    String getName();

    Mark getMark();

    QualityClass getQualityClass();

    int getPrise();

    boolean getDamaged();

    void setDamaged(boolean damaged);
}
