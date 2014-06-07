1. Write a Simple Java File : HelloBean.java with @Webservice Annotation
2. Write PublishBean.java file ; which publishes in the internal server 
3. get the wdl from the browser
4. using wsimport from command line generated the files

>wsimport  -keep  -p com.vani.stubs hellovani.wsdl -Xendorsed

5. Write  Client2.java : which uses these files

6. alternatively, just create a Client.java, no need of wsimport..
ignore ther errors on HelloBeanService