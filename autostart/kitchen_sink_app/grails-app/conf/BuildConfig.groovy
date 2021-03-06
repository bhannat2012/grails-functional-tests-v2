grails.plugin.location.'db-util' = "../../plugins/grails-db-util"
grails.plugin.location.'resources-to-copy' = "../../plugins/resources-to-copy"
grails.plugin.location.'plugin-views' = "${basedir}/plugins/plugin-views-0.1"
grails.plugin.location.'namespace-one' = "${basedir}/plugins/namespace-one"
grails.plugin.location.'namespace-two' = "${basedir}/plugins/namespace-two"
grails.plugin.location.'namespace-three' = "${basedir}/plugins/namespace-three"

//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolver="maven"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    plugins {
        runtime ":hibernate:3.6.10.BUILD-SNAPSHOT"
        build ":tomcat:7.0.37.BUILD-SNAPSHOT"
        runtime ":build-test-data:1.1.1"
//        runtime ":db-util:0.4"
	}
    
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.13'
		runtime "org.grails:grails-plugin-testing:${grailsVersion}"
		runtime "org.grails:grails-test:${grailsVersion}"		
    }
}
