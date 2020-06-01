package practice.practic_14_28_05_2020.implInterfaces;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.interfaces.Car;

public class ImplCar implements Car {
    private String name;
    private long id;
    private Mark mark;
    private QualityClass qualityClass;
    private int prise;
    private boolean damaged;
    private String infoAboutCar;

    {
        damaged = true;
        id = UIDGeneration.getUID();
    }

    public ImplCar(String name, Mark mark, QualityClass qualityClass, int prise, String infoAboutCar) {
        this.name = name;
        this.mark = mark;
        this.qualityClass = qualityClass;
        this.prise = prise;
        this.infoAboutCar = infoAboutCar;
    }

    @Override
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public Mark getMark() {
        return mark;
    }

    @Override
    public QualityClass getQualityClass() {
        return qualityClass;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public boolean getDamaged() {
        return damaged;
    }

    @Override
    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public String getInfoAboutCar() {
        return infoAboutCar;
    }

    public void setInfoAboutCar(String infoAboutCar) {
        this.infoAboutCar = infoAboutCar;
    }
}
