package com.cryptomap.common.dagger.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.cryptomap.common.dagger.ForApplication
import com.cryptomap.common.helpers.PreferencesHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
@Module
class AndroidModule(private val application: Application) {

    @Provides
    @Singleton
    @ForApplication
    fun provideApplicationContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideSharedPreferences(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    @Singleton
    fun providePreferencesHelper(sharedPreferences: SharedPreferences): PreferencesHelper {
        return PreferencesHelper(sharedPreferences)
    }
}