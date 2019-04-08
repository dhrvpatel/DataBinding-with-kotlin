package com.example.listenerbinding

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.databinding.PropertyChangeRegistry
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.listenerbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
   lateinit var mainBinding: ActivityMainBinding
    private val person = Person()
    private val handler = MyHandler()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.person = person
        mainBinding.handler = handler
        mainBinding.mainActivity = this
    }

    fun onButtonClick(view: View){
        person.firstName = "John"
        person.lastName = "Doe"
    }
}


class Person: BaseObservable(){

    private val propertyChangeRegistry = PropertyChangeRegistry()
    var firstName: String = ""
        @Bindable get
    set(value) {
        field = value
        notifyPropertyChanged(BR.firstName)
    }

    var lastName: String = ""
        @Bindable get
        set(value) {
            field = value
           notifyPropertyChanged(BR.lastName)
        }
}

