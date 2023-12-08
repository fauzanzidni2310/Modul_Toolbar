package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.toolbar.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        iniUI()
    }

    private fun iniUI() {
        binding.customToolbar.back.setOnClickListener {
            Toast.makeText(this, "Back Buttom Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.customToolbar.pengaturan.setOnClickListener {
            Toast.makeText(this, "Setting Buttom Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.customToolbar.notif.setOnClickListener {
            Toast.makeText(this, "Notification Buttom Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.customToolbar.tvtext.text = " Custom Toolbar"
    }
}

