package com.lang.logger.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4jAndLogback
 * slf4j+logback
 *
 * @author lang
 * @date 2019-06-13
 */
public class Slf4jAndLogback {
    public static final Logger logger = LoggerFactory.getLogger(Slf4jAndLogback.class);

    public static void main(String[] args) {
        Slf4jAndLogback instance = new Slf4jAndLogback();
        logger.debug("这是一个debug");
        logger.info("这是一个info");
        logger.warn("这是一个warn");
        logger.error("这是一个error");
    }
}
