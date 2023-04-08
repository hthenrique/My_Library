package com.example.mylibrary

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.databinding.ActivityMainBinding
import com.example.mylibrary.model.LoginRequest
import com.example.mylibrary.model.LoginResponse

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var loginRequest: LoginRequest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val email = binding.editTextTextPersonName.toString()
        val password = binding.editTextTextPersonPassword.toString()
        loginRequest = LoginRequest(email, password)

        binding.loginButton.setOnClickListener {
            returnLoginResult()
        }
    }

    private fun returnLoginResult(){
        val loginResponse = LoginResponse(
            retCode = 2000,
            message = "Success with:" + loginRequest.email)

        val intent: Intent = Intent()
        intent.putExtra("loginResponse", loginResponse)

        setResult(Activity.RESULT_OK, intent)

        this.finish()
    }
}

