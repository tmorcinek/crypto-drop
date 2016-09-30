package com.cryptomap.common.utils

import android.app.Activity
import android.support.v4.app.Fragment
import com.cryptomap.Application
import com.cryptomap.common.dagger.ApplicationComponent

/**
 * Copyright 2016 Tomasz Morcinek. All rights reserved.
 */

val Activity.component: ApplicationComponent
    get() = (application as Application).component

val Fragment.component: ApplicationComponent
    get() = (activity.application as Application).component

