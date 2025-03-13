#!/bin/bash
#
# Drops and creates the database user.
#

sqlplus -s / as sysdba << EOF
  WHENEVER SQLERROR EXIT SQL.SQLCODE

  ALTER SESSION SET CONTAINER=FREEPDB1;
  
  --DROP USER IF EXISTS APP_USER CASCADE;
  
  ALTER USER APP_USER IDENTIFIED BY "Welcome-12345" DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;
  GRANT DB_DEVELOPER_ROLE TO APP_USER;
  
  EXIT;
EOF