package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Phone {
    private long id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private long numberOfCreditCard;
    private long debit;
    private long credit;
    private long talkTime;

    public Phone() {

    }

    public Phone(long id, String surName, String name, String middleName, String address, long numberOfCreditCard, long debit, long credit, long talkTime) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.debit = debit;
        this.credit = credit;
        this.talkTime = talkTime;
    }

    public Phone(Builder b) {
        this.id = b.id;
        this.surName = b.surName;
        this.name = b.name;
        this.middleName = b.middleName;
        this.address = b.address;
        this.numberOfCreditCard = b.numberOfCreditCard;
        this.debit = b.debit;
        this.credit = b.credit;
        this.talkTime = b.talkTime;
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

    public long getDebit() {
        return debit;
    }

    public void setDebit(long debit) {
        this.debit = debit;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public long getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(long talkTime) {
        this.talkTime = talkTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o == null) {
            return false;
        } else if (o instanceof Phone) {
            return this.id == ((Phone) o).id && this.surName.equals(((Phone) o).surName) && this.name.equals(((Phone) o).name) &&
                    this.middleName.equals(((Phone) o).middleName) && this.address.equals(((Phone) o).address) &&
                    this.numberOfCreditCard == ((Phone) o).numberOfCreditCard && this.debit == ((Phone) o).debit &&
                    this.credit == ((Phone) o).credit && this.talkTime == ((Phone) o).talkTime;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (surName != null ? surName.hashCode() : 0) + (name != null ? name.hashCode() : 0) +
                (middleName != null ? middleName.hashCode() : 0) + (address != null ? address.hashCode() : 0) +
                numberOfCreditCard + debit + credit + talkTime);
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
                .add("debit=".concat(Long.toString(debit)))
                .add("credit=".concat(Long.toString(credit)))
                .add("talkTime=".concat(Long.toString(talkTime)));
        String result = "HomeWork.HW_8_07_05_2020.object.Phone@".concat(Integer.toString(hashCode()));
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
        private long debit;
        private long credit;
        private long talkTime;

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

        public Builder debit(long debit) {
            this.debit = debit;
            return this;
        }

        public Builder credit(long credit) {
            this.credit = credit;
            return this;
        }

        public Builder talkTime(long talkTime) {
            this.talkTime = talkTime;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
