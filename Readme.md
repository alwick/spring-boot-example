# ReactJS and Spring Boot Table Example

## Overview

This project shows how to build a project which makes calls to Spring boot server via Restful call.  The user is able
to enter search criteria which is sent to the server to be processed against a given set of data and the results
are returned to the web client to be shown to the user.

## Usage

To Start the client application, cd into the **client** directory and run:
```
npm install
npm start
```

This will fire up a webpack dev server in **hot** mode. Most changes will be reflected in the browser automatically without a browser reload.

To Start the bootstrap server, cd into the **server** directory and run:
```
gradle bootrun
```

This will fire up the boostrap Tomcat container and start up the services. 

You can view the app in the browser at `http://localhost:8080`.