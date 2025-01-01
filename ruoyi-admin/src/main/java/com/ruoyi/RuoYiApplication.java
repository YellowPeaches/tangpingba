package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  ");
        System.out.println("" +
                "  _______                        _               _           \n" +
                " |__   __|                      (_)             | |          \n" +
                "    | | __ _ _ __   __ _   _ __  _ _ __   __ _  | |__   __ _ \n" +
                "    | |/ _` | '_ \\ / _` | | '_ \\| | '_ \\ / _` | | '_ \\ / _` |\n" +
                "    | | (_| | | | | (_| | | |_) | | | | | (_| | | |_) | (_| |\n" +
                "    |_|\\__,_|_| |_|\\__, | | .__/|_|_| |_|\\__, | |_.__/ \\__,_|\n" +
                "                    __/ | | |             __/ |              \n" +
                "                   |___/  |_|            |___/               \n");
    }
}
