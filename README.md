# Simple Google Cloud Counter Function using Java 11

## To Test localy run
mvn function:run

## To deploy it to GCP
gcloud functions deploy myCounterFunction --entry-point me.brunocrt.gcp.functions.CounterFunction --runtime java11 --trigger-http --memory 128MB --allow-unauthenticated