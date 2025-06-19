package dev.anhuar.fishEvent;

/*
 * ========================================================
 * FishEvent - FishEvent.java
 *
 * @author Anhuar Ruiz | Anhuar Dev | myclass
 * @web https://anhuar.dev
 * @date 18/06/25
 *
 * License: MIT License - See LICENSE file for details.
 * Copyright (c) 2025 Anhuar Dev. All rights reserved.
 * ========================================================
 */

import dev.anhuar.fishEvent.util.ConfigUtil;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class FishEvent extends JavaPlugin {

    @Getter
    @Setter
    private static FishEvent instance;

    private ConfigUtil env, message, setting, fish, rod;

    @Override
    public void onEnable() {

        instance = this;

        this.env = new ConfigUtil(this, "env.yml");
        this.message = new ConfigUtil(this, "config/message.yml");
        this.setting = new ConfigUtil(this, "config/setting.yml");
        this.fish = new ConfigUtil(this, "event/fish.yml");
        this.rod = new ConfigUtil(this, "event/rod.yml");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
