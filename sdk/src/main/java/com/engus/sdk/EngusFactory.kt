package com.engus.sdk

import android.app.Application

class EngusFactory {
    fun createEngus(application: Application): IEngus {
        return EngusImpl(application)
    }
}