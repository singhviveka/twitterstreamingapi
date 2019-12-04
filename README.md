# twitterstreamingapi is rest api made using spring boot and Spring Social Twitter.
Please edit the app-id and consumer-id will get as following real time streaming output with timestamp.
REST API: GET http://localhost:8080/tweets/?source=%23IndiaVsNZ

{  
"created_at": "Thu Oct 10 15:24:15 +0000 2019",
 "id_str": "850006245121695744",
 "text": "well done india.",
 "user": { 
   "name": "vivek"
 },
 "place": {
   "city": "Patna"
 }
}

Front-end: start server and go to index.html. It hit the http://localhost:8080/tweets/?source=%23byjus and highlight the words. 



























