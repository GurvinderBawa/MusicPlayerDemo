package com.bawa.musicplayerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var songUrl = "https://file-examples-com.github.io/uploads/2017/11/file_example_MP3_700KB.mp3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}