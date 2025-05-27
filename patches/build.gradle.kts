group = "app.scruz"

patches {
    about {
        name = "Scruz Revanced Patches"
        description = "Patches for Revanced by scruz"
        source = "git@github.com:scrazzz/my-revanced-patches.git"
        author = "scrazzz"
        contact = "@scruzism"
        website = "https://revanced.app"
        license = "GNU General Public License v3.0"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }
}