package com.java.layoutinflater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_level_one.*
import java.util.*

class levelOne : AppCompatActivity() {
    val helper=DatabaseHelper(this)
    var list= ArrayList<Employee>()
    var RandT:Int?=null
    var kontrol=0
    var Rand=0
    var employee:Employee?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_one)
        veritabani()
        getWord()
        lateL.setOnClickListener {
            getWord()
        }
        showL.setOnClickListener {
            when (RandT) {
                1 ->{ wordtL.text = employee?.turkish
                }
                else -> {
                    wordtL.text = employee?.english
                }
            }
        }
    }
    fun getWord(){
        if (list.size!=0) {
            Rand = Random().nextInt(list.size)
            RandT = Random().nextInt(2)
            employee = list[Rand]
            when (RandT) {
                1 -> {wordL.text = employee?.english}
                0 -> {wordL.text = employee?.turkish}}
            wordtL.setText("")
            list.removeAt(Rand)

        }
        else{kontrol++
            toast("kelimeleri $kontrol kez tekrar ettiniz")
             veritabani()
        getWord()}
    }
    fun veritabani(){
        val res=helper.allData
        while (res.moveToNext()){
            list.add(Employee(res.getString(0),res.getString(1),res.getString(2)))
        }
    }
    fun toast(mes:String){
        Toast.makeText(this,"$mes", Toast.LENGTH_LONG).show()
    }


}

