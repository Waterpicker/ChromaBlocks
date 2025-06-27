import earth.terrarium.cloche.api.metadata.ModMetadata

plugins {
    id("earth.terrarium.cloche") version "0.10.13"
}

repositories {
    cloche.librariesMinecraft()

    mavenCentral()

    cloche {
        main()

        mavenFabric()
        mavenNeoforged()
        mavenNeoforgedMeta()
        mavenForge()
    }
}

version = project.properties["mod_version"] as String
group = project.properties["maven_group"] as String

dependencies {
}

cloche {
    minecraftVersion = properties["minecraft_version"] as String

    mappings {
        official()
    }

    metadata {
        modId = "chromablocks"
        name = "Chroma Blocks"
        version = "2.0.0"
        description = "Abstraction of the mod loader's resource storage system, allowing for easy access to items, fluids and energy. This library also includes abstractions for Data Attachments, Api Lookups, and Transfer Variants and ingredients"
        author("Waterpicker")
        license = "MIT"
        issues = "https://github.com/Waterpicker/ChromaBlocks/issues"
        sources = "https://github.com/Waterpicker/ChromaBlocks"
    }

    forge {
        loaderVersion = properties["forge_version"] as String

        metadata {
            modLoader = "javafml"
            loaderVersion("[35,)")

            dependency {
                modId = "forge"
                required = true
                version("[35,)")
            }
            dependency {
                modId = "minecraft"
                required = true
                version("[1.16.5)")
            }
        }

        dependencies {
        }

        runs {
            server()
            client()
            data()
        }
    }

    fabric {
        metadata {
            entrypoint("main", "org.waterpicker.chromablocks.ChromaBlocksFabric")
            dependency {
                modId = "fabricloader"
                version(">=0.7.4")
            }
            dependency {
                modId = "fabric"
                version("*")
            }
            dependency {
                modId = "minecraft"
                version(">=1.16.4")
            }
        }

        includedClient()

        loaderVersion = properties["fabric_loader_version"] as String

        dependencies {
            modImplementation("net.fabricmc.fabric-api:fabric-api:${properties["fabric_api_version"]}+1.16")
//            fabricApi(properties["fabric_api_version"] as String)

            dependencies {
            }
        }

        runs {
            server()
            client()
            data()
        }
    }
}