package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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
        rv_Item.setNestedScrollingEnabled(false);
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

        s = new Item();
        s.setPicture(R.drawable.java);
        s.setName("Java");
        s.setDetail("Sejarah Java di mulai dari tahun 1991, James Gosling, Mike Sheridan, dan Patrick Noughten ditawari untuk membuat project platform smart appliance oleh perusahaan tempat mereka sendiri yaitu Sun Microsystem.\n" +
                "\n"+
                "Java sebagai salah satu bahasa pemrograman yang sudah berumur dari era 1990-an, kian berkembang dan melebarkan dominasinya di berbagai bidang. Salah satu penggunaan terbesar Java adalah dalam pembuatan aplikasi native untuk Android. Selain itu Java pun menjadi pondasi bagi berbagai bahasa pemrograman seperti Kotlin, Scala, Clojure, Groovy, JRuby, Jython, dan lainnya yang memanfaatkan Java Virtual Machine sebagai rumahnya.\n" +
                "\n" +
                "Java pun akrab dengan dunia saintifik dan akademik. Cukup banyak akademisi di Indonesia yang menggunakan Java sebagai alat bantu untuk menyelesaikan skripsi atau tugas akhir dengan berbagai topik yang didominasi kecerdasan buatan, data mining, enterprise architecture, aplikasi mobile, dan lainnya. Di dunia web development sendiri, Java memiliki berbagai web framework unggulan seperti Spring, Play Framework, Spark, Jakarta Struts, dan Java Server Pages.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.go);
        s.setName("Golang");
        s.setDetail("Golang (atau biasa disebut dengan Go) adalah bahasa pemrograman baru yang dikembangkan di Google oleh Robert Griesemer, Rob Pike, dan Ken Thompson pada tahun 2007 dan mulai diperkenalkan di publik tahun 2009.\n" +
                "\n" +
                "Penciptaan bahasa Go didasari bahasa C dan C++, oleh karena itu gaya sintaks-nya mirip.\n" +
                "\n" +
                "Go memiliki kelebihan dibanding bahasa lainnya, beberapa di antaranya:\n" +
                "\n" +
                "Mendukung konkurensi di level bahasa dengan pengaplikasian cukup mudah\n" +
                "Mendukung pemrosesan data dengan banyak prosesor dalam waktu yang bersamaan (pararel processing)\n" +
                "Memiliki garbage collector\n" +
                "Proses kompilasi sangat cepat\n" +
                "Bukan bahasa pemrograman yang hirarkial, menjadikan developer tidak perlu ribet memikirkan segmen OOP-nya\n" +
                "Package/modul yang disediakan terbilang lengkap. Karena bahasa ini open source, banyak sekali developer yang juga mengembangkan modul-modul lain yang bisa dimanfaatkan\n" +
                "Sudah banyak industri dan perusahaan yg menggunakan Go sampai level production, termasuk diantaranya adalah Google sendiri, dan juga tempat dimana penulis bekerja");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.ruby);
        s.setName("Ruby");
        s.setDetail("Bahasa pemrograman Ruby merupakan sebuah bahasa pemrograman yang dinamis, reflektif, general-purposed, dan berbasis objek. Yukihiro “Matz” Matsumoto dari Jepang merupakan orang yang merancang dan mengembangkan bahasa ini.\n" +
                "\n" +
                "Meskipun tergolong sebagai bahasa pemrograman yang mudah untuk dipelajari, bahasa pemrograman ini memiliki fungsi yang sangat luar biasa diantaranya yaitu dapat digunakan untuk membangun Desktop GUI atau Graphic User Interfaces, membuat aplikasi web, dan mengembangkan web itu sendiri.\n" +
                "\n" +
                "Telah banyak platform yang dibangun menggunakan bahasa pemrograman ini mulai dari Hulu, Groupu, bahkan Twitter. Hal ini membuktikan bahasa pemrograman Ruby merupakan bahasa yang layak untuk dipelajari.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.kotlin);
        s.setName("Kotlin");
        s.setDetail("Di Google I/O kemarin, Google kini telah memberikan dukungan penuh untuk bahasa pemrograman Kotlin. Android Studio 3.0 yang akan segera diluncurkan dalam waktu dekat nantinya akan langsung mendukung bahasa pemrograman Kotlin.\n" +
                "\n" +
                "Mungkin bagi sebagian developer aplikasi Android sudah tahu tentang Kotlin. Nah bagi yang belum tahu apa itu Kotlin sederhananya Kotlin adalah bahasa pemrograman yang merupakan “penyempurnaan” dari bahasa pemrograman Java untuk pengembangan aplikasi Android.\n" +
                "\n" +
                "Kotlin awalnya dikembangkan oleh JetBrains, perusahaan dibalik IntelliJ IDEA. Setelah melalui banyak perkembangan, JetBrains merilis Kotlin secara open source dan kini setelah perkembangannya semakin maju, Google mendukung penuh Kotlin untuk pengembangan aplikasi Android.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.js);
        s.setName("Javascript");
        s.setDetail("JavaScript dibuat dan didesain selama sepuluh hari oleh Brandan Eich, seorang karyawan Netscape, pada bulan September 1995. Awalnya bahasa pemrograman ini disebut Mocha, kemudian diganti ke Mona, lalu LiveScript sebelum akhirnya resmi menyandang nama JavaScript. Versi pertama dari bahasa ini hanya terbatas di kalangan Netscape saja. Fungsionalitas yang ditawarkan pun terbatas. Namun, JavaScript terus dikembangkan oleh komunitas developer yang tak henti-hentinya mengerjakan bahasa pemrograman ini.\n" +
                "\n" +
                "Pada tahun 1996, JavaScript secara resmi disebut sebagai ECMAScript, di mana ECMAScript 2 diluncurkan pada tahun 1998 dan ECMAScript 3 diperkenalkan pada tahun 1999. ECMAScript tersebut dikembangkan hingga akhirnya menjadi JavaScript sebagaimana yang kita kenal saat ini. Tak hanya lintas browser, JavaScript juga bisa digunakan di berbagai perangkat, termasuk perangkat mobile dan komputer.\n" +
                "\n" +
                "Sejak saat itu, JavaScript terus bertumbuh dan berkembang. Pada akhirnya di tahun 2016, sebanyak 92% website diketahui menggunakan JavaScript. Hanya dala kurun waktu dua puluh tahun, JavaScript telah beralih dari bahasa pemrograman yang serba terbatas dan ‘primitif’ menjadi salah satu tool terpenting bagi web developer. Jika sebagian besar waktu dihabiskan untuk berselancar di internet, maka Anda pastinya sudah sangat familiar dengan JavaScript.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.c);
        s.setName("C ++");
        s.setDetail("Bahasa C++ diciptakan oleh Bjarne Stroustrup di AT&T Bell Laboratories awal tahun 1980-an berdasarkan C ANSI (American National Standard Institute). Pertama kali, prototype C++ muncul sebagai C yang dipercanggih dengan fasilitas kelas. Bahasa tersebut disebut C dengan kelas ( C wih class). Selama tahun 1983-1984, C dengan kelas disempurnakan dengan menambahkan fasilitas pembeban lebihan operator dan fungsi yang kemudian melahirkan apa yang disebut C++. Symbol ++ merupakan operator C untuk operasi penaikan, muncul untuk menunjukkan bahwa bahasa baru ini merupakan versi yang lebih canggih dari C. Borland International merilis compiler Borland C++ dan Turbo C++. Kedua compiler ini sama-sama dapat digunakan untuk mengkompilasi kode C++. Bedanya, Borland C++ selain dapat digunakan dibawah lingkungan DOS, juga dapat digunakan untuk pemrograman Windows.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.dart);
        s.setName("Dart");
        s.setDetail("Dart adalah bahasa pemrograman yang dikembangkan oleh Google untuk kebutuhan umum (general-purpose programming language).\n" +
                "\n" +
                "Ia bisa digunakan untuk membuat aplikasi android, front-end web, IoT, backend (CLI), dan Game.\n" +
                "\n" +
                "Contoh beberapa aplikasi yang dibangun dengan Dart:\n" +
                "\n" +
                "1. Google Adsense (front-end)\n" +
                "2. Google AdWords (front-end)\n" +
                "3. Google Fiber (front-end)\n" +
                "4. Hamilton (Android dan iOS)\n" +
                "dll.");
        List_Item.add(s);

        s = new Item();
        s.setPicture(R.drawable.ts);
        s.setName("Typescript");
        s.setDetail("Typescript adalah bahasa pemrograman berbasis JavaScript yang menambahkan fitur strong-typing & konsep pemrograman OOP klasik ( class, interface). Di dalam dokumentasinya, TypeScript disebut sebagai super-set dari JavaScript, artinya semua kode JavaScript adalah kode TypeScript juga. Bahasa pemrograman ini menawarkan class, module, dan interface yang membuat developer bisa mengembangkan aplikasi kompleks dengan lebih mudah. Hal inilah yang membedakannya dengan javascript.\n" +
                "\n" +
                "1. Support Class dan Module\n" +
                "2. Static Type-checking\n" +
                "3. Support ES6 Feature\n" +
                "4. Clear Library API Definition\n" +
                "5. Kesamaan Syntax untuk Backend\n");
        List_Item.add(s);



    }


}
