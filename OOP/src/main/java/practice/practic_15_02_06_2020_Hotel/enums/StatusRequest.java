package practice.practic_15_02_06_2020_Hotel.enums;

public enum StatusRequest {
    NOTREVIEWED("Not reviewed"),
    WAITINGFORCLIENTSCONFIMATION("Waiting for clients confirmation"),
    ROOMRESERVED("Room reserved"),
    PAID("Paid");

    final String status;

    StatusRequest(String status) {
        this.status = status;
    }
}
