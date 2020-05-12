package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Patient {
    private long id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private long phoneNumber;
    private long numberOfMedicineCard;
    private String diagnosis;

    public Patient() {

    }

    public Patient(long id, String surName, String name, String middleName, String address, long phoneNumber, long numberOfMedicineCard, String diagnosis) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberOfMedicineCard = numberOfMedicineCard;
        this.diagnosis = diagnosis;
    }

    public Patient(Builder b) {
        this.id = b.id;
        this.surName = b.surName;
        this.name = b.name;
        this.middleName = b.middleName;
        this.address = b.address;
        this.phoneNumber = b.phoneNumber;
        this.numberOfMedicineCard = b.numberOfMedicineCard;
        this.diagnosis = b.diagnosis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getNumberOfMedicineCard() {
        return numberOfMedicineCard;
    }

    public void setNumberOfMedicineCard(long numberOfMedicineCard) {
        this.numberOfMedicineCard = numberOfMedicineCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof Patient) {
            return this.id == ((Patient) o).id && this.surName.equals(((Patient) o).surName) &&
                    this.name.equals(((Patient) o).name) && this.middleName.equals(((Patient) o).middleName) &&
                    this.address.equals(((Patient) o).address) && this.phoneNumber == ((Patient) o).phoneNumber &&
                    this.numberOfMedicineCard == ((Patient) o).numberOfMedicineCard &&
                    this.diagnosis.equals(((Patient) o).diagnosis);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (surName != null ? surName.hashCode() : 0) + (name != null ? name.hashCode() : 0) +
                (middleName != null ? middleName.hashCode() : 0) + (address != null ? address.hashCode() : 0) +
                phoneNumber +numberOfMedicineCard + (diagnosis != null ? diagnosis.hashCode() : 0));
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("surName=".concat(surName))
                .add("name=".concat(name))
                .add("middleName=".concat(middleName))
                .add("address=".concat(address))
                .add("phoneNumber=".concat(Long.toString(phoneNumber)))
                .add("numberOfMedicineCard=".concat(Long.toString(numberOfMedicineCard)))
                .add("diagnosis=".concat(diagnosis));
        String result = "HomeWork.HW_8_07_05_2020.object.Patient@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private long id;
        private String surName;
        private String name;
        private String middleName;
        private String address;
        private long phoneNumber;
        private long numberOfMedicineCard;
        private String diagnosis;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder numberOfMedicineCard(long numberOfMedicineCard) {
            this.numberOfMedicineCard = numberOfMedicineCard;
            return this;
        }

        public Builder diagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }
    }
}
