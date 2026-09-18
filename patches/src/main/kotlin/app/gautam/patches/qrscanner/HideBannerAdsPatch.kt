package app.gautam.patches.qrscanner

import app.gautam.patches.shared.Constants.COMPATIBILITY_QR_SCANNER
import app.morphe.patcher.patch.resourcePatch
import org.w3c.dom.Document
import org.w3c.dom.Element

private val bannerLayouts = listOf(
    "res/layout/activity_home.xml",
    "res/layout/activity_scan_result.xml"
)

@Suppress("unused")
val hideBannerAdsPatch = resourcePatch(
    name = "Hide banner ads",
    description = "Hides and collapses banner ads on the home and scan-result screens.",
    default = true
) {
    compatibleWith(COMPATIBILITY_QR_SCANNER)

    execute {
        bannerLayouts.forEach { layout ->
            document(layout).use { document ->
                val adViews = document.getElementsByTagName(
                    "com.google.android.gms.ads.AdView"
                )

                check(adViews.length > 0) {
                    "No AdMob banner found in $layout"
                }

                for (index in 0 until adViews.length) {
                    val adView = adViews.item(index) as Element
                    adView.setAndroidAttribute(document, "visibility", "gone")
                    adView.setAndroidAttribute(document, "layout_width", "0dp")
                    adView.setAndroidAttribute(document, "layout_height", "0dp")
                }
            }
        }
    }
}

private fun Element.setAndroidAttribute(
    document: Document,
    name: String,
    value: String
) {
    val attribute = document.createAttribute("android:$name")
    attribute.value = value
    attributes.setNamedItem(attribute)
}
