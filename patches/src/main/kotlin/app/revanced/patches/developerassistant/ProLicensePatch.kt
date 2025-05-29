package app.revanced.patches.developerassistant

import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val ProLicensePatch = bytecodePatch(
    name = "Unlock Developer Assistant Pro License patch"
) {
    compatibleWith("com.appsisle.developerassistant"("1.2.2"))

    // v0 => LicenseStatus
    // v1 => License.f14360r => License("Permanent", 0, functionality, Validity.Permanent);
    // return new LicenseStatus(License.f14360r, null, null, false);
    execute {
        licenseManagerFingerprint.method.replaceInstructions(
            0,
            """
                new-instance v0, Ls6/l;
                sget-object v1, Ls6/b;->r:Ls6/b;
                const/4 v2, 0x0
                const/4 v3, 0x0
                invoke-direct {v0, v1, v2, v3, v2}, Ls6/l;-><init>(Ls6/b;Ljava/util/Date;Ljava/lang/Integer;Z)V
                return-object v0
            """.trimIndent()
        )
    }
}
