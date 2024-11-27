# Improvements - 1

## CQRS
What is CQRS? 
- It stands for Command Query Responsibility Separation. 
It splits up `READ` and `WRITE` operations in two separate responsibility groups. 

We start with `READ`. To implement READ responsibility group we have to have a handler. All `READ` operations are referred to as `queries`. We build it using `handler`, `repository` and `query` classes. 
`Query` classes build up the `READ` objects.  

What are the critera for `WRITE` or `COMMANDS`? 
- Commands should be task-based rather than data centric. In other words, it should be a `verb` + `noun`, e.g., "BookHotelRoom". 



 

- [x] Two query 
- [x] Two commands 
- [] Aspect oriented programming 
- [] DDD With Spring 
- [] Logging 
- [] Configuration 
- [x] Packages
- [] CQRS
- [] Rate limit - using external configuration 

Later: 
Long term storage
MongoDB/Docker 

