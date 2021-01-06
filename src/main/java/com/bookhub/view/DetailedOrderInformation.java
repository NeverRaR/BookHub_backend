package com.bookhub.view;

import com.bookhub.model.BookOrder;
import com.bookhub.model.PurchaseDTO;

import java.util.Date;
import java.util.List;

public class DetailedOrderInformation {
    private final BookOrder bookOrder;
    private final List<PurchaseDTO> purchaseDTOList;

    public DetailedOrderInformation(BookOrder bookOrder, List<PurchaseDTO> purchaseDTOList) {
        this.bookOrder = bookOrder;
        this.purchaseDTOList = purchaseDTOList;
    }

    public int getOrderId(){
        return bookOrder.getId();
    }
    public String getName(){
        return bookOrder.addressInstance().getName();
    }
    public String getPhone(){
        return bookOrder.addressInstance().getPhone();
    }
    public String getLocation(){
        return bookOrder.addressInstance().getLocation();
    }
    public List<PurchaseDTO> getBookList(){
        return purchaseDTOList;
    }
    public String getStartTime(){
        return bookOrder.getStartTime().toString();
    }
    public String getReceiveTime(){
        return bookOrder.getReceiveTime().toString();
    }
    public Double getPostCost(){
        return bookOrder.getPostCost();
    }
    public Double getTotal(){
        return bookOrder.getPrice();
    }
    public String getOrderStatus(){
        return bookOrder.getStatus();
    }
}
