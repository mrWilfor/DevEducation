package homeWork.hw_8_07_05_2020.object.phone;

public class DaoPhone implements IDaoPhone {
    private static Phone[] listOfSubscribers = new Phone[0];

    @Override
    public long create(Phone phone) {
        if (phone == null) {
            return -1;
        }

        if (listOfSubscribers.length == 0) {
            listOfSubscribers = new Phone[1];
            listOfSubscribers[0] = phone;
        } else {
            Phone[] arrayOfSubscribers = new Phone[listOfSubscribers.length + 1];

            for (int i = 0; i < listOfSubscribers.length; i++) {
                arrayOfSubscribers[i] = listOfSubscribers[i];
            }
            arrayOfSubscribers[arrayOfSubscribers.length - 1] = phone;
            listOfSubscribers = arrayOfSubscribers;
        }
        return phone.getId();
    }

    @Override
    public Phone[] readAll() {
        return listOfSubscribers;
    }

    @Override
    public Phone[] readByTalkTimeMoreThan(long talkTime) {
        Phone[] listOfSubscribersByTalkTime = new Phone[0];

        for (int i = 0; i < listOfSubscribers.length; i++) {
            if (talkTime < listOfSubscribers[i].getTalkTime()) {
                if (listOfSubscribersByTalkTime.length == 0) {
                    listOfSubscribersByTalkTime = new Phone[1];
                    listOfSubscribersByTalkTime[0] = listOfSubscribers[i];
                } else {
                    Phone[] newListOfSubscribersByTalkTime =
                            new Phone[listOfSubscribersByTalkTime.length + 1];

                    for (int j = 0; j < listOfSubscribersByTalkTime.length; j++) {
                        newListOfSubscribersByTalkTime[j] = listOfSubscribersByTalkTime[j];
                    }
                    newListOfSubscribersByTalkTime[newListOfSubscribersByTalkTime.length - 1] =
                            listOfSubscribers[i];
                    listOfSubscribersByTalkTime = newListOfSubscribersByTalkTime;
                }
            }
        }
        return listOfSubscribersByTalkTime;
    }

    @Override
    public Phone[] readByAlphabet() {
        Phone[] sortingListOfSubscriber = new Phone[listOfSubscribers.length];
        boolean trigger;

        for (int i = 0; i < listOfSubscribers.length; i++) {
            sortingListOfSubscriber[i] = listOfSubscribers[i];
        }

        do {
            trigger = false;

            for (int i = 0; i < sortingListOfSubscriber.length - 1; i++) {
                String surName1 = sortingListOfSubscriber[i].getSurName();
                String surName2 = sortingListOfSubscriber[i + 1].getSurName();
                char[] arraySurName1 = surName1.toCharArray();
                char[] arraySurName2 = surName2.toCharArray();

                if (arraySurName1.length <= arraySurName2.length) {
                    for (int j = 0; j < surName1.length(); j++) {
                        if (arraySurName1[j] < arraySurName2[j]) {
                            break;
                        } else if (arraySurName1[j] > arraySurName2[j]) {
                            Phone bufferVariable = sortingListOfSubscriber[i];
                            sortingListOfSubscriber[i] = sortingListOfSubscriber[i + 1];
                            sortingListOfSubscriber[i + 1] = bufferVariable;
                            trigger = true;
                            break;
                        }
                    }
                } else if (arraySurName1.length > arraySurName2.length) {
                    for (int j = 0; j < surName2.length(); j++) {
                        if (arraySurName1[j] < arraySurName2[j]) {
                            break;
                        } else if (arraySurName1[j] > arraySurName2[j]) {
                            Phone bufferVariable = sortingListOfSubscriber[i];
                            sortingListOfSubscriber[i] = sortingListOfSubscriber[i + 1];
                            sortingListOfSubscriber[i + 1] = bufferVariable;
                            trigger = true;
                            break;
                        }
                    }
                }
            }
        } while (trigger);
        return sortingListOfSubscriber;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfSubscribers.length; i++) {
            if (id == listOfSubscribers[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Phone[] newListOfSubscribers = new Phone[listOfSubscribers.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfSubscribers[j] = listOfSubscribers[j];
            }

            for (int h = index + 1; h < listOfSubscribers.length; h++) {
                newListOfSubscribers[h - 1] = listOfSubscribers[h];
            }
            listOfSubscribers = newListOfSubscribers;
        }
    }

    @Override
    public void update(Phone phone) {
        for (int i = 0; i < listOfSubscribers.length; i++) {
            if (phone.getId() == listOfSubscribers[i].getId()) {
                listOfSubscribers[i] = phone;
            }
        }
    }

    @Override
    public void clear() {
        listOfSubscribers = new Phone[0];

    }
}
