package com.toyibnurseha.pbl.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.toyibnurseha.pbl.databinding.ActivityRegisterBinding
import com.toyibnurseha.pbl.ui.login.LoginActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnAccount.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}