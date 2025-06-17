# Logging Assessment

Dies ist ein Assessment-Projekt zur Bewertung grundlegender Java-EE-Kenntnisse im Umgang mit:

- **CDI** (Contexts and Dependency Injection)
- **JMS** (Java Message Service)
- **Log4j 2** (Logging Framework)
- **Maven** (Build-Tool)
- **JUnit 5 & Mockito** (Testing Frameworks)

---

## Ziel der Aufgabe

Implementieren Sie einen einfachen Logging-Dienst, der:

1. Log-Nachrichten über JMS versendet.
2. Über einen MessageListener verarbeitet und mit Log4j ausgibt.
3. Über Unit-Tests absicherbar ist.

---

## Projektstruktur

```plaintext
src/
??? main/
?   ??? java/com/example/log/
?   ?   ??? LogService.java
?   ?   ??? LogLevel.java
?   ?   ??? LogMessageListener.java
?   ??? resources/
?       ??? log4j2.xml
??? test/
    ??? java/com/example/log/
        ??? LogServiceTest.java