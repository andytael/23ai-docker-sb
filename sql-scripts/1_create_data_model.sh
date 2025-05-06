#!/bin/bash
#
# Downloads and installs tge Oracle Database Sample Schema for Human Resources
#

rm -rf db-sample*; curl -LJO https://github.com/oracle-samples/db-sample-schemas/archive/refs/tags/v23.3.zip; unzip db-sample-schemas-23.3.zip
cd /opt/oracle/db-sample-schemas-23.3/human_resources

sqlplus -s app_user/Welcome-12345@//127.0.0.1/freepdb1 << EOF

  WHENEVER SQLERROR EXIT SQL.SQLCODE

  ALTER SESSION SET CONTAINER=FREEPDB1;

  @/opt/oracle/db-sample-schemas-23.3/human_resources/hr_create.sql
  @/opt/oracle/db-sample-schemas-23.3/human_resources/hr_populate.sql

  SELECT TABLE_NAME FROM USER_TABLES;

  EXIT;
EOF
