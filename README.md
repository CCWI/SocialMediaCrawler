# SocialMediaCrawler
Social Media Crawler des CCWI
SOCIALMEDIACRAWLER
Installationsanleitung:
1. MySql installieren
2. Datenbank db_socialmediacrawler erstellen
3. Benutzer 'crawler' mit Passwort 'start123' für 'alle Hosts' UND 'localhost' erstellen.
4. Tomcat 7 installieren
5. Server.xml, Web.xml und tomcat-user.xml austauschen
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
