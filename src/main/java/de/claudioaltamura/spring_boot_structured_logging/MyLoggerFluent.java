package de.claudioaltamura.spring_boot_structured_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class MyLoggerFluent implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyLogger.class);

    @Override
    public void run(String... args) {
        LOGGER.atInfo().setMessage("Hello structured logging, fluently!").addKeyValue("userId", "1").log();
    }

}