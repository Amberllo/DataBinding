package com.amberllo.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.amberllo.databinding.BR;
import java.util.Date;
import java.util.UUID;

public class Item extends BaseObservable {



    private String id;
    private String name;
    private String date;

    public Item(String name){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.date = new Date().toString();
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        notifyPropertyChanged(BR.date);
    }
}
