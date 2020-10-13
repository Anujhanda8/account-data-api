# ACCOUNT-DATA-API

##SETUP:
 run as -> mvn clean install
 AccountDataApiApplication  -> run as Java Application	
 The project will automatically create an H2 instance and store the data in db tables.
 
## Operations enabled

### GET /accounts
 Fetch user accounts
 Browser -> http://localhost:8080/account
 
### Get /accounts/transactions/{accountNumber}
 Fetch Transactions corresponding to an account
 Browser -> http://localhost:8080/accounts/transactions/{accountNumber}  
 
### Get /actuator/health
 Browser -> http://localhost:8081/actuator/health
 Check api running status
 
