# DataBinding-with-kotlin
Data Binding with Observable

Step 1:
include this line in android build gradle:
dataBinding.enabled = "true"

step 2:
Create Class MyHandler, Person

add this to XML file:
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools"
        tools:context=".MainActivity">

      <data>
          <variable name="handler" type="com.example.listenerbinding.MyHandler"/>
          <variable name="person" type="com.example.listenerbinding.Person"/>
          <variable name="mainActivity" type="com.example.listenerbinding.MainActivity"/>
      </data>

</layout>

Step 3:
ReBuild Project then work with DataBinding concepts
