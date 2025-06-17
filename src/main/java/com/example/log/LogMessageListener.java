package com.example.log;

import jakarta.ejb.ActivationConfigProperty;
import jakarta.ejb.MessageDriven;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:/jms/queue/LogQueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "jakarta.jms.Queue")
})
public class LogMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        // TODO: Implementieren Sie die Nachrichtenverarbeitung und Logging mit Log4j
    }
}
