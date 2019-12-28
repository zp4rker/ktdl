package com.zp4rker.ktdl

import com.zp4rker.bukkitutils.KotlinRuntime
import com.zp4rker.bukkitutils.Libraries
import org.bukkit.plugin.java.JavaPlugin

class KTDL : JavaPlugin() {

    override fun onLoad() {
        if (!KotlinRuntime.loaded()) {
            logger.info("Kotlin runtime not found! Fetching Kotlin libraries...")

            val files = KotlinRuntime.loadLibraries("1.3.61")
            logger.info("Successfully found or downloaded Kotlin libraries!")

            logger.info("Loading Kotlin runtime...")
            Libraries.addLibraries(*files)

            logger.info("Successfully loaded Kotlin runtime!")
        }
    }

}