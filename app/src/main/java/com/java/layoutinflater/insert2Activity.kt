package com.java.layoutinflater

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_insert.*

class insert2Activity : AppCompatActivity() {
        internal var helper=DatabaseHelper(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        insert.setOnClickListener{
            helper.insertData(english.text.toString().trim(),turkish.text.toString().trim())
            english.setText("")
            turkish.setText("")

            Toast.makeText(this,"Inserted", Toast.LENGTH_LONG).show()
        }
        updateBTN.setOnClickListener {
            val intent= Intent(this,databaseActivity2::class.java)
            startActivity(intent)
        }
    }
}
