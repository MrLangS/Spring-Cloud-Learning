package com.lang.logger.controller;

import com.lang.logger.config.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * IndexController
 * controller
 *
 * @author 杨舜
 * @date 2019-06-13
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * http://127.0.0.1:8080/index/?content="我是测试内容"
     *
     * @param content
     * @return
     */
    @Log("首页IndexController")
    @RequestMapping(value="", method= RequestMethod.GET)
    public String index(@RequestParam String content) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LOGGER.trace("请求参数：content:{}", content);
        LOGGER.debug("请求参数：content:{}", content);
        LOGGER.info("请求参数：content:{}", content);
        LOGGER.warn("请求参数：content:{}", content);
        LOGGER.error("请求参数：content:{}", content);

        return localDateTime + ",content:" + content;
    }

}
