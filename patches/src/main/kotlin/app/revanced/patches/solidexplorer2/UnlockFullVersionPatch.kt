package app.revanced.patches.solidexplorer2

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.util.returnEarly

@Suppress("unused")
val UnlockFullVersionPatch = bytecodePatch(
    name = "Unlock full version patch",
    description = "Unlock Solid Explorer full version + remove ads."
) {
    compatibleWith("pl.solidexplorer2")

    execute {
        checkLicenceOnBackendFingerprint.method.returnEarly(true)
    }
}
