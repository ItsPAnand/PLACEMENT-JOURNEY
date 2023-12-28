package com.app.bank.model;

public class SelfDeposit {

    public String accId;
    public double depositAmount;


    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    @Override
    public String toString() {
        return "SelfDeposit{" +
                "accId='" + accId + '\'' +
                ", depositAmount=" + depositAmount +
                '}';
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
