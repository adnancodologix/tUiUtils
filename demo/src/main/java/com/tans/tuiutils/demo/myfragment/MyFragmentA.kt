package com.tans.tuiutils.demo.myfragment

import android.view.View
import com.tans.tuiutils.demo.R
import com.tans.tuiutils.fragment.BaseCoroutineStateFragment
import kotlinx.coroutines.CoroutineScope

class MyFragmentA : BaseCoroutineStateFragment<Unit>(Unit) {

    override val layoutId: Int = R.layout.fragment_my_fragment_a

    override fun CoroutineScope.firstLaunchInitDataCoroutine() {

    }

    override fun CoroutineScope.bindContentViewCoroutine(contentView: View) {

    }

}