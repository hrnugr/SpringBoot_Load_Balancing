package com.harunugur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author harun ugur
 * @since 2020-12-07
 */

@RestController
public class ProductController {

    /**
     * @return product
     */
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String testService() {

        return "Product Service 1";
    }
}
