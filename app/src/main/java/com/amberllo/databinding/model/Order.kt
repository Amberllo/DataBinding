package com.amberllo.databinding.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.amberllo.databinding.BR

class Order (_orderId: String, _orderName: String, _orderTime: Long) : BaseObservable(){

    @get:Bindable
    var orderId : String = _orderId
        set(value) {
            field = value
            notifyPropertyChanged(BR.orderId)
        }

    @get:Bindable
    var orderName = _orderName
        set(value) {
            field = value
            notifyPropertyChanged(BR.orderName)
        }


    @get:Bindable
    var orderTime = _orderTime
        set(value) {
            field = value
            notifyPropertyChanged(BR.orderTime)
        }

}
