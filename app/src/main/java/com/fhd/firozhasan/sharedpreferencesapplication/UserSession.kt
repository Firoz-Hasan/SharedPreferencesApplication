package com.fhd.firozhasan.sharedpreferencesapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

/*
* Shared preferences allow you to read and write small amounts
* of primitive data (as key/value pairs) to a file on the device storage
*
* */

class UserSession(val context: Context) {
    private var pref: SharedPreferences? = null

    init {
        pref = context.getSharedPreferences("sharedPrefs", 0)

    }

    fun saveData(dataText : String, switch : Boolean) {
        pref?.edit {
            putString("dataValue", dataText)
            putBoolean("switchValue", switch)
        }
        pref?.edit()?.apply()

    }

    val loadTextData = pref?.getString("dataValue", null)
    val isSwitchedOn = pref?.getBoolean("switchValue", false)
}