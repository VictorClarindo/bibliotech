#!/bin/bash
#Comando para executar o script: ./create-admin.sh "<nome>" "<email>" "<senha>"
docker compose run --rm bibliotech java -jar bibliotech.jar cadastrar-admin "$1" "$2" "$3"