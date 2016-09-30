package com.cryptomap.common.dagger

import com.cryptomap.common.dagger.modules.AndroidModule
import com.cryptomap.common.dagger.modules.FirebaseModule
import com.cryptomap.home.HomeActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
@Singleton
@Component(modules = arrayOf(AndroidModule::class, FirebaseModule::class))
interface ApplicationComponent {

    fun inject(homeActivity: HomeActivity)
    //    fun inject(splashActivity: SplashActivity)
}
