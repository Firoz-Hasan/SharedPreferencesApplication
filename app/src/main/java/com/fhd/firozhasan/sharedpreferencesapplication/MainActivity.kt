package com.fhd.firozhasan.sharedpreferencesapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var userSession : UserSession
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userSession = UserSession(applicationContext)
        loadData()

        apply_text_button.setOnClickListener {
            textview.text = edittext.text
        }
        save_button.setOnClickListener {
            userSession.saveData(edittext.text.toString(), switch1.isChecked)

        }

    }

    private fun loadData() {
        textview.setText(userSession.loadTextData)
        switch1.setChecked(userSession.isSwitchedOn!!)
    }
}
