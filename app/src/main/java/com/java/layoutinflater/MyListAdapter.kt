package com.java.layoutinflater

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.falsewordadapter.view.*



/**
 * Created by HP on 18.03.2018.
 */
class MyListAdapter(var mCtx: Context, var resource:Int, var items:List<Employee>): ArrayAdapter<Employee>(mCtx,resource,items){
    internal var helper=DatabaseHelper(mCtx)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View =layoutInflater.inflate(resource,null)
        val myid: TextView =view.findViewById(R.id.myid)
        val firstname: TextView =view.findViewById(R.id.englishText)
        val lastname: TextView =view.findViewById(R.id.turkishText)
        val update: Button =view.findViewById(R.id.updateBtn)
        val employee:Employee=items[position]
        myid.text=employee.id
        firstname.text=employee.english
        lastname.text=employee.turkish

        update.setOnClickListener{
            updateInfo(employee)
        }
        return view
    }
    fun updateInfo(employee: Employee){
        val builder= AlertDialog.Builder(mCtx)
        builder.setTitle("update ınfo")
        val inflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view=inflater.inflate(R.layout.employe_update,null)
        val firstname: EditText =view.findViewById(R.id.englishUpdate)
        val lastname: EditText =view.findViewById(R.id.turkishUpdate)
        firstname.setText(employee.english)
        lastname.setText(employee.turkish)
        builder.setView(view)
        builder.setPositiveButton("Update",DialogInterface.OnClickListener { dialog, which ->
            val isUpdate=helper.updateData(employee.id,firstname.text.toString().trim(),lastname.text.toString().trim())
            if (isUpdate==true){Toast.makeText(mCtx,"UPdated", Toast.LENGTH_LONG).show()
            }else{Toast.makeText(mCtx,"fail update", Toast.LENGTH_LONG).show() }})
        builder.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialog, which ->  })
        val alert=builder.create()
        alert.show()

}}
class falseWord(var context: Context, var gelenWord: List<Employee>, var parent:LinearLayout,var falseListW:List<String>,var RandT:List<Int>){
    fun add(){
     for (i in 0..gelenWord.size-1) {
         var inflater=LayoutInflater.from(context)
         var tekSatir=inflater.inflate(R.layout.falsewordadapter,null)
         var ingWord=tekSatir.ing
         var turkWord=tekSatir.turk
         if (falseListW[i].length>8){ when (RandT[i]) {
             0 -> {
                 ingWord.text =gelenWord[i].english+"(null)"
                 turkWord.text =gelenWord[i].turkish
             }
             1 -> {
                 ingWord.text =gelenWord[i].english
                 turkWord.text =gelenWord[i].turkish+"(null)"
             }
         }}
         else{ when (RandT[i]) {
             0 -> {
                 ingWord.text =gelenWord[i].english+"(${falseListW[i]})"
                 turkWord.text =gelenWord[i].turkish
             }
             1 -> {
                 ingWord.text =gelenWord[i].english
                 turkWord.text =gelenWord[i].turkish+"(${falseListW[i]})"
             }
         }}

            parent.addView(tekSatir)
        }
    }
}