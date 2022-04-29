package com.example.socialfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.socialfragments.databinding.ActivityMainBinding
import com.example.socialfragments.socialfragments.SocialLoginFragments

class MainActivity : AppCompatActivity() {
    private lateinit var socialLoginFragments: SocialLoginFragments

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)

        initUI()



    }

    private fun initUI() {
mt("FragmentCalled")
 /*     socialLoginFragments=supportFragmentManager.findFragmentById(
          R.id.socialLognFragment
      ) as SocialLoginFragments*/
        mt("Fragment")
    }
    private fun mt(text:String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
}