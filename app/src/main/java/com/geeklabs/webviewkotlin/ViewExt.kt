package com.geeklabs.webviewkotlin

import android.os.Handler

fun withDelay(delayInMillis: Long, block: () -> Unit) {
    Handler().postDelayed(Runnable(block), delayInMillis)
}