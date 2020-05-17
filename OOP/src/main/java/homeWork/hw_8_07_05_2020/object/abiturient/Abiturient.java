package homeWork.hw_8_07_05_2020.object.abiturient;

import java.util.Arrays;
import java.util.StringJoiner;

public class Abiturient {
    private long id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private long phoneNumber;
    private int[] assessments;

    public Abiturient() {

    }

    public Abiturient(long id, String surName, String name, String middleName, String address, long phoneNumber, int[] assessments) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.assessments = assessments;
    }

    public Abiturient(Builder b) {
        this.id = b.id;
        this.surName = b.surName;
        this.name = b.name;
        this.middleName = b.middleName;
        this.address = b.address;
        this.phoneNumber = b.phoneNumber;
        this.assessments = b.assessments;
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

    public int[] getAssessments() {
        return assessments;
    }

    public void setAssessments(int[] assessments) {
        this.assessments = assessments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof Abiturient) {
            return this.id == ((Abiturient) o).id && this.surName.equals(((Abiturient) o).surName) &&
                    this.name.equals(((Abiturient) o).name) && this.middleName.equals(((Abiturient) o).middleName) &&
                    this.address.equals(((Abiturient) o).address) && this.phoneNumber == ((Abiturient) o).phoneNumber &&
                    Arrays.equals(this.assessments, ((Abiturient) o).assessments);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (surName != null ? surName.hashCode() : 0) + (name != null ? name.hashCode() : 0) +
                (middleName != null ? middleName.hashCode() : 0) + (address != null ? address.hashCode() : 0) +
                phoneNumber + (assessments != null ? Arrays.hashCode(assessments) : 0));
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
                .add("assessments=".concat(Arrays.toString(assessments)));
        String result = "HomeWork.HW_8_07_05_2020.object.Abiturient@".concat(Integer.toString(hashCode()));
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
        private int[] assessments;

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

        public Builder assessments(int[] assessments) {
            this.assessments = assessments;
            return this;
        }

        public Abiturient build() {
            return new Abiturient(this);
        }
    }
}
