#!/bin/bash
#Command to execute the script: ./create-admin.sh "<nome>" "<email>" "<senha>"

#Command to execute locally:  java -jar target/bibliotech-0.0.1-SNAPSHOT.jar cadastrar-admin "name" "email" "pass"
docker compose run --rm bibliotech java -jar bibliotech.jar cadastrar-admin "$1" "$2" "$3"