package com.tjoeun.a20191201_03_kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.a20191201_03_kotlinsyntax.datas.User

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



        val userList=ArrayList<User>()

        val user1=User()
        user1.name="조경진"
        user1.loginId="ch"

        userList.add(user1)

        val user2=User()
        user2.name="계석준"
        user2.loginId="student1"

        userList.add(user2)

        Log.d("들어있는 사람 수 ", "${userList.size} 명")
        Log.d("1번칸에 들어있는 사람 이름", "${userList.get(1).name}")

        val user3 = User()
        user3.name="조경진"
        user3.loginId="ch"

        Log.d("조경진이 있는 위치 ", "${userList.indexOf(user3)}")
        userList.remove(user3)
        Log.d("들어있는 사람 수","${userList.size} 명" )
    }
}
