package com.jpmc.midascore.kafka;

import com.jpmc.midascore.foundation.Transaction;   // ✅ adjust if Transaction is in different package
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionKafkaListener {

    @KafkaListener(
            topics = "${general.kafka-topic}",
            groupId = "midas-core"
    )
    public void receive(Transaction transaction) {
        // ✅ Put breakpoint here to record first 4 transactions
        System.out.println("Received transaction amount: " + transaction.getAmount());
    }
}
