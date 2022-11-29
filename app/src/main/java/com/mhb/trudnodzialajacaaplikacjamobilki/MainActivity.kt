package com.mhb.trudnodzialajacaaplikacjamobilki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import com.mhb.trudnodzialajacaaplikacjamobilki.databinding.ActivityMainBinding
import java.util.Collections.swap
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var takieO = 0

        var wartosci: Array<Int> = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
        var switche: Array<Switch> = arrayOf(
            binding.s1,
            binding.s2,
            binding.s3,
            binding.s4,
            binding.s5,
            binding.s6,
            binding.s7,
            binding.s8,
            binding.s9
        );
        var b1 = binding.button;
        var b2 = binding.button2;
        var t1 = binding.textView;

        fun sort(arr: MutableList<Int>): MutableList<Int> {
            var swappedElements : Boolean
            var level = arr.size - 1
            do {
                swappedElements = false
                for (i in 0..level - 1){
                    if (arr[i] > arr[i + 1]){
                        swap(arr, i, i + 1)
                        swappedElements = true
                    }
                }
                level--
            } while (swappedElements)
            return arr
        }
        b1.setOnClickListener {
            for (i in 0..8) {
                var ran = Random.nextInt(1, 9);
                wartosci[i] = ran
                switche[i].text = ran.toString();
            }
            t1.text = "TextWidze"
            }

        b2.setOnClickListener {
            var wartoscidobre = mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0)
            takieO = 0
            var  zero = 0
            t1.text = ""
            for (i in 0..8) {
                if (switche[i].isChecked == true) {
                    takieO += 1;
                    wartoscidobre[takieO - 1] = wartosci[i];
                }
            }
            for (i in 0..8)
            wartoscidobre.remove(0)
            t1.text = sort(wartoscidobre).toString()

            }
        }
    }

