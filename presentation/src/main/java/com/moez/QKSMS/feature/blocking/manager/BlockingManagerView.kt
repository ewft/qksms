package com.moez.QKSMS.feature.blocking.manager

import com.moez.QKSMS.common.base.QkViewContract
import io.reactivex.Observable

interface BlockingManagerView : QkViewContract<BlockingManagerState> {

    fun activityResumed(): Observable<*>
    fun qksmsClicked(): Observable<*>
    fun launchQksmsClicked(): Observable<*>
    fun callControlClicked(): Observable<*>
    fun launchCallControlClicked(): Observable<*>
    fun siaClicked(): Observable<*>
    fun launchSiaClicked(): Observable<*>

    fun openBlockedNumbers()

}
