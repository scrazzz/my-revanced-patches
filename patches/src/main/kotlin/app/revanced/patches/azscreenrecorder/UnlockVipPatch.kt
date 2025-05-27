package app.revanced.patches.azscreenrecorder

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.util.returnEarly

@Suppress("unused")
val unlockVipPatch = bytecodePatch(
    name = "Unlock Pro Option",
    description = "Unlocks the option labelled as 'Pro'",
) {
    compatibleWith("com.hecorat.screenrecorder.free"("6.4.3"))

    execute {
        prefBoughtProductsFingerprint.method.returnEarly(true)
    }
}