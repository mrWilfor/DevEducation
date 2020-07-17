package homeWork.hw_17_08_07_2020_Bank;

import java.util.ArrayList;
import java.util.List;

public class ListOfReport {
    List<ObjectReport> list = new ArrayList<>();

    public void addObjectToReport(ObjectReport objectReport) {
        list.add(objectReport);
    }

    public List<ObjectReport> getList() {
        return list;
    }
}
