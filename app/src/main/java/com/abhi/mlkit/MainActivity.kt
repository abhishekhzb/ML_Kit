package com.abhi.mlkit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhi.mlkit.databinding.ActivityMainBinding
import com.abhi.mlkit.view.BarcodeScannerActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.scanQRCodeBtn.setOnClickListener {
            val intent = Intent(this,BarcodeScannerActivity::class.java)
            startActivity(intent)
        }

    }
}