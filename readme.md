# Lab Report Vertiefende Gesamtwiederholung

Abgabe 04

Maximilian Steidl

Reiter Thomas

Repository: [https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl.git](https://github.com/MaximilianSteidl/19-Abgabe04-Reiter-Steidl.git)

Übung zur verfestigung aller bis jetzt gelernten Methoden

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
Erstellung der Readme auf PC von Thomas um diese zu ende dann dem Repository hinzuzufügen.
Einbinden der Taskliste. Keine Probleme Aufgetreten.

### Fehlersuche
korrektur Fehler : 	 maxsize --> maxSize beim Constructor
			         Änderung von poll()-Methode: == zu !=, grund: weil element removen wenn vorhanden
			         Entferne unnötige überschreibung von element nach poll() ausführung in remove()
                     
Thomas commited Änderungen

Max erstellt alle JavaDoc kommentare zu den Methoden

### JUnit Tests
Thomas macht mit Absprache mit Max die notwendigen Tests zu jeder Methode.
Frage welche Tests werden Benötigt? 
10 Verschiedene tests werden Erstellt.
Fehler erkannt: Queue beginnt bei wert 0 und nicht bei 1
commit
Max schreibt JavaDoc Kommentare zu den Tests und überarbeitet TestQueue um Fehler zu beheben.

### JavaDoc
Thomas Erstellt über Eclipse alle Java Doc Files von der StringQueue und den Tests.

![class_StringQueue_SS1](Media/class_StringQueue_SS1)
![class_StringQueue_SS2](Media/class_StringQueue_SS2)
![class_StringQueue_SS3](Media/class_StringQueue_SS3)
![class_StringQueue_SS4](Media/class_StringQueue_SS4)
![class_StringQueue_SS5](Media/class_StringQueue_SS5)
![class_StringQueue_SS6](Media/class_StringQueue_SS6)

![class_test_SS1](Media/class_test_SS1)
![class_test_SS2](Media/class_test_SS2)
![class_test_SS3](Media/class_test_SS3)
![class_test_SS4](Media/class_test_SS4)
![class_test_SS5](Media/class_test_SS5)
![class_test_SS6](Media/class_test_SS6)
![class_test_SS7](Media/class_test_SS7)

### pom.xml
Max passt xml datein an und commited alle Änderungen


![Testung](media/Testung.jpg)


### log4j
Pascal hat die zwei Dependencies in der pom.xml ergänzt, die für Log4j nötig sind. Außerdem haben wir das properties-File vom Stack-Beispiel übernommen. Zusätzlich: Importieren der nötigen Klassen und Erstellen eines Loggers. In jeder Methode wurde eine Info geloggt, dass die jeweilige Methode aufgerufen wird und vor jeder Exception wurde ein Error geloggt. So sieht das Ergebnis aus:

![log4j](media/log.jpg)

### Maven Site Dokumentation
Nach anfänglichen kleinen Schwierigkeiten, weil unter build im pom.xml das Maven Site Plugin gefehlt hat und der entsprechenden Ergänzung haben wir mvn site laufen lassen und eine erste Dokumentation erhalten. Um einen Menüpunkt zu ergänzen, haben wir die Inhalte im Ordner src/site/apt als index.apt ergänzt. Bevor mvn site erneut aufgerufen wird und der Link entsteht räumen wir mit mvn clean sicherheitshalber auf.

Hier das Ergebnis:

![MavenSite](media/maven.jpg)

### Lab Report
Die Verfassung des Lap Reports ist OHNE Markdown Editor passiert. Deshalb kam es zu Beginn zu nötigen Richtigstellungen der Formatierungsbefehle. Für die Zukunft wäre ein entsprechender Editor, in dem die Formatierungsbefehle direkt ausgeführt werden, zu empfehlen.

Um auch noch ein wenig Python in Markdown einzubinden:

```
print("Goodbye, World!")
x = 1
if x == 1:
    # indented four spaces
    print("x is 1.")
```

Die Commits dieser Übung im Überblick:

![Commit Messages](media/commits1.jpg)

-----

## Links / Literatur
Unterlagen aus den Vorlesungen und vorangegangenen Übungen. Weiterführende Links der Aufgabenstellung und MVN-Repository: [https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.11.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.11.2)
