package com.java.layoutinflater

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by HP on 18.03.2018.
 */

class DatabaseHelper(context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,1) {

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME)
    }
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table $TABLE_NAME (ID INTEGER PRIMARY KEY AUTOINCREMENT,english TEXT,turkish TEXT)")
    }
    fun insertData(firstname:String,lastname:String){
        val db=this.writableDatabase
        val contentValues= ContentValues()
        contentValues.put(COL_2,firstname)
        contentValues.put(COL_3,lastname)
        db.insert(TABLE_NAME,null,contentValues)
    }
    val allData: Cursor
        get(){
            val db=this.writableDatabase
            val res=db.rawQuery("select * from $TABLE_NAME",null)
            return res
        }
    fun updateData(id:String,firstname:String,lastname:String):Boolean{

        val db=this.writableDatabase
        val contentValues= ContentValues()
        contentValues.put(COL_1,id)
        contentValues.put(COL_2,firstname)
        contentValues.put(COL_3,lastname)
        db.update(TABLE_NAME,contentValues,"ID= ?", arrayOf(id))
        return true
    }

    fun deleteData(id:String): Int {
        val db=this.writableDatabase
        return db.delete(TABLE_NAME,"ID=?", arrayOf(id))
    }

    companion object {
        val DATABASE_NAME="Word.db"
        val TABLE_NAME="ET"
        val COL_1="ID"
        val COL_2="english"
        val COL_3="turkish"
    }
}