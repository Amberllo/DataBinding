package com.amberllo.databinding.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amberllo.databinding.R;
import com.amberllo.databinding.databinding.ItemRecyTestBinding;
import com.amberllo.databinding.model.Item;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerView extends RecyclerView {
    private TestAdapter adapter;

    public TestRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        adapter = new TestAdapter();
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(adapter);

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add(new Item("第" + i + "行"));
        }

        adapter.refresh(items);
    }


    class TestAdapter extends Adapter<TestViewHolder> {

        List<Item> items = new ArrayList<>();

        public void refresh(List<Item> items) {
            this.items.clear();
            this.items.addAll(items);
            notifyDataSetChanged();
        }

        public Item getItem(int position) {
            return items.get(position);
        }

        @Override
        public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recy_test, parent, false);
            return new TestViewHolder(view);
        }

        @Override
        public void onBindViewHolder(TestViewHolder holder, int position) {
            holder.bind(getItem(position));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }

    static class TestViewHolder extends ViewHolder {
        ItemRecyTestBinding mBinding;

        public TestViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public void bind(Item item) {
            mBinding.setItem(item);
        }

    }

}
