package com.elygium.bundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elygium.bundleextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener {
            val numero = binding.editNumero.text.toString().trim().toInt()

            val i= Intent(this, MainActivity2::class.java)
            i.putExtra("numero1", numero)
            startActivity(i)
        }
    }
}