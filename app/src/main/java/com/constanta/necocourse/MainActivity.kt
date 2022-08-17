package com.constanta.necocourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.constanta.necocourse.databinding.ActivityMainBinding
import kotlin.math.sqrt
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.sum.setOnClickListener{
            var a = binding.edit1.text.toString()
            var b = binding.edit2.text.toString()
            var result = (a.toInt() + b.toInt()).toString()
          binding.result.text = "$result"
        }

        binding.del.setOnClickListener{
            var a = binding.edit1.text.toString()
            var b = binding.edit2.text.toString()
            var result = (a.toInt() / b.toInt()).toString()
            binding.result.text = "$result"
        }

        binding.min.setOnClickListener{
            var a = binding.edit1.text.toString()
            var b = binding.edit2.text.toString()
            var result = (a.toInt() - b.toInt()).toString()
            binding.result.text = "$result"
        }
        binding.um.setOnClickListener{
            var a = binding.edit1.text.toString()
            var b = binding.edit2.text.toString()
            var result = (a.toInt() * b.toInt()).toString()
            binding.result.text = "$result"
        }

        binding.sqrt.setOnClickListener{
            var a = binding.edit1.text.toString()
            var b = binding.edit2.text.toString()
            var result = (sqrt(a.toDouble())).toString()
            binding.result.text = "$result"
        }

        binding.step.setOnClickListener{
            var a = binding.edit1.text.toString().toDouble()
            var b = binding.edit2.text.toString().toInt()
            var result = (a.pow(b))
            binding.result.text = "$result"
        }
    }

}