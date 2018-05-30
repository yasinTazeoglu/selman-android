package com.java.layoutinflater

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_falsewordd.*
import libs.mjn.prettydialog.PrettyDialog

class falsewordd : AppCompatActivity() {
    lateinit var view: View
    lateinit var inflater:LayoutInflater
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_falsewordd)
        var falseListG=intent.extras.get("falselistG") as gonderim
        var falseList=falseListG.falseList
        var falseListW=falseListG.falseListW
        var falseListR=falseListG.falseListR
        var ekle=falseWord(this,falseList,eklenecekLayout,falseListW,falseListR)
        ekle.add()
        cancelBtn.setOnClickListener {finish()}
        restartBtn.setOnClickListener {
            val pdialog= PrettyDialog(this)
            pdialog.setIcon(R.drawable.icon).setIconTint(R.color.white)
                    .addButton("Level 1",R.color.pdlg_color_white,R.color.kahve,
                            /*onClick*/ {
                        val intent=Intent(this,levelOne::class.java)
                        startActivity(intent)
                        finish()}).addButton("Level 2",R.color.pdlg_color_white,R.color.kahve,
                            /*onClick*/ {
                        val intent=Intent(this,exam2Activity::class.java)
                        startActivity(intent)
                        finish()}).show()}
    }
}
