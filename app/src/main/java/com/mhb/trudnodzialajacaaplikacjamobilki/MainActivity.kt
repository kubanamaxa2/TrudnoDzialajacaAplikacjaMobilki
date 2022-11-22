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
            for(i in 0 ..9){
                Random.nextInt(1,9)

            }
        }
    }
}
