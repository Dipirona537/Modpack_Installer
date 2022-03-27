package com.dipirona.modpackinstaller;

public class download_mods {

    public static String backup() {
        String comando = "mkdir %APPDATA%\\.minecraft\\Backupmodpack";
        String str = "cmd.exe /c start cmd /c" + comando;
        return str;
    }

    public static String mover() {
        String comando = "move %APPDATA%\\.minecraft\\mods %APPDATA%\\.minecraft\\Backupmodpack\\mods" + data_atual();
        String str = "cmd.exe /c start cmd /c" + comando;
        return str;
    }

    public static String mover2() {
        String comando = "move %APPDATA%\\.minecraft\\config %APPDATA%\\.minecraft\\Backupmodpack\\config" + data_atual();
        String str = "cmd.exe /c start cmd /c" + comando;
        return str;
    }

    public static String mover3() {
        String comando = "move %APPDATA%\\.minecraft\\kubejs %APPDATA%\\.minecraft\\Backupmodpack\\kubejs" + data_atual();
        String str = "cmd.exe /c start cmd /c" + comando;
        return str;
    }

    public static String mover4() {
        String comando = "move %APPDATA%\\.minecraft\\resources %APPDATA%\\.minecraft\\Backupmodpack\\resources" + data_atual();
        String str = "cmd.exe /c start cmd /c" + comando;
        return str;
    }


    public static String comando1() {
        String comando = "ipconfig";
        String str = "cmd.exe /c start cmd /c" + comando;
        return str;
    }


    public static String comando2() {
        String comando = "color 2";
        String str = "cmd /c start cmd.exe /K" + comando;
        return str;
    }

    public static String comando3() {
        String comando = "wget";
        String str = "cmd /c start cmd.exe /K" + comando;
        return str;
    }

    public static String data_atual() {
        String data = String.valueOf(java.time.LocalDate.now());
        return data;
    }

    public static String modpack1() {
        String comando = "wget -c https://www.dropbox.com/s/dxdwamhh7icg6mn/mods%20ftbinfinityanniversary.rar?dl=1 -O mods.rar";
        String str = "cmd /c start cmd.exe /c" + comando;
        return str;
    }

    public static String movermods()
    {
        String comando = "move mods.rar temp";
        String str = "cmd /c start cmd.exe /c" + comando;
        return str;
    }

    public static String descompactar() {
        String comando = "unRAR.exe x mods.rar temp";
        String str = "cmd /c start cmd.exe /c" + comando;
        return str;
    }

    public static String temp()
    {
        String comando = "mkdir temp\\";
        String str = "cmd /c start cmd.exe /c" + comando;
        return str;
    }

    public static String deletar()
    {
        String comando = "del mods.rar";
        String str = "cmd /c start cmd.exe /c" + comando;
        return str;
    }


}



