package com.shankes.gradle.plugin

/**
 * 复制文件插件   Extension
 *
 * @author shankes
 * @date 2018/5/22
 */
class ConfigPluginExtension {
    /**
     * 复制源文件夹
     */
    def srcDir = 'src'

    /**
     * 复制目标文件夹
     */
    def desDir = '../config'

    /**
     * 要复制的文件名匹配
     */
    def includePattern = '**/*.*'

    /**
     * 要排除的文件名匹配
     */
    def excludePattern = '**/*.bak'
}