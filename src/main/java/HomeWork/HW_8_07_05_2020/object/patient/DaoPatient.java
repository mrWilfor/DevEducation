package homeWork.hw_8_07_05_2020.object.patient;

public class DaoPatient implements IDaoPatient {
    private static Patient[] listOfPatient = new Patient[0];

    public long create(Patient patient) {
        if (patient == null) {
            return -1;
        }

        if (listOfPatient.length == 0) {
            listOfPatient = new Patient[1];
            listOfPatient[0] = patient;
        } else {
            Patient[] arrayOfPatient = new Patient[listOfPatient.length + 1];

            for (int i = 0; i < listOfPatient.length; i++) {
                arrayOfPatient[i] = listOfPatient[i];
            }
            arrayOfPatient[arrayOfPatient.length - 1] = patient;
            listOfPatient = arrayOfPatient;
        }
        return patient.getId();
    }

    @Override
    public Patient[] readAll() {
        return listOfPatient;
    }

    @Override
    public Patient[] readPatientsByDiagnosis(String diagnosis) {
        Patient[] listOfPatientByDiagnosis = new Patient[0];

        if (diagnosis == null || diagnosis.equals("")) {
            return new Patient[0];
        }

        for (int i = 0; i < listOfPatient.length; i++) {
            if (diagnosis.equals(listOfPatient[i].getDiagnosis())) {
                if (listOfPatientByDiagnosis.length == 0) {
                    listOfPatientByDiagnosis = new Patient[1];
                    listOfPatientByDiagnosis[0] = listOfPatient[i];
                } else {
                    Patient[] newListOfPatientByDiagnosis = new Patient[listOfPatientByDiagnosis.length + 1];

                    for (int j = 0; j < listOfPatientByDiagnosis.length; j++) {
                        newListOfPatientByDiagnosis[j] = listOfPatientByDiagnosis[j];
                    }
                    newListOfPatientByDiagnosis[newListOfPatientByDiagnosis.length - 1] = listOfPatient[i];
                    listOfPatientByDiagnosis = newListOfPatientByDiagnosis;
                }
            }
        }
        return listOfPatientByDiagnosis;
    }

    @Override
    public Patient readByNumberOfMedicineCard(long numberOfMedicineCard) {
        if (numberOfMedicineCard == 0) {
            return null;
        }

        for (int i = 0; i < listOfPatient.length; i++) {
            if (numberOfMedicineCard == listOfPatient[i].getNumberOfMedicineCard()) {
                return listOfPatient[i];
            }
        }
        return null;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfPatient.length; i++) {
            if (id == listOfPatient[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Patient[] newListOfPatient = new Patient[listOfPatient.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfPatient[j] = listOfPatient[j];
            }

            for (int h = index + 1; h < listOfPatient.length; h++) {
                newListOfPatient[h - 1] = listOfPatient[h];
            }
            listOfPatient = newListOfPatient;
        }
    }

    @Override
    public void update(Patient patient) {
        for (int i = 0; i < listOfPatient.length; i++) {
            if (patient.getId() == listOfPatient[i].getId()) {
                listOfPatient[i] = patient;
            }
        }
    }

    @Override
    public void clear() {
        listOfPatient = new Patient[0];
    }
}
