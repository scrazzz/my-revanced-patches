package app.revanced.patches.azscreenrecorder

import app.revanced.patcher.fingerprint
import app.revanced.util.containsLiteralInstruction
import app.revanced.util.getReference
import app.revanced.util.indexOfFirstInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

// ty nuckyz
internal val prefBoughtProductsFingerprint = fingerprint {
    returns("Z")
    custom { method, _ -> method.containsLiteralInstruction(0x7f140309) &&
            method.indexOfFirstInstruction {
                getReference<MethodReference>()?.name == "size"
            } >= 0
    }
}