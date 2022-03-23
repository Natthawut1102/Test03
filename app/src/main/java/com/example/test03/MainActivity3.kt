package com.example.test03

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity3 : AppCompatActivity() {
    private var selecedOption:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var message = ""
        opt_1.setOnClickListener{
            message = "ถูกต้อง"
            selectedOptionStyle(opt_1,1)
        }
        opt_2.setOnClickListener{
            message = "ไม่ถูกต้อง"
            selectedOptionStyle(opt_2,2)
        }
        opt_3.setOnClickListener{
            message = "ถูกต้อง"
            selectedOptionStyle(opt_3,3)
        }
        opt_4.setOnClickListener{
            message = "ไม่ถูกต้อง"
            selectedOptionStyle(opt_4,4)
        }
        submit.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra(EXTRA_MESSAGE, message)

            startActivity(intent)
        }
    }
    fun selectedOptionStyle(view: TextView, opt:Int){
        setOptionStyle()
        selecedOption=opt
        view.background= ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt_1)
        optionList.add(1,opt_2)
        optionList.add(2,opt_3)
        optionList.add(3,opt_4)

        for(op in optionList)
        {
            op.setTextColor(Color.parseColor("#555151"))
            op.background=ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }
    }
}