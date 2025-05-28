package app.revanced.patches.developerassistant

import app.revanced.patcher.fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal val licenseManagerFingerprint = fingerprint {
    returns("Ls6/l;")
    accessFlags(AccessFlags.STATIC)
    parameters("Ljava/util/List;")
}