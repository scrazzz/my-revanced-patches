package app.revanced.patches.scrl

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.util.returnEarly

@Suppress("unused")
val unlockPremiumPatch = bytecodePatch(
    name = "Unlock SCRL Premium patch"
) {
    compatibleWith("com.appostrophe.scrl")

    execute {
        // There will be a pop-up shown to upgrade when the app opens for the first time,
        // simply ignore that by pressing (X) on top right corner
        getPremiumStatusFingerprint.method.returnEarly(true)
    }
}
