
wsdl REPLACE_WITH_URL  changed to  
http://localhost:8080/HelloWS/services/AddNumbersPort



right cilck on .wsdl file to generate webservice skeleton files:
choose GlassFish as the server, Axis as the runtime for webservices.

generates all the skeleton files in /src folder. creates deploy undeploy  wsdd, server-config.wsdd files.

then in browser
http://localhost:8080/HelloWS/services/AddNumbersPort?wsdl

 

