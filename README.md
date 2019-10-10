#Spring Batch Feeder file processing

Import the maven project in STS or IntelliJ

1. mvn clean install

2. After that check the src\main\java\resources package and select application-oracle.properties.
    1. Please edit spring datasource according to your oracle db connection.
    2. Input 'batch.input.file.path' location for GCMS Transaction Details file if you have or else next step.
    3. If file is not available please edit your spring boot application and add the VM argument below : 
            "-DBatch.input.file.path=$FileDir$\sampleFile\GCMS_BA_190920_00000031318_BA"
       In resource package there is sample file of GCMS Transaction Details (as of now use only GCMS Transaction Details file).
       
       Note :- $FileDir$ this is intelliJ specific environmental variable.
        
3. mvn springboot:run

For running project in UNIX.
1. Create the jar file using maven command mvn clean install this will create target folder and will contain jar file.
2. Take that jar file to unix system and with file GCMS Transaction Details feeder file.
3. Make sure we have java installed in unix system and then run the following command with your details in one line:- 

    java -jar {Jar file name}.jar
    --spring.datasource.url=jdbc:oracle:thin:@{your localhost}:{port}:{serviceName}
    --spring.datasource.username={your user name}
    --spring.datasource.password={your password}
    --spring.datasource.driverClassName=oracle.jdbc.driver.OracleDriver
    --batch.input.file.path={GCMS Transaction Details file location in unix system}
    
For result you can login to your oracle db and check for latest records in db.