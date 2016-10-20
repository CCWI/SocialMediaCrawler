CCWI SOCIALMEDIACRAWLER

Projekt Checkout - Eclipse
  1. Eclipse herunterladen
  2. EGit und Mylyn Connector installieren (https://www.frank-rahn.de/github-mit-eclipse-egit/)
  3. Eclipse -> Open Perspective (kleines Fensterymbol rechts oben) -> Git
  4. Clone a Git repository -> GitHub -> "SocialMediaCrawler" eingeben und search klicken
  5. "CCWI/SocialMediaCrawler" auswählen -> next -> master -> finish
  6. Wechseln in JavaEE Perspektive -> File -> Import -> Git
  7. Projects from Git -> Existing local repository -> "SocialMediaCrawler" auswählen -> next
  8. "Import existing Eclipse project" -> "Working Tree" auswählen -> next -> Finish
  9. Nach vollständigem Import -> rechts Klick auf Projekt -> Properties -> Java Build Path
  10. Libraries -> "reflection-0.9.8.jar" auswählen und "edit" klicken
  11. Die lib befindet sich ebenfalls im GitHub Projekt und wurde bereits mit ausgecheckt
  12. Beispiel Pfad wenn zur lib: "C:\Users\Arbeit\git\SocialMediaCrawler\reflections-0.9.8.jar"

Installationsanleitung:
  1. MySQL installieren
  2. Datenbank db_socialmediacrawler erstellen
  3. Benutzer 'crawler' mit Passwort 'start123' für 'alle Hosts' UND 'localhost' erstellen.
  4. Tomcat 7 installieren
  5. server.xml, web.xml und tomcat-user.xml austauschen
  6. Authentifizierungskeys im Projekt SocialMediaCrawler ergänzen:

Die Authentifizierungskeys sind bei den verschiednen Schnittstellen zu beantragen.

Die erhaltenen Authentifizierungskeys anschließend eintragen in folgenden Klassen:
edu.hm.bing.BING
edu.hm.amazon.Amazon
edu.hm.facebook.FacebookConnector
edu.hm.google.GoogleSearchClient
edu.hm.socialmediacrawler.TwitterStreamController
edu.hm.youtube.Youtube

Source Ebay:
com.ebay.sdk.call.FindingCall

Source Tumblr:
Datei credentials.json

7. WAR erstellen und auf den Server pushen.
8. Nach erster Ausführung werden die Tabellen in der Datenbank durch Hibernate erstellt.
9. Schlüsselwörter in Tabelle 'config_schluesselwoerter' eintragen. (vgl. \DB_config\Beispiel_schluesselwoerter_config.sql)
10. Bingseiten in Tabelle 'config_bing_seiten' eintragen. (vgl. \DB_config\Beispiel_bing_config.sql)
11. Facebookseiten in Tabelle 'config_fb_seiten' eintragen. (vgl. \DB_config\Beispiel_facebook_config.sql)
12. Youtubechannels in Tabelle 'config_youtube_channels' eintragen. (vgl. \DB_config\Beispiel_youtube_config.sql)
13. Startzeiten etc. in 'config_serverconfig' eintragen. (vgl. \DB_config\Beispiel_server_config.sql)
