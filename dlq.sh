#!/bin/bash

for BROKER in 1 2
do
  ssh PRDCCM01AMSBK0${BROKER}.cp.cjs.hmcts.net 'cd /opt/cpp-support-tools && java -jar artemis-manager.jar browse @artemis-manager-browse.config | python -mjson.tool > ~/temp.json'
  scp PRDCCM01AMSBK0${BROKER}.cp.cjs.hmcts.net:temp.json ../DLQ_broker_${BROKER}.json
  ssh PRDCCM01AMSBK0${BROKER}.cp.cjs.hmcts.net 'rm ~/temp.json'
done

./concat.sh

./gradlew run --args="$1"




