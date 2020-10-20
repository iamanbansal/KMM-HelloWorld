package com.aman.helloworldkmm.shared


import platform.UIKit.UIDevice


actual class Platform {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}