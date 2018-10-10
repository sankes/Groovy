package com.shankes.util.flavor

import org.gradle.api.Project
import org.gradle.api.invocation.Gradle

import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * 获取当前风味
 *
 * @author shankes
 * @date 2018/5/22
 */
class FlavorUtil {

    /**
     * 获取当前风味
     * @return
     */
    def static getCurrentFlavor(Project project) {
        Gradle gradle = project.getGradle()
        String taskReqStr = gradle.getStartParameter().getTaskRequests().toString()
        Pattern pattern
        if (taskReqStr.contains("assemble")) {
            pattern = Pattern.compile("assemble(\\w+)(Release|Preview|Debug)")
        } else {
            pattern = Pattern.compile("generate(\\w+)(Release|Preview|Debug)")
        }
        Matcher matcher = pattern.matcher(taskReqStr)
        if (matcher.find()) {
            String flavor = matcher.group(1)
            // This makes first character to lowercase.
            char[] c = flavor.toCharArray()
            c[0] = Character.toLowerCase(c[0])
            flavor = new String(c)
            println "getCurrentFlavor:" + flavor
            return flavor
        } else {
            println "getCurrentFlavor:cannot_find_current_flavor"
            return ""
        }
    }
}