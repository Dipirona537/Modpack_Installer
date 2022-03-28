package com.dipirona.modpackinstaller;

public class download_mods {

    public static String backup() {
        String comando = "mkdir %APPDATA%\\.minecraft\\Backupmodpack";
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover() {
        String comando = "move %APPDATA%\\.minecraft\\mods %APPDATA%\\.minecraft\\Backupmodpack\\mods" + data_atual();
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover2() {
        String comando = "move %APPDATA%\\.minecraft\\config %APPDATA%\\.minecraft\\Backupmodpack\\config" + data_atual();
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover3() {
        String comando = "move %APPDATA%\\.minecraft\\kubejs %APPDATA%\\.minecraft\\Backupmodpack\\kubejs" + data_atual();
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover4() {
        String comando = "move %APPDATA%\\.minecraft\\resources %APPDATA%\\.minecraft\\Backupmodpack\\resources" + data_atual();
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover5() {
        String comando = "move %APPDATA%\\.minecraft\\defaultconfigs %APPDATA%\\.minecraft\\Backupmodpack\\defaultconfigs" + data_atual();
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover6() {
        String comando = "move %APPDATA%\\.minecraft\\options.txt %APPDATA%\\.minecraft\\Backupmodpack\\options.txt";
        return "cmd.exe /c start cmd /c" + comando;
    }

    public static String mover7() {
        String comando = "move %APPDATA%\\.minecraft\\optionsof.txt %APPDATA%\\.minecraft\\Backupmodpack\\optionsof.txt";
        return "cmd.exe /c start cmd /c" + comando;
    }


    public static String comando2() {
        String comando = "color 2";
        return "cmd /c start cmd.exe /k" + comando;
    }

    public static String comando3() {
        String comando = "wget";
        return "cmd /c start cmd.exe /k" + comando;
    }

    public static String data_atual() {
        return String.valueOf(java.time.LocalDate.now());
    }

    public static String modpack1() {
        String comando = "wget -c https://www.dropbox.com/s/dxdwamhh7icg6mn/mods%20ftbinfinityanniversary.rar?dl=1 -O mods.rar";
        return "cmd /c start cmd.exe /c" + comando;
    }

    public static String descompactar() {
        String comando = "unRAR.exe x mods.rar %appdata%\\.minecraft";
        return "cmd /c start cmd.exe /c" + comando;
    }

    public static String deletar() {
        String comando = "del mods.rar";
        return "cmd /c start cmd.exe /c" + comando;
    }

    public static String forge_download()
    {
        String comando = "wget -c https://maven.minecraftforge.net/net/minecraftforge/forge/1.16.5-36.2.33/forge-1.16.5-36.2.33-installer.jar -O forge1.16.5-36.2.33.jar";
        return "cmd /c start cmd.exe /c" + comando;
    }

    public static String forge_install()
    {
        String comando = "java -jar forge1.16.5-36.2.33.jar";
        return "cmd /c start cmd.exe /c" + comando;
    }

    public static String forge_del()
    {
        String comando = "del forge1.16.5-36.2.33.jar";
        return "cmd /c start cmd.exe /c" + comando;
    }


}



