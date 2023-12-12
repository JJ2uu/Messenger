package com.project.messenger.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public void info(String message) {
        logger.info("INFO ::: " + message);
    }

    public void debug(String message) {
        logger.debug("DEBUG ::: " + message);
    }

    public void ERROR(String message, Throwable throwable) {
        logger.error("ERROR ::: " + message, throwable);
    }

    public void warn(String message) {
        logger.warn("WARN ::: " + message);
    }

    public void trace(String message) {
        logger.trace("TRACE ::: " + message);
    }
}