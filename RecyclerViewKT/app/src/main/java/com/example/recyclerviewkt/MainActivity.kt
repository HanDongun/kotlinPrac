package com.example.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val profileList = arrayListOf(
            Profiles(R.drawable.man, "HDJ", 28, "개발자"),
            Profiles(R.drawable.woman, "KEJ", 23, "마케터"),
            Profiles(R.drawable.man, "HDE", 21, "개발"),
            Profiles(R.drawable.woman, "BDJ", 20, "발자"),
            Profiles(R.drawable.man, "HDZ", 20, "개발자"),
            Profiles(R.drawable.woman, "QDJ", 25, "선수"),
            Profiles(R.drawable.man, "HE", 30, "집"),
            Profiles(R.drawable.woman, "ACB", 32, "자영업"),
            Profiles(R.drawable.man, "QDV", 50, "교슈"),
            Profiles(R.drawable.woman, "MKJ", 12, "학생"),
            Profiles(R.drawable.man, "OPJ", 16, "발")
        )
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)
    }
}