package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_Item;
    ArrayList<Item> List_Item = new ArrayList<>();
    ListAdapter br_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showRecyclerList();
    }

    private void showRecyclerList(){
        rv_Item = findViewById(R.id.rv_superhero);
        br_adapter = new ListAdapter(MainActivity.this, List_Item);

        prepareData();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rv_Item.setLayoutManager(mLayoutManager);
        rv_Item.setAdapter(br_adapter);
        br_adapter.notifyDataSetChanged();


    }

    private void showSelectedHero(Item item) {
        Toast.makeText(this, "Kamu memilih " + item.getName(), Toast.LENGTH_SHORT).show();
    }

    private void prepareData() {

        Item s = new Item();
        s.setPicture(R.drawable.python);
        s.setName("Python");
        s.setDetail("Python merupakan bahasa pemrograman tingkat tinggi yang diracik oleh Guido van Rossum.\n" +
                "\n" +
                "Python banyak digunakan untuk membuat berbagai macam program, seperti: program CLI, Program GUI (desktop), Aplikasi Mobile, Web, IoT, Game, Program untuk Hacking, dsb.\n" +
                "\n" +
                "Python juga dikenal dengan bahasa pemrograman yang mudah dipelajari, karena struktur sintaknya rapi dan mudah dipahami.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.php);
        s.setName("PHP");
        s.setDetail("Bahasa Pemrograman PHP adalah bahasa pemrograman script server-side yang didesain untuk pengembangan web. Selain itu, PHP juga bisa digunakan sebagai bahasa pemrograman umum (wikipedia). Pertama kali di kembangkan oleh Rasmust Lerdorf pada tahun 1995, dan sekarang php dikembangkan oleh The PHP Group.\n" +
                "\n" +
                "Pada awalnya PHP dikenal dengan singkatan Personal Home Page. Karena server tersebut di peruntukan untuk website pribadi. Tetapi untuk saat ini PHP sudah bermetamorfosis menjadi bahasa pemrograman yang sangat populer yang digunakan untuk website terkenal seperti Wikipedia, wordpress , joomla dll.\n" +
                "Untuk saat ini php dikenal dengan singkatan Hypertext Preprocessor sebuah kepanjangan rekursif, yakni permainan kata dimana kepanjangannya terdiri dari singkatan itu sendiri. Bahasa pemrograman php banyak digunakan karena sifatnya yang open source yaitu dapat digunakan secara gratis.\n" +
                "\n" +
                "Fungsi bahasa pemrograman php sendiri untuk web digunakan untuk dapat menyesuaikan tanpilan konten sesuai dengan situasi. Web yang bersifat dinamis juga digunakan untuk menyimpan data ke database dengan memproses from dan juga dapat megubah tampilan website sesuai inputan dari seorang user.");
        List_Item.add(s);

    }

}
