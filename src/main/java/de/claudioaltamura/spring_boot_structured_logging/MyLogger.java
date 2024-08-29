package de.claudioaltamura.spring_boot_structured_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class MyLogger implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogger.class);

    @Override
    public void run(String... args) {
        MDC.put("userId", "1");
        LOGGER.info("Hello structured logging!");
        MDC.remove("userId");
    }
}
