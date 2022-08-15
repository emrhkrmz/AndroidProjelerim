package com.emrahkirmizi.easymath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var myButton1: Button
    private lateinit var myButton2: Button
    private lateinit var myButton3: Button
    private lateinit var myButton4: Button
    private lateinit var myButton5: Button
    private lateinit var myTextView1: TextView
    private lateinit var myTextView2: TextView
    private lateinit var myTextViewSonuc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton1 = findViewById(R.id.button1)
        myButton2 = findViewById(R.id.button2)
        myButton3 = findViewById(R.id.button3)
        myButton4 = findViewById(R.id.button4)
        myButton5 = findViewById(R.id.button5)
        myTextView1 = findViewById(R.id.textView1)
        myTextView2 = findViewById(R.id.textView2)
        myTextViewSonuc = findViewById(R.id.textViewSonuc)


    }

    fun buttonPressed(view: View) {
        val myRandomInt1 = Random.nextInt(1, 10)
        val myRandomInt2 = Random.nextInt(1, 10)
        val myRandomYanlisSonuc1 = Random.nextInt(1, 100)
        val myRandomYanlisSonuc2 = Random.nextInt(1, 100)
        val myRandomYanlisSonuc3 = Random.nextInt(1, 100)

        val dogruSonuc = myRandomInt1 * myRandomInt2


        if (myRandomInt1 > myRandomInt2) {
            myTextView1.text = "$myRandomInt1 * $myRandomInt2"
            myButton2.text = "$dogruSonuc"
            myButton3.text = "$myRandomYanlisSonuc1"
            myButton4.text = "$myRandomYanlisSonuc2"
            myButton5.text = "$myRandomYanlisSonuc3"


            myButton2.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton3.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton4.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton5.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }

        } else if (myRandomInt1 < myRandomInt2) {
            myTextView1.text = "$myRandomInt1 * $myRandomInt2"
            myButton2.text = "$myRandomYanlisSonuc1"
            myButton3.text = "$dogruSonuc"
            myButton4.text = "$myRandomYanlisSonuc2"
            myButton5.text = "$myRandomYanlisSonuc3"

            myButton2.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton3.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton4.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton5.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }

        } else if (myRandomInt1 > myRandomInt2) {
            myTextView1.text = "$myRandomInt1 * $myRandomInt2"
            myButton2.text = "$myRandomYanlisSonuc1"
            myButton3.text = "$myRandomYanlisSonuc2"
            myButton4.text = "$dogruSonuc"
            myButton5.text = "$myRandomYanlisSonuc3"

            myButton2.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton3.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton4.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton5.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }

        } else {
            myTextView1.text = "$myRandomInt1 * $myRandomInt2"
            myButton2.text = "$myRandomYanlisSonuc1"
            myButton3.text = "$myRandomYanlisSonuc2"
            myButton4.text = "$myRandomYanlisSonuc3"
            myButton5.text = "$dogruSonuc"

            myButton2.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton3.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton4.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }
            myButton5.setOnClickListener {
                myTextViewSonuc.text = "dogru sonuc = $dogruSonuc"
            }

        }


    }


}