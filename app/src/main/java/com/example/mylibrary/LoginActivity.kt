package com.example.mylibrary

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.databinding.ActivityMainBinding
import com.example.mylibrary.model.LoginResponse

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)



    }

    private fun returnLoginResult(){
        val loginResponse = LoginResponse(
            retCode = 2000,
            message = "Success")

        val intent: Intent = Intent()
        intent.putExtra("loginResponse", loginResponse)

        setResult(Activity.RESULT_OK, intent)

        finish()
    }
}

