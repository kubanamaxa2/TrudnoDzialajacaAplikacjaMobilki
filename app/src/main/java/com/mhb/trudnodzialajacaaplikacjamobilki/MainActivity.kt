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
        var wartosci = mutableListOf<Int>();
        var wartoscidobre = mutableListOf<Int>();
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
                switche[i].text = ran.toString()
                wartosci[i] = ran
            }
        }
        b2.setOnClickListener{
            for(i in 0..8){
                if(switche[i].isChecked == true){
                    wartoscidobre[i] = wartosci[i];
                    takieO += 1;
                }

            }
            for(i in 0..takieO){
                t1.text = wartoscidobre[i].toString() + " "
            }
        }
    }
}
