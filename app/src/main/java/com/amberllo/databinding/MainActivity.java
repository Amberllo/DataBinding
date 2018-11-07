package com.amberllo.databinding;

import android.Manifest;

import android.annotation.SuppressLint;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.amberllo.databinding.databinding.ActivityMainBinding;
import com.amberllo.databinding.presenter.MainPresenter;
import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainPresenter presenter;
    @SuppressLint("CheckResult")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        presenter = new MainPresenter();
        binding.setUser(presenter.getUser());
        binding.setOrder(presenter.getOrder());
        binding.setPresenter(presenter);
        new RxPermissions(this)
        .request(Manifest.permission.INTERNET,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean grand) throws Exception {
                        if (grand) {
//                            Toast.makeText(MainActivity.this, "已授权", Toast.LENGTH_SHORT).show();

                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });

    }

}
