package com.cryptomap.common.dagger.modules

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.cryptomap.common.dagger.ForApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FirebaseModule() {

    @Provides
    @Singleton
    @ForApplication
    fun provideFirebaseDatabase() = FirebaseDatabase.getInstance()

    @Provides
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()
}
