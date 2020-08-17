package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "DJH", "28", "안녕하세요"),
        User(R.drawable.android, "KEJ", "23", "배고파"),
        User(R.drawable.android, "KPJ", "24", "하이"),
        User(R.drawable.android, "DJV", "29", "안녕"),
        User(R.drawable.android, "DVN", "30", "좋아"),
        User(R.drawable.android, "QIW", "32", "더워요"),
        User(R.drawable.android, "ZND", "33", "즐겁습니다")
    )

    override fun onCreate(savedInstanceState: Bundle?) { //액티비티 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과", "배", "딸기", "키위", "홍드로이드")
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
//
        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }
    }

}