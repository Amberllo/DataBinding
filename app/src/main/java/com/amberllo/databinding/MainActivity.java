package com.amberllo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amberllo.databinding.databinding.ActivityMainBinding;
import com.amberllo.databinding.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        presenter = new MainPresenter();
        binding.setUser(presenter.getUser());
        binding.setOrder(presenter.getOrder());
        binding.setPresenter(presenter);

    }

}
