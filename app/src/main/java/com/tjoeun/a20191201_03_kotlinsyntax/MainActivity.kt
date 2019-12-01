package com.tjoeun.a20191201_03_kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr = ArrayList<Int>()

        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(0,15)
        lottoNumArr.add(17)


        Log.d("로또번호 입력한 갯수", "${lottoNumArr.size} 개 입력됨")

        lottoNumArr.removeAt(0)

        Log.d("42는 몇번 칸에?" ,"${lottoNumArr.indexOf(42)} 칸에 있음")

        Log.d("1번칸에는 뭐가 들어있나?","${lottoNumArr.get(1)}")

//        42를 배열에서 빼내고싶다.
        lottoNumArr.remove(42)
    }
}
