package com.herasymchuk.p0081_viewbuild

import android.view.MenuItem

private fun printMenuInfo(item: MenuItem) {
    val sb = """Item Menu
 groupId: ${item.groupId}
 itemId: ${item.itemId}
 order: ${item.order}
 title: ${item.title}"""
    textView.setText(sb)
}