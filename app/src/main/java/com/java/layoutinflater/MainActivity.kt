package com.java.layoutinflater

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import libs.mjn.prettydialog.PrettyDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        exam.setOnClickListener {
            val pdialog= PrettyDialog(this)
            pdialog.setIcon(R.drawable.icon).setIconTint(R.color.white)
                    .addButton("Level 1",R.color.pdlg_color_white,R.color.kahve,
                            /*onClick*/ {
                        val intent=Intent(this,levelOne::class.java)
                        startActivity(intent)
                        pdialog.dismiss()}).addButton("Level 2",R.color.pdlg_color_white,R.color.kahve,
                            /*onClick*/ {
                        val intent=Intent(this,exam2Activity::class.java)
                        startActivity(intent)
                        pdialog.dismiss()}).show()
        }
        insert.setOnClickListener {
            val intent=Intent(this,insert2Activity::class.jav   a)
            startActivity(intent)
        }


    }

    override fun onBackPressed() {
        val pdialog= PrettyDialog(this)
        pdialog.setIcon(R.drawable.wr).setIconTint(R.color.white).setMessage("Çıkmak İstediğine Eminmisin!!!")
                .addButton("EVET",R.color.pdlg_color_white,R.color.pdlg_color_green,
                        /*onClick*/ {super.onBackPressed()})
                .addButton("HAYIR",R.color.pdlg_color_white,R.color.pdlg_color_red,
                        /*onClick*/ {pdialog.dismiss()}).show()
    }

}
