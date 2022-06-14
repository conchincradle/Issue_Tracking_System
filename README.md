# Issue_Tracking_System | 課題管理システム | 议题管理系统
- Based on SpringBoot,IntelliJ, I used Java and Thymeleaf to develop a web application for issues tracking for learning SpringBoot.
- The TopPage is shown like below.
<div align="center"><img width="315" alt="image" src="https://user-images.githubusercontent.com/33627638/173580669-e542d16f-cc9b-4c0a-802e-3e9d6d8ba696.png"></div>
<p align="center">TopPage</p>

- When I click the Issue List link, it will go to the list page. And we could click the link to return TopPage, and go to the issue submit page.
<div align="center"><img width="172" alt="image" src="https://user-images.githubusercontent.com/33627638/173580740-80a230ac-2f55-40d3-8a67-243231bfc5bd.png"></div>
<p align="center">List Page</p>

- For issue submit page, summary and description will be input and sent to the controller. Then it will be stored in the model and shown in the view, that is the List page.
<div align="center"><img width="246" alt="image" src="https://user-images.githubusercontent.com/33627638/173580778-c6e0531f-4f27-49b1-8169-e1dc366ef5dc.png"></div>
<p align="center">Submit Page</p>
<div align="center"><img width="226" alt="image" src="https://user-images.githubusercontent.com/33627638/173580908-17c14e03-3e81-405e-b884-d9c9bfd6db86.png"></div>
<p align="center">Input</p>
<div align="center"><img width="145" alt="image" src="https://user-images.githubusercontent.com/33627638/173580940-5fb81c0a-1c82-4fdf-95aa-6b94e4684b35.png"></div>
<p align="center">New issues will be added in to the List Page</p>
<div align="center"><img width="199" alt="image" src="https://user-images.githubusercontent.com/33627638/173580991-cf5c6599-200e-468b-ab5e-345379188b98.png"></div>
<p align="center">Detail Page</p>

* Therefore, for frontend, there are four html files. 
  1. index.html for showing the top page.
  2. list.html for showing the issues list on list page.
  3. detail.html for showing the details of each issue on detail page.
  4. creationForm.html for showing the input form on the issue submit page.
 - (Misunderstood concept) :
    1.MVC(Model View Controller) is a design pattern for presentation layer, and it's triangular. User interacts with Controller and see View. View could be updated directly from Model. And Controller can manipulate the Model. Microservice
    2.Three-tier architecture is system architecture for the whole system,and it's linear. Presentation tier send request and get respond from Business Logic tier. Business Logic Tier send query and get respond from Data Access Tier.Macroservice.
     
 * Code is implemented based on three-tier architecture.
   1.Presentation tier: Firstly, we created IndexController class to control the  
   2.Business Logic tier:
   3.Data Access tier:
 - 
