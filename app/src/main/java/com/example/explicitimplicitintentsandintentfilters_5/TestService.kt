package com.example.explicitimplicitintentsandintentfilters_5

import android.app.IntentService
import android.content.Intent
import android.util.Log

internal class TestService: IntentService("testService") {

    override fun onHandleIntent(p0: Intent?) {
        Log.i("Tag", "TestService : onHandleIntent - Service successfully launched ")
    }
}