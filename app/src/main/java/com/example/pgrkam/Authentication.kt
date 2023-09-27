package com.example.pgrkam

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.firebase.auth.FirebaseAuth

class Authentication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        window.statusBarColor = Color.TRANSPARENT

        Handler(Looper.getMainLooper()).postDelayed({
            if(  FirebaseAuth.getInstance().currentUser == null){
                startActivity(Intent(this,SIgnUpActivity::class.java))
                finish()
            }
            else{
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }

        },3000)
    }
}