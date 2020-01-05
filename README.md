# camelapp

This is the code repository for the camel EIP pattern Content Based Router

### Prerequisites

Apache Maven - version 3.6.0

Java 1.8

JBoss-fuse-6.2.0 

IntelliJ IDEA

Postman

Docker Toolbox

### Installing
Download Apache Maven here
https://maven.apache.org/

Download java here:
https://www.java.com/en/download/

Download IntelliJ community edition here:
https://www.jetbrains.com/idea/

Download Docker Toolbox <br />
For Mac:
https://docs.docker.com/toolbox/toolbox_install_mac/ <br />

For Windows:
https://docs.docker.com/toolbox/toolbox_install_windows/

Download PostMan here:
https://www.getpostman.com/downloads/

## Getting Started

To get a copy of the code run the following command on terminal/gitbash in the directory you want your code base in:

git clone https://github.com/talekap/camelapp.git

Go to the Deployment section to see how to deploy the code.

## Deployment

To deploy the PoC application, complete the following:

1)  Run 'mvn clean install' in the parent project (camelapp)

2)  Run JBoss-fuse-6.2.0 in standalone mode

3) On JBoss-fuse terminal, install the bundle using command: </br>
   install -s mvn:com.camel.app/camelapp/1.0-SNAPSHOT

4) check status of bundle using below command, it should be created </br>
   osgi:list

## Endpoints

Customer service </br>
http://localhost:8181/cxf/customerpoc/customer/placeorder

HelloWorld service </br>
http://localhost:8181/cxf/poc/helloservice/hello/<your_name>

## Testing

1) To test the PoC Customer service, open up Postman, copy the Customer service endpoint above into the URL field and Select POST.
Set the body of the request to the following, and send the request. You can change country to UK, USA or to any country
  
    { <br />
      "name":"pradnya", <br />
      "country":"UK" <br />
    }
    

2) To test HelloWorld service, copy the HelloWorld endpoint above into the URL field and Select GET. Send the request.

## Known Issues

No Known Issues. Please edit if issues are found


## Built With

* Apache CXF (to build the web services)
* Apache Camel
* Blueprint (used for dependency injection and routing of messages)
* Apache ActiveMQ (messaging service)
* JBOSS Fuse (Web server)
* Apache Karaf (OSGI runtime environment used within JBOSS fuse to deploy bundles)
