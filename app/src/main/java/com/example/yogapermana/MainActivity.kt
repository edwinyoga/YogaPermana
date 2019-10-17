package com.example.yogapermana

import android.os.Bundle
import android.widget.Toast
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val a = 7
    private val b = 7
    private var lv: ListView? = null
    private var customeAdapter: CustomAdapter? = null
    private var imageModelArrayList: ArrayList<ImageModel>? = null
    private val ListIcon = intArrayOf(R.drawable.soekarno, R.drawable.soeharto, R.drawable.habibie, R.drawable.gusdur, R.drawable.mega, R.drawable.sby, R.drawable.jkw)
    private val ListNama = arrayOf("Dr. Ir. H. Soekarno",
        "Jenderal Besar TNI (Purn.) H. M. Soeharto",
        "Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie, FREng",
        "Dr. K. H. Abdurrahman Wahid",
        "Dr. Hj. Dyah Permata Megawati Setyawati Soekarnoputri",
        "Jenderal TNI (HOR.) (Purn.) Prof. Dr. H. Susilo Bambang Yudhoyono, M.A., GCB., AC",
        "Ir. H. Joko Widodo")
    private val ListKet = arrayOf("Soekarno, nama lahir: Koesno Sosrodihardjo (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967.",
        "Soeharto (lahir di Kemusuk, Yogyakarta, 8 Juni 1921 – meninggal di Jakarta, 27 Januari 2008 pada umur 86 tahun) adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno.",
        "B.J. Habibie (lahir di Parepare, Sulawesi Selatan, 25 Juni 1936 – meninggal di Jakarta, 11 September 2019 pada umur 83 tahun) adalah Presiden Republik Indonesia yang ketiga. Sebelumnya, B.J. Habibie menjabat sebagai Wakil Presiden Republik Indonesia ke-7, menggantikan Try Sutrisno.",
        "Gus Dur (lahir di Jombang, Jawa Timur, 7 September 1940 – meninggal di Jakarta, 30 Desember 2009 pada umur 69 tahun) adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999.",
        "Megawati Soekarnoputri atau biasa disapa dengan panggilan \"Mbak Mega\" (lahir di Yogyakarta, 23 Januari 1947; umur 72 tahun) adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004. Ia merupakan presiden wanita Indonesia pertama dan puteri dari presiden Indonesia pertama.",
        "SBY (lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949; umur 70 tahun) adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu.",
        "Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById(R.id.listview) as ListView

        imageModelArrayList = populateList()
        Log.d("hjhjh", imageModelArrayList!!.size.toString() + "")
        customeAdapter = CustomAdapter(this, imageModelArrayList!!)
        lv!!.adapter = customeAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Anda memilih : ${ListKet[position]}", Toast.LENGTH_SHORT).show()}
    }

    private fun populateList(): ArrayList<ImageModel> {

        val list = ArrayList<ImageModel>()

        for (i in 0..6) {
            val imageModel = ImageModel()
            imageModel.setNamaa(ListNama[i])
            imageModel.setIconn(ListIcon[i])
            list.add(imageModel)
        }

        return list
    }
}