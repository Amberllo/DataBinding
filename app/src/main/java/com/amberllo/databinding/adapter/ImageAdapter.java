package com.amberllo.databinding.adapter;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageAdapter {

    @BindingAdapter({"android:src"})
    public static void loadSrc(ImageView view, int resource) {
        view.setImageResource(resource);
    }

    @BindingAdapter({"app:imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
