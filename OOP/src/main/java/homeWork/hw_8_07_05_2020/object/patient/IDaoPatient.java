package homeWork.hw_8_07_05_2020.object.patient;

public interface IDaoPatient {
    long create(Patient p);

    Patient[] readAll();

    Patient[] readPatientsByDiagnosis(String diagnosis);

    Patient readByNumberOfMedicineCard(long numberOfMedicineCard);

    void remove(long id);

    void update(Patient p);

    default void clear() {

    }
}
