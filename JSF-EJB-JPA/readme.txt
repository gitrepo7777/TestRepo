vani:


add h2-1.3.166.jar in glassfish/lib folder.

In persistence.xml : I added   <!-- vani added this Class tag -->
         <class>com.example.model.User</class>
         
           @PersistenceContext is changed to add name as:
           
          @PersistenceContext(name="example")
          
          
          http://localhost:8080/JSF-EJB-JPA/