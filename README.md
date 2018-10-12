#groovy plugins


###1.引用本地插件时，先将插件发布

#####发布之前添加以下仓库引用内容，会由于找不到插件而编译报错
#####在需要引用插件的模块build文件中添加仓库依赖，然后apply引用即可
#####添加本地仓库依赖

    buildscript{
        repositories{
            maven{
                url uri('../repo')
            }
        }
        dependencies{
            classpath 'com.shankes.gradle.plugin:config:1.0.0'
        }
    }
#####添加远程仓库依赖,在项目build中间中，修改buildScript
    buildscript {
    
        repositories {
            ...
            // Gradle 插件的仓库 by shankes , delete this after adding to JCenter
            maven {
                  url "https://dl.bintray.com/shankes/maven"
            }
        }
        dependencies {
            ...
            // Gradle config plugin by shankes
            classpath 'com.shankes.gradle.plugin:configPlugin:1.0.0'
        }
    }

###引用插件，在需要使用的模块build文件中直接添加以下内容即可
    apply plugin: 'configPlugin'
    // 以下传参内容可以省略，使用默认配置
    configPlugin {
        srcDir = 'config'
        includePattern = '**/*.*'
        excludePattern = '**/*.bak'
        desDir = getRootDir().path + File.separator + 'config'
    }

###发布插件产生错误
upload fails with "Failed to resolve package name" (daemon caching issues?)

####参考：
https://github.com/bintray/gradle-bintray-plugin/issues/107

####命令行中执行

    gradlew --stop
    
    gradlew clean bU

