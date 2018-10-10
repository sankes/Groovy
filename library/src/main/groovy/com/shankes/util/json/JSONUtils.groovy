package com.shankes.util.json

import groovy.json.JsonSlurper
import org.gradle.api.DefaultTask

/**
 * 暂时没用到
 */
class JSONUtils extends DefaultTask {

    Object parseFile(File configFile) {
        def parser = new JsonSlurper()
        return parser.parse(configFile)
    }

    AppConfigBean parseFileToObject(File file) {
        JsonSlurper parser = new JsonSlurper()
        return parser.parse(file, "utf-8")
    }
}