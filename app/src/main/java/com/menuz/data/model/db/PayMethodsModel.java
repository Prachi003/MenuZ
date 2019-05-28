package com.menuz.data.model.db;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "paymethods")
public class PayMethodsModel {

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }


    @ColumnInfo(name = "termId")
    private String termId;


    @ColumnInfo(name = "payMethodId")
    private String payMethodId;

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "primary")
    private int primary;


    @ColumnInfo(name = "payMethodName")
    private String payMethodName;

    public String getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(String payMethodId) {
        this.payMethodId = payMethodId;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String payMethodName) {
        this.payMethodName = payMethodName;
    }

    public String getPayMethodFixValue() {
        return payMethodFixValue;
    }

    public void setPayMethodFixValue(String payMethodFixValue) {
        this.payMethodFixValue = payMethodFixValue;
    }

    public String getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(String payMethodType) {
        this.payMethodType = payMethodType;
    }

    @ColumnInfo(name = "payMethodFixValue")
    private String payMethodFixValue;

    @ColumnInfo(name = "payMethodType")
    private String payMethodType;


    public String getOrderId() {
        return OrderId;
    }



    public void setOrderId( String orderId) {
        OrderId = orderId;
    }

    @ColumnInfo(name = "OrderId")
    private String OrderId;


    @NonNull
    public int getPrimary() {
        return primary;
    }

    public void setPrimary(@NonNull int primary) {
        this.primary = primary;
    }
}
