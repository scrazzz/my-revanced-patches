package app.revanced.patches.scrl

import app.revanced.patcher.fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal val getPremiumStatusFingerprint = fingerprint {
    returns("Z")
    accessFlags(AccessFlags.PUBLIC, AccessFlags.FINAL)
    parameters("Landroid/content/Context;")
    strings(
        "context",
        "MyPreferences",
        "getSharedPreferences(...)",
        "premium"
    )
}
