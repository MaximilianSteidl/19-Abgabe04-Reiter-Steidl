# Lab Report Vertiefende Gesamtwiederholung

Abgabe 04

Maximilian Steidl

Reiter Thomas

Repository: [https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl.git](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl.git)

Übung zur Verfestigung aller bis jetzt gelernten Methoden

## Taskliste

- [X] Übertragen der Taskliste in Markdown Readme
- [X] Einspielen Queue Vorlage aus Repository
- [X] Taskergebnisse Schritt für Schritt auf Git stellen
- [X] Korrigieren Sie den Code bzw. Debuggen Sie ihn um die Fehler zu finden
- [X] Erstellen Sie für Klasse und alle Methoden Kommentare um mittels Javadoc eine API 
- [X] Erstellung JUnit Tests
- [X] Passen Sie Ihr pom.xml auf das Projekt an, damit Sie das Projekt erstellen aber auch Dokumentation generieren können.
- [X] Log4j (Version 2) integrieren und in jeder Methode ins Log schreiben
- [x] Maven Site Dokumentation erstellen
- [X] Erstellung detaillierter und nachvollziehbarer Markdown Lab Report
- [X] Überprüfung Vollständigkeit der Abgabe
- [X] Abgabe PDF Version der Abgabe



## Durchführung
### Vorbereitungen
Erstellung der Readme auf PC von Thomas um diese zu Ende dann dem Repository hinzuzufügen.
Einbinden der Taskliste. Keine Probleme aufgetreten.

### Fehlersuche
Korrektur Fehler : 	 maxsize --> maxSize beim Constructor
			         Änderung von poll()-Methode: == zu !=, grund: weil element removen, wenn vorhanden.
			         Entferne unnötige Überschreibung von element nach poll() Ausführung in remove()
                     
Thomas commited Änderungen.

Max erstellt alle JavaDoc Kommentare zu den Methoden.

### JUnit Tests
Thomas macht mit Absprache mit Max die notwendigen Tests zu jeder Methode.
Frage welche Tests werden benötigt? 
10 Verschiedene Tests werden erstellt.
Fehler erkannt: Queue beginnt bei wert 0 und nicht bei 1
commit
Max schreibt JavaDoc Kommentare zu den Tests und überarbeitet TestQueue um Fehler zu beheben.
![screenshot_testing](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/screenshot_testing.JPG)

### JavaDoc
Thomas erstellt über Eclipse alle Java Doc Files von der StringQueue und den Tests.

![class_StringQueue_SS1](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_StringQueue_SS1.JPG)
![class_StringQueue_SS2](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_StringQueue_SS2.JPG)
![class_StringQueue_SS3](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_StringQueue_SS3.JPG)
![class_StringQueue_SS4](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_StringQueue_SS4.JPG)
![class_StringQueue_SS5](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_StringQueue_SS5.JPG)
![class_StringQueue_SS6](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_StringQueue_SS6.JPG)

![class_test_SS1](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS1.JPG)
![class_test_SS2](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS2.JPG)
![class_test_SS3](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS3.JPG)
![class_test_SS4](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS4.JPG)
![class_test_SS5](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS5.JPG)
![class_test_SS6](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS6.JPG)
![class_test_SS7](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/class_test_SS7.JPG)

### pom.xml
Max passt .xml-Datei an und commited alle Änderungen

### log4j
Thomas überarbeitet StringQueue und pom.xml, fügt ressource + properties hinzu (Stack Beispiel als Vorlage)
Logger erstellt und getestet.
![logger_ss](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/logger_ss.JPG)

### Maven Site Dokumentation
Max überarbeitet noch einmal TestQueue, ändert die JavaDoc Kommentare in StringQueue und änderte die pom.xml für maven site.
Max vollendete die maven site Implementation in der pom.xml Datei und erstellte eine maven site.
Viele Versuche und viele Probleme. Nach mehreren Versuchen funktionierte es endlich (Grund war die Version von maven site [default]). 

![maven_Site_SS](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/maven_Site_SS.JPG)

### Lab Report
Thomas vollendet die ReadMe Datei / Lab Report.
Max liest über die Report und korrigiert einzelne Rechtschreibfehler.

Alle Commits im Überblick: (Stand 14.06.2019)

![commitlogSS](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl/blob/master/Media/commitlogSS.JPG)
