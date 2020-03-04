# Java-Refresher

# Collections
- [List implementation in Java](https://github.com/AbhishekKumar4/Java-Refresher/blob/master/collections/SampleListDemo.java)

# 1. POST vs PUT vs PATCH

# POST
If the Client sends data without any identifier using the POST method then we will store it and assign a new identifier.
If the Client again sends the same data without any identifier using the POST method, then we will store it and assign a new identifier.
Note: Duplication is allowed here

# PUT
If the Client Sends data with an identifier then we will check whether that identifier exists. If the identifier exists we will update data else we will create it and assign a new identifier.

# PATCH
If the Client Sends data with an identifier then we will check whether that identifier exists. If the identifier exists we will update data else we will throw an exception.
Note: On Put Method, We are not throwing an exception if an identifier is not found. But in Patch method, we are throwing an exception if the identifier is not found
