package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Student {
    private long id;
    private String surName;
    private String name;
    private String middleName;
    private int dateOfBirth;
    private String addressOfResidence;
    private long phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student() {

    }

    public Student(long id, String surName, String name, String middleName, int dateOfBirth, String addressOfResidence, long phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.addressOfResidence = addressOfResidence;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(Builder b) {
        this.id = b.id;
        this.surName = b.surName;
        this.name = b.name;
        this.middleName = b.middleName;
        this.dateOfBirth = b.dateOfBirth;
        this.addressOfResidence = b.addressOfResidence;
        this.phoneNumber = b.phoneNumber;
        this.faculty = b.faculty;
        this.course = b.course;
        this.group = b.group;
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

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddressOfResidence() {
        return addressOfResidence;
    }

    public void setAddressOfResidence(String addressOfResidence) {
        this.addressOfResidence = addressOfResidence;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object s) {
        if (this == s) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (s instanceof Student) {
            return this.id == ((Student) s).id && this.surName.equals(((Student) s).surName) &&
                    this.name.equals(((Student) s).name) && this.middleName.equals(((Student) s).middleName) &&
                    this.dateOfBirth == ((Student) s).dateOfBirth &&
                    this.addressOfResidence.equals(((Student) s).addressOfResidence) &&
                    this.phoneNumber == ((Student) s).phoneNumber && this.faculty.equals(((Student) s).faculty) &&
                    this.course == ((Student) s).course && this.group.equals(((Student) s).group);

        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (surName != null ? surName.hashCode() : 0) + (name != null ? name.hashCode() : 0) +
                (middleName != null ? middleName.hashCode() : 0) + dateOfBirth +
                (addressOfResidence != null ? addressOfResidence.hashCode() : 0) +
                phoneNumber + (faculty != null ? faculty.hashCode() : 0) + course +
                (group != null ? group.hashCode() : 0));
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("surName=".concat(surName))
                .add("name=".concat(name))
                .add("middleName=".concat(middleName))
                .add("dateOfBirth=".concat(Integer.toString(dateOfBirth)))
                .add("addressOfResidence=".concat(addressOfResidence))
                .add("phoneNumber=".concat(Long.toString(phoneNumber)))
                .add("faculty=".concat(faculty))
                .add("course=".concat(Integer.toString(course)))
                .add("group=".concat(group));

        String result = "HomeWork.HW_8_07_05_2020.object.Student@" + hashCode() + string.toString();
        return result;
    }

    public static class Builder {
        private long id;
        private String surName;
        private String name;
        private String middleName;
        private int dateOfBirth;
        private String addressOfResidence;
        private long phoneNumber;
        private String faculty;
        private int course;
        private String group;

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

        public Builder dateOfBirth(int dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder addressOfResidence(String addressOfResidence) {
            this.addressOfResidence = addressOfResidence;
            return this;
        }

        public Builder phoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder faculty(String faculty) {
            this.faculty = faculty;
            return this;
        }

        public Builder course(int course) {
            this.course = course;
            return this;
        }

        public Builder group(String group) {
            this.group = group;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}


