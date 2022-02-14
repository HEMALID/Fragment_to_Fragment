package com.example.fragment_to_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() ,Communicator{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val FragmentOne = FragmentOne()
        supportFragmentManager.beginTransaction().replace(R.id.framelayout ,FragmentOne)
            .commit()
    }

    override fun passData(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("inputText",editTextData)
        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentTwo = FragmentTwo()
        fragmentTwo.arguments = bundle
        transaction.replace(R.id.framelayout, fragmentTwo)
        transaction.commit()
    }
}