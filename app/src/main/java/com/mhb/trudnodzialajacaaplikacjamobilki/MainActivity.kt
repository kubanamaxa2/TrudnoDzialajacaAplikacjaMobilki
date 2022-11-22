package com.mhb.trudnodzialajacaaplikacjamobilki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import com.mhb.trudnodzialajacaaplikacjamobilki.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var takieO = 0
        var wartoscidobre = mutableListOf<Int>(0,0,0,0,0,0,0,0,0)
        var wartosci: Array<Int> = arrayOf(0,0,0,0,0,0,0,0,0)
        var switche: Array<Switch> = arrayOf(
        binding.s1,
        binding.s2,
        binding.s3,
        binding.s4,
        binding.s5,
        binding.s6,
        binding.s7,
        binding.s8,
        binding.s9);
        var b1 = binding.button;
        var b2 = binding.button2 ;
        var t1 = binding.textView;

        b1.setOnClickListener{
            for(i in 0 ..8){
             var ran = Random.nextInt(1,9);
                wartosci[i] = ran
                switche[i].text = ran.toString();
            }
            t1.text = "TextWidze"
            for(i in 0..8) {
                wartoscidobre[i] = 0
            }
        }
        b2.setOnClickListener{
            takieO = 0
            for(i in 0..8) {
                if (switche[i].isChecked == true) {
                    takieO += 1;
                    wartoscidobre[takieO-1] = wartosci[i];
                }


            }
            for(i in 0..8){
                if(wartoscidobre[i] == 0){
                    //wartoscidobre.removeAt(i)
                }
            }
            t1.text=""
            for(i in 0..8){
                t1.text = t1.text.toString() + wartoscidobre[i].toString() + ", "}/*
            for(i in 0..takieO-1){
                t1.text = t1.text.toString() + wartoscidobre[i].toString() + ", "
            }*/
        }
    }
}
