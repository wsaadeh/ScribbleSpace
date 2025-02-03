package com.saadeh.scribblespace

import android.app.Application
import androidx.room.Room
import com.saadeh.scribblespace.common.local.ScribbleSpaceDataBase

class ScribbleSpaceApplication : Application() {

    val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            ScribbleSpaceDataBase::class.java, "database-scribble-space-app"
        ).build()
    }

}