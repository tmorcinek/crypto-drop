package com.cryptomap

import android.app.Application
import com.cryptomap.common.dagger.ApplicationComponent
import com.cryptomap.common.dagger.DaggerApplicationComponent
import com.cryptomap.common.dagger.modules.AndroidModule
import com.cryptomap.common.dagger.modules.FirebaseModule


/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
class Application : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = createApplicationComponent()
    }

    private fun createApplicationComponent() = DaggerApplicationComponent.builder()
            .androidModule(AndroidModule(this))
            .firebaseModule(FirebaseModule())
            .build()

    override fun onTerminate() {
        super.onTerminate()
    }
}