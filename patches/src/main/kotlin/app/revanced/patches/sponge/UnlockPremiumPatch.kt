package app.revanced.patches.sponge

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.util.returnEarly

@Suppress("unused")
val unlockPremiumPatch = bytecodePatch(
    name = "Unlock Sponge Premium patch",
) {
    compatibleWith("com.prismtree.sponge")

    execute {
        isPremiumUserFingerprint.method.returnEarly(true)
    }
}
