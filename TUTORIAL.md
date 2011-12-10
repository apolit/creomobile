### Setup Eclipse environment
* Download OneInstall Agent http://www.poweredbypulse.com/oneinstall_client.php
* Download and install Java WTK 2.5.1: http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloads-javame-419430.html#j2me_wireless_toolkit-2_5_1-zh-oth-JPR (sun_java_wireless_toolkit_2_5_1-ml.exe for windows and .bin for Linux)
* Save as local file and run with OneInstall Agent: https://github.com/downloads/apolit/creomobile/CreocodeEclipse_3.7.oneinstall

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/01_oneinstall_local.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/02_oneinstall.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/03_android_sdk_eclipse.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/03_android_sdk_manager.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/04_import_menu.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/05_git_clone.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/06_git_clone_2.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/06_git_clone_readonly.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/08_git_clone_select.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/09_git_clone_projects.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/10_wtk_install.png)

**Download J2ME dependencies:**

* Download Antenna from: http://sourceforge.net/projects/antenna/files/antenna/Antenna%201.2.1-beta/antenna-bin-1.2.1-beta.jar/download
* Download and unpack Proguard: http://sourceforge.net/projects/proguard/files/proguard/4.4/proguard4.4.zip/download


**Set paths:**

CatalogME/mtj-build.properties:
<pre>
wtk.home=C\:\\WTK2.5.1
do-obfuscate=false
wtk.midp.version=2.1
wtk.cldc.version=1.0
do-autoversion=false
antenna.lib=C\:\\creomobile\\antenna.jar
wtk.proguard.home=C\:\\creomobile\\proguard4.4
</pre>

CatalogAndroid/local.properties
<pre>
sdk.dir=C\:\\Users\\USERNAME\\android-sdks
</pre>

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/11_manage_select.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/12_manage_colorphone.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/13_manage_finish.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/14_export_project.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/15_export_filesystem.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/16_export_select.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/17_0_midletgenerator_run.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/17_midletgenerator_runas.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/18_working_sources.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/19_plugins_addrequired.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/20_midletgen_console.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/21_0_new_project.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/21_1_new_project2.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/21_editor_runas.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/22_new_catalog.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/23_new_catalog_model.png)

![](https://github.com/apolit/creomobile/raw/master/resources/screenshots/24_example.png)

Click with right mouse button on catalog.catalog and choose "Generate".

