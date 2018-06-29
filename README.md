# KSwe SoSe 2018 - Aufgabe 7

In dieser Aufgabe soll ein einfacher Algorithmus zur Identifizierung
des längsten Wortes eines Textes implementiert werden.

## Beschreibung

Forke zunächst das Repository und lade es in deine IDE ein.

Die Klasse `TextAnalyzer` besitzt eine Methode `findLongestWord`, welche
allerdings noch keine Logic besitzt. Schreibe zunächst einen Test (in
Analogie zu der vorhandenen `Main`-Klasse. Implementiere anschließend
den Algorithmus.

* Nutze interaktives Debugging, um den Ablauf des Algorithmus zu überprüfen.
* Integriere des JaCoCo Code Coverage Plugin und inspiziere die generierten
Reports:

```
    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.1</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```


## Zusatzaufgabe

Integriere dein Repository in Travis CI: http://travis.io/ und
überprüfe, ob dein Projekt erfolgreich getestet und gebaut wird.
