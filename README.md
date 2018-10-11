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

###引用插件
apply plugin: 'configPlugin'

###发布插件产生错误
upload fails with "Failed to resolve package name" (daemon caching issues?)

####参考：
https://github.com/bintray/gradle-bintray-plugin/issues/107

####命令行中执行

    gradlew --stop
    
    gradlew clean bU

