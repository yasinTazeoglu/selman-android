package com.java.layoutinflater

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exam.*
import libs.mjn.prettydialog.PrettyDialog
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList


class exam2Activity : AppCompatActivity() {

    val helper=DatabaseHelper(this)
    var employee:Employee?=null
    var list= ArrayList<Employee>()
    var falseList= ArrayList<Employee>()
    var falseListW= ArrayList<String>()
    var falseListR= ArrayList<Int>()
    var RandT:Int?=null
    var Rand=0
    var kontrol=0
    var wordKV=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam)
        this.setFinishOnTouchOutside(false)
        soruI.visibility=View.INVISIBLE
        veritabani()
        getWord()
       late.setOnClickListener {
           wordKV=wordK.text.toString()
           if (wordKV==""){
               toast("lütfen kelimenin karşılığını girin")
           }else{
               when(RandT){
                   1->{
                       if (wordKV==employee?.turkish){
                           list.removeAt(Rand)
                           getWord()
                           }
                       else{
                           again()
                           }
                   }
                   else->{
                       if (wordKV==employee?.english){
                           list.removeAt(Rand)
                           getWord()}
                       else{
                           again()}
                       }
               }
           }
                             }
        show.setOnClickListener {
            when (RandT) {
                1 ->{ wordt.text = employee?.turkish
                }
                else -> {
                    wordt.text = employee?.english
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
                1 -> {word.text = employee?.english
                    wordK.hint="turkcesi"}
                else -> {word.text = employee?.turkish
                    wordK.hint="ingilizcesi"}}
            wordt.setText("")
            wordK.setText("")
            kontrol=0
            soruI.visibility=View.INVISIBLE

        }
        else(alertDialog(falseList))
    }
    fun veritabani(){
        val res=helper.allData
        while (res.moveToNext()){
            list.add(Employee(res.getString(0),res.getString(1),res.getString(2)))
        }
    }
    fun alertDialog(list:List<Employee>){
        if (list.size>0) {
           var pdialog=newD(this,this)
                   pdialog.setIcon(R.drawable.icon).setIconTint(R.color.white).setMessage("${list.size} adet hatanız var hatalarınızı görmek istiyormusunuz?")
                    .addButton("EVET",R.color.pdlg_color_white,R.color.pdlg_color_green,
                            /*onClick*/ {
                        intent(falsewordd(),true)
                        finish()})
                    .addButton("ANASAYFA",R.color.pdlg_color_white,R.color.pdlg_color_red,
                             /*onClick*/ {finish()})
                    .show()

        }else{
                val pdialog= PrettyDialog(this)
                pdialog.setIcon(R.drawable.icon).setIconTint(R.color.white).setMessage("Hiç hatanız yok tekrar oynamak istermisiniz?")
                       .addButton("OK",R.color.pdlg_color_white,R.color.pdlg_color_green,
                        /*onClick*/ {
                        pdialog.dismiss()
                        veritabani()
                        getWord()})
                        .addButton("CANCEL",R.color.pdlg_color_white,R.color.pdlg_color_red,
                        /*onClick*/ {
                        finish()})
                        .show()
                        }
    }
    fun toast(mes:String){
        Toast.makeText(this,"$mes",Toast.LENGTH_LONG).show()
    }
    fun intent( activity: AppCompatActivity,a:Boolean){
            var intent=Intent(this,activity::class.java)
            var k=gonderim(falseList,falseListW,falseListR)
            if (a){
                intent.putExtra("falselistG",k)
            }
            startActivity(intent)
        }
    fun again(){
        if (kontrol==1){
        falseList.add(list[Rand])
        falseListR.add(RandT!!)
        falseListW.add(wordKV)
        list.removeAt(Rand)
        getWord()}
        else{
            soruI.visibility=View.VISIBLE
            object: CountDownTimer(1500,100){
                override fun onFinish() {soruI.visibility=View.INVISIBLE}
                override fun onTick(p0: Long) {}
            }.start()
            wordK.setText("")
            kontrol++
        }
    }

}
data class gonderim(var falseList:ArrayList<Employee>,var falseListW:ArrayList<String>,var falseListR:ArrayList<Int>):Serializable
class newD(context: Context?,var ex: exam2Activity): PrettyDialog(context) {
   override fun dismiss() {

    }
}

