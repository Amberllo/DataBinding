package com.amberllo.databinding.presenter;

import com.amberllo.databinding.model.Item;
import com.amberllo.databinding.model.Order;
import com.amberllo.databinding.model.User;

import java.util.ArrayList;
import java.util.List;
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
        mUser.setAvatar("http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTL1fzKMuc6ZVicaqpkibZMK5E2HIOLiaSIpEGzD3OvxcpzibpTmluYobIpXxiaibp2xtPJlYTC90x8yGZ3Q/132");
    }


    public void changeOrder(){
        mOrder.setOrderId(mOrder.getOrderId()+"___");
        mOrder.setOrderName(mOrder.getOrderName()+"___");
    }

    public void changeItemData(){
        List<Item> itemData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            itemData.add(new Item("第" + i + "行"));
        }
        mUser.setListItem(itemData);
    }

    public Order getOrder() {
        return mOrder;
    }


}
