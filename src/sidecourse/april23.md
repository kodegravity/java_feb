## API 

Application Programming Interface

UI - User interface 

OS - interface between user and hardware



1. Google API --- google map 

UBER, doordash, skipthedishes 

client                                                          server
UBER       toronto ---> Scarborough [LAT, LON]----------->  GOOGLE MAP API [Expose this api]
                              25 mins.  <---

stripe api 
amazon -----> checkout -----> payment [scotibank ,   BMO ]



1. SOAP API : Simple Object Access Protocol
2. REST API  : Representational State Transfer
3. RPC : gRPC : google remote procedural call 



## REST 

HTTP : Hyper text transfer protocol

HTTP methods 
GET , PUT, POST, DELETE, PATCH    - resource


HTTP REQUEST :
            server url   https://default.any-any.prd.api.hbomax.com/session-context/headwaiter/v1/bootstrap?category=Counties&subCategory=USA  
            header      : content-type[HTML, XML, JSON],traceparent,tracestate,x-device-info,x-disco-client,x-disco-params,x-wbd-device-consent,x-wbd-preferred-language,x-wbd-session-state,x-wbd-time-zone
                        : token , HTML, XML, JSON
            method      : POST
            body        : {username: "info@kodegravity.com", password : "asdaguiaskdg" flow: "sign_in"}





## server url  
base URL : https://default.any-any.prd.api.hbomax.com/   : HOME ADDRESS
 
end point : session-context/headwaiter/v1/bootstrap?category=Counties&subCategory=USA      : ROOM LOCATION : BED

?category=Counties&subCategory=USA    - Query Parameters

https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid={API key}
## method
GET =====> Fetch the resource 
POST =====> create the resource 
PUT =====> update the resource 
DELETE =====> delete the resource 
PATCH =====> update a specific thing in the resource 


## BODY 

JSON 

{
"firstName": "John",
"lastName": "Doe",
"age": 30,
"hobbies": ["reading", "cycling"]
}



POSTMAN 











