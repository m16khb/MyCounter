package kr.ac.kumoh.s20150377.mycounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textNum.text = "0"
        var i = 0
        buttonAdd.setOnClickListener{
            i += 1
            textNum.text = i.toString()
        }
        buttonSub.setOnClickListener{
            i -= 1
            textNum.text = i.toString()
        }
    }
}
