package com.example.log;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.jms.*;

@ApplicationScoped
public class LogService {

    @Inject
    private JMSContext jmsContext;

    @Resource(lookup = "java:/jms/queue/LogQueue")
    private Queue logQueue;

    public void log(String message, LogLevel level) {
        // TODO: Implementieren Sie die Nachrichtenerstellung und -versendung via JMS
    }
}
