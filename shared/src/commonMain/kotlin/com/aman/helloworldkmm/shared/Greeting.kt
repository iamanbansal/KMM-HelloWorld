package com.aman.helloworldkmm.shared


class Greeting {
    fun greeting(): String {
        return "Hello Word, ${Platform().platform}!"
    }
}
