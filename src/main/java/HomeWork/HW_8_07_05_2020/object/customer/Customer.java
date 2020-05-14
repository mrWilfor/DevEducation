package homeWork.hw_8_07_05_2020.object.customer;

import java.util.StringJoiner;

public class Customer {
    private long id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private long numberOfCreditCard;
    private long bankAccountNumber;

    public Customer() {

    }

    public Customer(long id, String surName, String name, String middleName, String address, long numberOfCreditCard, long bankAccountNumber) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(Builder b) {
        this.id = b.id;
        this.surName = b.surName;
        this.name = b.name;
        this.middleName = b.middleName;
        this.address = b.address;
        this.numberOfCreditCard = b.numberOfCreditCard;
        this.bankAccountNumber = b.bankAccountNumber;
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

    public long getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(long numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (o instanceof Customer) {
            return this.id == ((Customer) o).id && this.surName.equals(((Customer) o).surName) &&
                    this.name.equals(((Customer) o).name) && this.middleName.equals(((Customer) o).middleName) &&
                    this.address.equals(((Customer) o).address) &&
                    this.numberOfCreditCard == ((Customer) o).numberOfCreditCard &&
                    this.bankAccountNumber == ((Customer) o).bankAccountNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (surName != null ? surName.hashCode() : 0) + (name != null ? name.hashCode() : 0) +
                (middleName != null ? middleName.hashCode() : 0) + (address != null ? address.hashCode() : 0) +
                numberOfCreditCard + bankAccountNumber);
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("surName=".concat(surName))
                .add("name=".concat(name))
                .add("middleName=".concat(middleName))
                .add("address=".concat(address))
                .add("numberOfCreditCard=".concat(Long.toString(numberOfCreditCard)))
                .add("bankAccountNumber=".concat(Long.toString(bankAccountNumber)));
        String result = "HomeWork.HW_8_07_05_2020.object.Customer@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private long id;
        private String surName;
        private String name;
        private String middleName;
        private String address;
        private long numberOfCreditCard;
        private long bankAccountNumber;

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

        public Builder numberOfCreditCard(long numberOfCreditCard) {
            this.numberOfCreditCard = numberOfCreditCard;
            return this;
        }

        public Builder bankAccountNumber(long bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
