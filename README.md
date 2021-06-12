## Simple Google Cloud Counter Function using Java 11
This is a simple demo using GCP Serverless Function that responds to http requests incrementing a number

### To Test it localy run
`mvn function:run`

### To deploy it to GCP
`gcloud functions deploy myCounterFunction --entry-point me.brunocrt.gcp.functions.CounterFunction --runtime java11 --trigger-http --memory 128MB --allow-unauthenticated`