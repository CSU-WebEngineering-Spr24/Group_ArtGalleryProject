

---

# Group_ArtGalleryProject

```
cd serverApp

sdk install java 17.0.10-amzn


gradle bootrun

```


## Team Project

### Team Members

- Swati Kasina
- Sindhu Yasa
- Vineetha Bandla

# Demo 3 Updates


## artworks page with query and page number fields
![alt text](image-1.png)

## Artwork details page
![alt text](image-2.png)

![alt text](image-3.png)

## Artists page
![alt text](image-4.png)

## Artist Details Page
![alt text](image-5.png)

## Dynamic Routes
![alt text](image-6.png)




Refer to the [API Documentation Link](https://api.artic.edu/docs/#collections) for details.

Using the `/artworks?limit=<int>` API endpoint.

![image](https://github.com/CSU-WebEngineering-Spr24/Group_ArtGalleryProject/assets/150859740/3a745da8-7b94-42e9-8004-f9883e8097fb)
![image](https://github.com/CSU-WebEngineering-Spr24/Group_ArtGalleryProject/assets/150859740/1a3f01e6-47e1-47fe-b55f-607f35f22f7c)
![image](https://github.com/CSU-WebEngineering-Spr24/Group_ArtGalleryProject/assets/150859740/b25954ca-6fb2-4015-ac15-01862dedee11)
![image](https://github.com/CSU-WebEngineering-Spr24/Group_ArtGalleryProject/assets/150859740/7fcaae05-d13b-4fae-9e7b-ba48e3af4cef)
![image](https://github.com/CSU-WebEngineering-Spr24/Group_ArtGalleryProject/assets/150859740/dc9136c4-4ba6-4377-9df1-ad05afddcec3)



---

## Steps to Run the Project

1. Go to [Gitpod](https://gipod.io/#/github.com/CSU-WebEngineering-Spr24/Group_ArtGalleryProject).

   **Note:** To contribute, fork the repo and use the forked repo.

2. Run the following commands to enable Java 17 on Gitpod:

   ```bash
   sudo apt update
   sudo apt install openjdk-17-jdk -y
   sudo update-alternatives --config java
   JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"
   export PATH=$JAVA_HOME/bin:$PATH
   ```

   Now proceed to compile the backend (optional).

3. Navigate to the `ArtGalleryFrontend` directory:

   ```bash
   cd ./ArtGalleryFrontend
   ```

   Install dependencies:

   ```bash
   npm install
   ```

   > Demo 2 frontend dominant changes, so run frontend
   Run the frontend:  [Pase 2]

   ```bash
   npm run dev
   ```

   Build the frontend:

   ```bash
   npm run build
   ```

4. Next, navigate to the backend directory:

   ```bash
   cd ../serverApp
   ```

   Build the backend:

   ```bash
   gradle build
   ```

   Run the backend:

   ```bash
   gradle bootrun
   ```

5. Click on "Open in Browser" to preview the application.

---

## Contribution Log

> Checkout https://github.com/orgs/CSU-WebEngineering-Spr24/projects/8/views/1 

### Done

- **Create Repository**
  - Assignees: [@sindhu-yasa](https://github.com/sindhu-yasa)
  - Description: Repository creation in progress.

- **Create SpringBoot Application with HelloWorld**
  - Assignees: [@Vineetha785](https://github.com/Vineetha785)
  - Description: SpringBoot application creation with a HelloWorld endpoint.

- **Create Frontend Application Skeleton**
  - Assignees: [@SwatiKasina](https://github.com/SwatiKasina)
  - Description: Frontend application skeleton setup.

- **Connect Frontend React and Springboot with Thymeleaf**
  - Assignees: [@sindhu-yasa](https://github.com/SwatiKasina)
  - Description: Connection between frontend React and SpringBoot with Thymeleaf in progress.

- **Backend SpringBoot Server Skeleton**
  - Assignees: [@SwatiKasina](https://github.com/SwatiKasina)
  - Description: Backend SpringBoot server skeleton setup.

- **Helloworld In Springboot**
  - Assignees: [@Vineetha785](https://github.com/SwatiKasina)
  - Description: HelloWorld implementation in SpringBoot.

### InProgress

- **Setup React router and setup routing templates**
  - Assignees: [@sindhu-yasa](https://github.com/sindhu-yasa)
  - Description: React router setup completed.

- **Setup remaining Phase 1 Get API s**
  - Assignees: [@SwatiKasina](https://github.com/SwatiKasina)
  - Description: Phase 1 Get API setup completed.

### Todo

- **Implement react router dom pages**
  - Assignees: 
  - Description: 

- **Implement react complied urls in index route as multiple values to prevent 404**
  - Assignees: 
  - Description:

- **Implement Search based Get APIs in detail**
  - Assignees: 
  - Description: 

- **Implement react logic to store favoutites by cache**
  - Assignees: 
  - Description:

- **Implement Global page with some external world map plugin**
  - Assignees: 
  - Description:
