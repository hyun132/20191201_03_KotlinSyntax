package com.tjoeun.a20191201_03_kotlinsyntax.datas

class User {

    var name = ""
    var loginId=""

    override fun equals(other: Any?): Boolean {
        val otherUser = other as User
        return this.name==otherUser.name && this.loginId==otherUser.loginId
    }
}