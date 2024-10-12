architectury {
    forge()
}

loom {
    forge {
        mixinConfig( "ad_extendra-common.mixins.json")
        mixinConfig( "ad_extendra.mixins.json")
    }

    runs {
        create("data") {
            data()
            programArgs("--all", "--mod", "ad_extendra")
            programArgs("--output", project(":common").file("src/main/generated/resources").absolutePath)
            programArgs("--existing", project(":common").file("src/main/resources").absolutePath)
        }
    }
}

val common: Configuration by configurations.creating {
    configurations.compileClasspath.get().extendsFrom(this)
    configurations.runtimeClasspath.get().extendsFrom(this)
    configurations["developmentForge"].extendsFrom(this)
}

dependencies {
    common(project(":common", configuration = "namedElements")) { isTransitive = false }
    shadowCommon(project(path = ":common", configuration = "transformProductionForge")) { isTransitive = false }

    val minecraftVersion: String by project
    val mixinExtrasVersion: String by project
    val forgeVersion: String by project
    val jeiVersion: String by project
    val adAstraForgeId: String by project

    forge(group = "net.minecraftforge", name = "forge", version = "$minecraftVersion-$forgeVersion")

    modLocalRuntime(group = "mezz.jei", name = "jei-$minecraftVersion-forge", version = jeiVersion) { isTransitive = false }

    // From modrinth maven to avoid annoying crashes from flywheel
    modLocalRuntime(group = "maven.modrinth", name = "ad-astra", version = adAstraForgeId)

    forgeRuntimeLibrary("com.teamresourceful:yabn:1.0.3")
    forgeRuntimeLibrary("com.teamresourceful:bytecodecs:1.0.2")

    "annotationProcessor"(group = "io.github.llamalad7", name = "mixinextras-forge", version = mixinExtrasVersion).apply {
        implementation(this)
        "include"(this)
    }
}