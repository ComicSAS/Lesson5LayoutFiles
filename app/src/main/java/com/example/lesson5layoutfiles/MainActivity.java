package com.example.lesson5layoutfiles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //вызов метода родительского класса, выполняющий необходимые процедуры
        super.onCreate(savedInstanceState);
        //устанавливает содержимое Activity из layout-файла
        setContentView(R.layout.myscreen);
    }
}
