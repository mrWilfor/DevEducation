package practice.practic_14_28_05_2020.implInterfaces;

import homeWork.hw_10_Shop_Extend.classes.UIDGeneration;
import practice.practic_14_28_05_2020.enums.Mark;
import practice.practic_14_28_05_2020.enums.QualityClass;
import practice.practic_14_28_05_2020.interfaces.Car;

import java.util.Objects;

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

    @Override
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

    @Override
    public String getInfoAboutCar() {
        return infoAboutCar;
    }

    @Override
    public void setInfoAboutCar(String infoAboutCar) {
        this.infoAboutCar = infoAboutCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImplCar car = (ImplCar) o;

        return id == car.id &&
                prise == car.prise &&
                Objects.equals(name, car.name) &&
                mark == car.mark &&
                qualityClass == car.qualityClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, mark, qualityClass, prise);
    }

    @Override
    public String toString() {
        return "ImplCar{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mark=" + mark +
                ", qualityClass=" + qualityClass +
                ", prise=" + prise +
                '}';
    }
}
