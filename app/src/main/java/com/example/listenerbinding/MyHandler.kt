package com.example.listenerbinding

import android.content.ContentValues.TAG
import android.content.Context
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MyHandler {

    lateinit var context: Context

    //var itemModel=ObservableField<Item>()

    fun onClick() {
        Log.i(TAG, "onClick")
        Toast.makeText(context,"WOrked",Toast.LENGTH_LONG)
    }

}