# KubernetesAssignment
This repository contains the files and instructions for the Kubernetes assignment. The assignment focuses on deploying a Spring Boot application with a PostgreSQL database using Kubernetes.

# Prerequisites
Before starting the assignment, ensure that you have the following prerequisites installed:
Docker
Kubernetes (kubectl)
Minikube (for local development/testing)

# Getting Started
Follow the steps below to complete the assignment:

1. Clone this repository to your local machine:
   
   git clone https://github.com/RahulSharma91/NAGPKubernetesAssignment.git

2. Build the Docker image for the Spring Boot application:
   cd microservice-api-deployment
   docker build -f Dockerfile -t docker-image-name .

3. Start Minikube cluster:

   minikube start

4. Deploy the PostgreSQL database:
   
   cd postgres-database-deployment
   
   kubectl apply -f postgres-database-secrets.yaml
   
   kubectl apply -f postgres-database-config.yaml
   
   kubectl apply -f postgres-database-deployment.yaml
   
   kubectl apply -f postgres-database-service.yaml

   kubectl apply -f postgres-create-db-job.yaml

   
5. Verify the database deployment:
   
   kubectl get pods
   
   Ensure that the PostgreSQL pod is running successfully.
   
6. Deploy the Spring Boot application:
   
   cd microservice-api-deployment
   
   kubectl apply -f nagp-member-api-secrets.yaml
   
   kubectl apply -f nagp-member-api-config.yaml
   
   kubectl apply -f nagp-member-api-deployment.yaml
   
   kubectl apply -f nagp-member-api-service.yaml
   
7. Verify the application deployment:

   kubectl get pods
   
   Ensure that the Spring Boot application pod is running successfully.
   
8. Access the application:
   
   minikube service spring-boot-app-service-name --url
   
  This will give the url by which api can be accessed.

 # Docker Image Used

rahul2791/nagp_member_rest_api:latest

postgres:latest

# Clean up

To clean up and remove all the resources created during the assignment, run the following commands:

kubectl delete deployment spring-boot-app-deployment-name

kubectl delete service spring-boot-app-service-name

kubectl delete deployment postgres-deployment-name

kubectl delete service postgres-service-name

minikube stop



Happy learning and exploring Kubernetes!





