package com.bawa.musicplayerdemo

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicService : Service() {

    override fun onCreate() {
        super.onCreate()
        val mediaPlayer = MediaPlayer.create(this, R.raw.sound)
        mediaPlayer.start()
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}