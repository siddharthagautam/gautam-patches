package app.gautam.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_QR_SCANNER = Compatibility(
        name = "QR Scanner",
        packageName = "github.w3apps.com.qrcode",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x5C6BC0,
        targets = listOf(
            AppTarget(version = "1.0")
        )
    )
}
