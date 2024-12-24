curl -X POST "http://localhost:8080/orders/" \
-H "Content-Type: application/json" \
-d '{
  "name": "exampleName",
  "quantity": 10,
  "amount": 99.99,
  "status": "active"
}'