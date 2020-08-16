package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener{
            // var : 변수
            // val : 자바에서는 final 값이 변경되지 못하는 변수
            val intent = Intent(this, SubActivity::class.java) //다음 화면으로 이동하기 위한 객체 생성
            intent.putExtra("msg", tv_sendMsg.text.toString()) // HelloWorld 텍스트 전달
            startActivity(intent)
            finish() //자기 자신 액티비티를 파괴한다.
        }


    }
}