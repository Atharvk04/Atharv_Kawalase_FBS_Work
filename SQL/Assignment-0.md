&nbsp;**show databases;**





**use hotel\_management;**



&nbsp;**show tables;**



 **desc customer;**



&nbsp;alter table customer

-> add primary key(cId);



&nbsp;alter table customer

&nbsp;   -> modify column email varchar(20) unique;



 **desc room;**



&nbsp;alter table room

&nbsp;   -> add primary key (rNo);



&nbsp; alter table room

&nbsp;   -> modify column price int default "1000";



&nbsp;alter table room

&nbsp;   -> modify column rtype varchar(20) default "Basic";





 **desc booking\_details;**



&nbsp;alter table booking\_details

&nbsp;   -> add primary key (bid);





 **desc food;**



alter table food

&nbsp;   -> add primary key(food\_id);





 **desc food\_service;**



alter table food\_service

&nbsp;   -> add primary key (fs\_id);



 **desc laundry;**



alter table laundry

&nbsp;   -> add primary key (lid);



&nbsp;alter table laundry

&nbsp;   -> modify column price int default "20";



**desc site\_visit;**



alter table site\_visit

&nbsp;   -> add primary key(sv\_id);



**desc site\_service;**



&nbsp;alter table site\_service

&nbsp;   -> add primary key(ss\_id);



