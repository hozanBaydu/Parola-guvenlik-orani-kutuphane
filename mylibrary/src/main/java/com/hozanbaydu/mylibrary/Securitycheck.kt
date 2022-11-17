package com.hozanbaydu.mylibrary

import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.widget.EditText
import android.widget.TextView

class Securitycheck {
    var runnable:Runnable=Runnable{}
    var handler: Handler = Handler(Looper.getMainLooper())

    fun checkPassword(editText: EditText, textView: TextView){
        runnable=object :Runnable{
            override fun run() {

                var checkInt=false
                var length=editText.text.length
                var i=0

                while (i<length){
                    var aaa=editText.text[i].digitToIntOrNull()
                    if (aaa!=null){
                        checkInt=true
                    }
                    i++
                }
                println(checkInt)
                if (length==0){
                    textView.text="Security= % 0"
                    textView.setTextColor(Color.RED)

                }
                else if (length<3){

                    if (checkInt){
                        textView.text="Security= % 20"
                        textView.setTextColor(Color.YELLOW)
                    }else{
                        textView.text="Security= % 15"
                        textView.setTextColor(Color.YELLOW)
                    }
                }
                else if (length<7){

                    if (checkInt){
                        textView.text="Security= % 40"
                        textView.setTextColor(Color.BLUE)
                    }else{
                        textView.text="Security= % 35"
                        textView.setTextColor(Color.BLUE)
                    }
                }
                else if (length<11){

                    if (checkInt){
                        textView.text="Security= % 65"
                        textView.setTextColor(Color.CYAN)
                    }else{
                        textView.text="Security= % 60"
                        textView.setTextColor(Color.CYAN)
                    }
                }
                else{
                    if (checkInt){
                        textView.text="Security= % 100"
                        textView.setTextColor(Color.GREEN)
                    }else{
                        textView.text="Security= % 90"
                        textView.setTextColor(Color.GREEN)
                    }
                }
                handler.postDelayed(this,500)
            }
        }
        handler.post(runnable)
    }
    fun stop(){
        handler.removeCallbacks(runnable)
    }
}