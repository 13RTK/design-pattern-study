package com.desginpattern.factory.couple;

import lombok.Data;

import java.util.LinkedList;

@Data
public class CarTransport {
    private Integer CarNum;
    private Integer driverId;
    private String carType;
    private String startPlace;
    private String destinationPlace;

    private LinkedList<String> orderList = new LinkedList<>();
    private LinkedList<String> tollStationRecords = new LinkedList<>();

    public void getOrder(String orderInfo) {
        this.orderList.add(orderInfo);
    }

    public String deliveryOrder() {
        return this.orderList.pollLast();
    }

    public String searchPassRecord(String tollStation) {
        for (String curTollStationRecord : tollStationRecords) {
            if (curTollStationRecord.contains(tollStation)) {
                return curTollStationRecord;
            }
        }

        return "NOT MATCHED";
    }

    public void changeDriver(int newDriverId) {
        this.driverId = newDriverId;
    }
}
