sed -i '$ s/]/,/g' ../DLQ_broker_1.json
sed -i '1d' ../DLQ_broker_2.json
cat ../DLQ_broker_1.json ../DLQ_broker_2.json > ../dlqs.json
