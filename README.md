# camelapp
mvn clean install

Run JBoss-fuse-6.2.0 in standalone mode

On JBoss-fuse terminal, install bundle using command:
install -s mvn:com.camel.app/camelapp/1.0-SNAPSHOT

check status of bundle:
osgi:list

URL to access the service:
http://localhost:8181/cxf/poc/helloservice/hello/<your_name>
