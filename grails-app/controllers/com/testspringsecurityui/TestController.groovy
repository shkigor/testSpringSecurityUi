package com.testspringsecurityui

import grails.plugin.springsecurity.annotation.Secured

class TestController {

    @Secured ('ROLE_ADMIN')
    def index() {
        render "<h1>Test SpringSecurityUI</h1>"
    }
}
