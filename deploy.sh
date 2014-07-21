#!/bin/sh


cp -r SRC/main/webapp/* $CATALINA_HOME/webapps/admin

cp -r target/classes/* $CATALINA_HOME/webapps/admin/WEB-INF/classes
