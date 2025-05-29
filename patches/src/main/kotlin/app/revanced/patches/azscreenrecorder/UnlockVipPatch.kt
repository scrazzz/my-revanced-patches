package app.revanced.patches.azscreenrecorder

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.util.returnEarly

@Suppress("unused")
val unlockVipPatch = bytecodePatch(
    name = "Unlock AZ Screen Recorder VIP patch",
    description = "Unlocks the option labelled as 'Pro' in AZ Screen Recorder",
) {
    compatibleWith("com.hecorat.screenrecorder.free"("6.4.3"))

    execute {
        prefBoughtProductsFingerprint.method.returnEarly(true)
    }
}
