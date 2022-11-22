package com.mhb.trudnodzialajacaaplikacjamobilki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mhb.trudnodzialajacaaplikacjamobilki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var s1 = binding.s1
        var s2 = binding.s2
        var s3 = binding.s3
        var s4 = binding.s4
        var s5 = binding.s5
        var s6 = binding.s6
        var s7 = binding.s7
        var s8 = binding.s8
        var s9 = binding.s9
    }
}
