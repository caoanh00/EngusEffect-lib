package com.engus.sdk

import android.app.Application

class EngusApp (application: Application?): Application(){
    private val application: Application? = null

    companion object {
        private var instance: EngusApp? = null

        fun getInstance(): EngusApp? {
            return instance
        }

        fun create(application: Application) {
            instance = EngusApp(application)
        }
    }
}