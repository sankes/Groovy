package com.shankes.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 复制文件插件
 *
 * @author shankes
 * @date 2018/5/22
 */
class ConfigPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        //增加闭包名称，闭包为configPlugin，是 ConfigPluginExtension类型，因此ConfigPluginExtension类型中的JaveBean类型的属性可以任意设置
        project.extensions.create("configPlugin", ConfigPluginExtension)
        project.afterEvaluate {
            println("------------------------------- config copy start -------------------------------")
            project.copy {
                // 源文件夹
                println("------------------------------- config copy from: " + project['configPlugin'].srcDir + " -------------------------------")
                from project['configPlugin'].srcDir

                // 包含的文件名匹配规则
                println("------------------------------- config copy include: " + project['configPlugin'].includePattern + " -------------------------------")
                include project['configPlugin'].includePattern

                // 排除的文件名匹配规则
                println("------------------------------- config copy exclude: " + project['configPlugin'].excludePattern + " -------------------------------")
                exclude project['configPlugin'].excludePattern

                // 是否包含空文件夹
                includeEmptyDirs false

                // 目标文件夹
                println("------------------------------- config copy to: " + project['configPlugin'].desDir + " -------------------------------")
                into project['configPlugin'].desDir
            }
            println("------------------------------- config copy finished -------------------------------")
        }
    }
}