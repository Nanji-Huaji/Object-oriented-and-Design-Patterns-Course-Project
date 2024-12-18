set STU_WEB=%STUDENT_HOME%\1000000
set WEB_HOME=%STU_WEB%\WebSite\WEB-INF
set DATABASE_HOME=%STU_WEB%/mysql
set TOM_HOME=%STU_WEB%\tomcat
set TOM_LIB=%TOM_HOME%\lib
set WEB_LIB=%WEB_HOME%\lib
set CATALINA_HOME=%TOM_HOME%
set JAVA_VENDOR=Sun
set JAVA_HOME=%STU_WEB%\java\jdk
set PATH=%STU_WEB%;%JAVA_HOME%\bin;%DATABASE_HOME%\bin;%PATH%
set CLASSPATH=%JAVA_HOME%\bin;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;%JAVA_HOME%\jre\lib\rt.jar;
set CLASSPATH=%WEB_HOME%\classes;%TOM_LIB%\servlet-api.jar;%TOM_LIB%\jsp-api.jar;%CLASSPATH%
set CLASSPATH=%WEB_LIB%\lib\mysql-connector-java-5.1.48.jar;%CLASSPATH%
set CLASSPATH=%WEB_LIB%\commons-fileupload-1.4.jar;%WEB_LIB%\commons-io-2.6.jar;%WEB_LIB%\commons-lang3-3.8.1.jar;%WEB_LIB%\freemarker-2.3.30.jar;%WEB_LIB%\javassist-3.20.0-GA.jar;%WEB_LIB%\log4j-api-2.12.1.jar;%WEB_LIB%\ognl-3.1.28.jar;%WEB_LIB%\struts2-core-2.5.25.jar;%CLASSPATH%
set CLASSPATH=%WEB_LIB%\antlr-2.7.7.jar;%WEB_LIB%\classmate-1.3.0.jar;%WEB_LIB%\dom4j-1.6.1.jar;%WEB_LIB%\hibernate-commons-annotations-5.0.1.Final.jar;%WEB_LIB%\hibernate-core-5.2.17.Final.jar;%WEB_LIB%\hibernate-jpa-2.1-api-1.0.0.Final.jar;%WEB_LIB%\jandex-2.0.3.Final.jar;%WEB_LIB%\jboss-logging-3.3.1.Final.jar;%WEB_LIB%\jboss-transaction-api_1.2_spec-1.0.1.Final.jar;%CLASSPATH%