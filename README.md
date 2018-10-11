# Groovy
groovy plugins

// 引用插件
apply plugin: 'configPlugin'

发布插件：upload fails with "Failed to resolve package name" (daemon caching issues?)

参考：https://github.com/bintray/gradle-bintray-plugin/issues/107

命令行中执行
    gradlew --stop
    gradlew clean bU

