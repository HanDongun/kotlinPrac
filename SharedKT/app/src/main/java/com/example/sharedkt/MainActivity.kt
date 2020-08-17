package com.example.sharedkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //해당 액티비티가 실행할 때 한번 수행하는 곳(초기화)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: 저장된 데이터를 로드
        loadData()  //edit text 저장되어있던 값을 setText
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        et_hello.setText(pref.getString("name", "")) // 1번째 인자에서는 저장할 키 값을 적어준다., 2번째 인자에는 데이터가 존재하지 않을 경우 대체 값
    }

    private fun saveDate() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit() //수정모드
        edit.putString("name", et_hello.text.toString()) //1 : 키, 2: 데이터
        edit.apply()
    }

    override fun onDestroy() { //액티비티가 종료되는 시점이 다가올 때 호출
        super.onDestroy()

        saveDate() //edit text 값을 저장
    }


}