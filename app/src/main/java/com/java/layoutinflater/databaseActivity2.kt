package com.java.layoutinflater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_database3.*

class databaseActivity2 : AppCompatActivity() {
    internal var helper=DatabaseHelper(this)
    var list= mutableListOf<Employee>()
    lateinit var adapter:MyListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database3)
        viewAll()
        adapter=MyListAdapter(this,R.layout.employe,list)
        dataBaseItem.adapter=adapter
        refresh.setOnClickListener{
            refresh()
        }
    }
    fun viewAll(){
        list.clear()
        val res=helper.allData
        if (res.count==0){
            Toast.makeText(this,"No records:(", Toast.LENGTH_LONG).show()
        }
        while (res.moveToNext()){
            list.add(Employee(res.getString(0),res.getString(1),res.getString(2)))
        }
    }
    fun refresh(){
        Toast.makeText(this,"refreshing",Toast.LENGTH_SHORT).show()
        viewAll()
        adapter.notifyDataSetChanged()
    }
}
