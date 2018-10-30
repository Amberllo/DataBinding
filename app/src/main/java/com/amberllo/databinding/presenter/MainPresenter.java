package com.amberllo.databinding.presenter;

import com.amberllo.databinding.model.Order;
import com.amberllo.databinding.model.User;

import java.util.UUID;

public class MainPresenter {

    private User mUser;

    private Order mOrder;

    public MainPresenter(){

        mUser = new User("firstName","lastName");
        mOrder = new Order(UUID.randomUUID().toString(),"订单名字", System.currentTimeMillis());
    }

    public User getUser(){
        return mUser;
    }

    public void changeUser(){
        mUser.setLastName("lastName 1");
        mUser.setFirstName("firstName 1");
    }


    public void changeOrder(){
        mOrder.setOrderId(mOrder.getOrderId()+"___");
        mOrder.setOrderName(mOrder.getOrderName()+"___");
    }

    public Order getOrder() {
        return mOrder;
    }
}
