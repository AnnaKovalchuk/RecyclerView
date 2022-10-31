package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
}
    private void setInitialData(){

        states.add(new State ("Россия", "Москва", "17 098 246 км^2", "146 240 000 человек", R.drawable.russia));
        states.add(new State ("Казахстан", "Астана", "2 724 902 км^2", "19 644 057 человек", R.drawable.kazakhstan));
        states.add(new State ("Китай", "Пекин", "9 596 961 км^2", "1 410 539 758 человек", R.drawable.china));
        states.add(new State ("США", "Вашингтон", "9 826 675 км^2", "301 693 000 человек", R.drawable.usa));
        states.add(new State ("Канада", "Оттава", "9 984 670 км^2", "38 929 902 человек", R.drawable.canada));
        states.add(new State ("Мексика", "Мехико", "1 972 550 км^2", "129 150 971 человек", R.drawable.mexica));
        states.add(new State ("Сингапур", "Сингапур", "733 км^2", "5 637 000 человек", R.drawable.singapur));
        states.add(new State ("Португалия", "Лиссабон", "92 225 км^2", "10 347 892 человек", R.drawable.portugalia));
        states.add(new State ("Испания", "Мадрид", "505 990 км^2", "47 394 223 человек", R.drawable.spain));
        states.add(new State ("Италия", "Рим", "301 338 км^2", "58 983 122 человек", R.drawable.italia));
    }

}