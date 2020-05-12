package HomeWork.HW_8_07_05_2020.object;


public class Person {

    // class body

    private long id;

    private String firstName;

    private String lastName;

    private int age;

    public Person() {
        System.out.println("Constructor");
    }

    public Person(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("Person constructor");
    }

    public Person(Builder b) {
        this.id = b.id;
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.age = b.age;
    }

    public void init(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void init(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    {
        System.out.println("Block init");
    }

    public void show() {
    }

    public Person fetchPerson() {
        return null;
    }

    static {
        System.out.println("Static block init.");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof Person) {
            return this.id == ((Person) o).id & this.age == ((Person) o).age &&
                    this.firstName.equals(((Person) o).firstName) &&
                    this.lastName.equals(((Person) o).lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + age + (firstName != null ? firstName.hashCode() : 0)
                + (lastName != null ? lastName.hashCode() : 0));
    }

    public static class Builder {

        private long id;

        private String firstName;

        private String lastName;

        private int age;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}

