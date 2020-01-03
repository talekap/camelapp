# camelapp
mvn clean install

Run JBoss-fuse in standalone mode

On JBoss-fuse terminal, install bundle using below command:
install -s mvn:com.camel.app/camelapp/1.0-SNAPSHOT

check status of bundle:
osgi:list

URL to access the service:
http://localhost:8181/cxf/poc/helloservice/hello/<your_name>
