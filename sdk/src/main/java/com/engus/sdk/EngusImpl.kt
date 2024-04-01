package com.engus.sdk

import android.app.Application

class EngusImpl(app: Application) : IEngus {
    init {
        EngusApp.create(app)
    }

    override fun changeLanguage(language: String?) {
    }
}