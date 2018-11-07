package com.amberllo.databinding.adapter;

import android.databinding.BindingAdapter;
import com.amberllo.databinding.model.Item;
import com.amberllo.databinding.view.TestRecyclerView;

import java.util.List;

public class ListDataAdapter {

    @BindingAdapter({"app:itemData"})
    public static void loadData(TestRecyclerView view, List<Item> itemData) {
        view.refreshList(itemData);
    }

}
