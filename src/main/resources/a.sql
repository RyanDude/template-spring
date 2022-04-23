insert into office(name, address, manager, phone,resp_area) values('Dekalb Branch','731 Fondren, GA', 'John Smith','404-111-2222','Dekalb County');
insert into office(name, address, manager, phone,resp_area) values('Jonh Creek Branch','638 Voss, GA', 'Franklin Wong','404-123-4567','Fulton County');
insert into office(name, address, manager, phone,resp_area) values('Gwinnett','291 Berry, GA', 'Jennifer Wallace','404-345-6789','Gwinnett County');
insert into office(name, address, manager, phone,resp_area) values('Cobb Branch','200 Glenridge Point Pkwy, Atlanta, GA', 'Miguel Rojas','404-848-0996','Cobb County');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Ramesh Narayan','M','1962-09-15','404-876-5461','975 Holly Oak Ct, Lawrenceville, GA',20,3);
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Joyce English','F','1972-07-31','770-455-3574','5631 Rice, GA',10,3);
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Ahmad Jabbar','M','1969-03-09','404-758-5290','980 Dallas, GA','17','2');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('James Borg','M','1976-04-05','404-364-7000','450 Stone, GA','12','2');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Anna Joy','F','1982-11-02','404-274-9821','975 Fire Oak, GA','10','4');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Ethan Atkinson','M','1984-09-16','678-485-9198','575 Harris Street, GA','13','1');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Kimberly Roland','F','1980-12-06','404-696-9882','198 Mars Hill Road, GA','16','2');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Mark Spain','M','1979-08-16','855-299-7653','2050 Buford Hwy, GA','26','2');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Ramsy Paula','M','1960-09-03','404-531-5700','200 Glenridge Point Pkwy, Atlanta, GA','25','2');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Jia Liu','F','1991-04-23','770-777-1321','4825 Atlanta Hwy #100, Alpharetta, GA','6','2');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Claire Connarro','F','1990-03-28','404-261-2700','4651 Olde Towne Pkwy, Marietta, GA','10','4');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Jenny Stallings','F','1985-08-23','404-874-0300','1414 Montreal Rd, Tucker, GA','13','1');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Kathie Lyons','F','1983-08-08','404-233-4142','325 Brannon Rd, Cumming, GA','12','1');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Michelle Graves','F','1985-10-05','678-858-8461','255 Village Pkwy NE #140, Marietta, GA','15','4');
insert into agent(name, gender, birth_date, phone, address, yr_exp, branch_office_id) values('Pamela Clark','F','1979-02-23','888-959-9461','1200 Johnson Ferry Rd Suite 210, Marietta, GA','16','4');

insert into partner(name, expertise, phone, yr_exp) values('A total plumbing','Plumber','770-599-5144','19');
insert into partner(name, expertise, phone, yr_exp) values('Accent Roofing Service','Roofing','770-824-1133','30');
insert into partner(name, expertise, phone, yr_exp) values('Amazon Cleaning','Clean','770-690-2950','14');
insert into partner(name, expertise, phone, yr_exp) values('Dr.Roof','Roofing','779-691-8706','3');
insert into partner(name, expertise, phone, yr_exp) values('Happy Clean Atlanta','Clean','770-933-4103','4');
insert into partner(name, expertise, phone, yr_exp) values('Mr. Plumber Atlan','Plumber','770-980-6212','54');
insert into partner(name, expertise, phone, yr_exp) values('Mr.Rooster Plumbing of Atlanta','Plumber','404-879-2105','14');
insert into partner(name, expertise, phone, yr_exp) values('New American Funding','Mortgage','855-293-3880','10');
insert into partner(name, expertise, phone, yr_exp) values('Post Creek Mortgate','Mortgage','678-631-3217','15');
insert into partner(name, expertise, phone, yr_exp) values('Quick Loans','Mortgage','833-207-0820','15');
insert into partner(name, expertise, phone, yr_exp) values('Sonias Clean Aweep','Clean','404-419-8814','10');
insert into partner(name, expertise, phone, yr_exp) values('Srellar Mortgage','Mortgage','678-539-8100','10');
insert into partner(name, expertise, phone, yr_exp) values('Team Roofing','Roofing','866-668-8831','14');
insert into partner(name, expertise, phone, yr_exp) values('Paris Pressley ','Inspector','404-755-9556','15');
insert into partner(name, expertise, phone, yr_exp) values('Southen Home Inspection Services','Inspector','678-279-5796','10');
insert into partner(name, expertise, phone, yr_exp) values('Keystome Property Inspections','Inspector','404-663-5955','15');

insert into corporate(agent_id, partner_id) values ('1','1');
insert into corporate(agent_id, partner_id) values ('1','2');
insert into corporate(agent_id, partner_id) values ('1','8');
insert into corporate(agent_id, partner_id) values ('2','3');
insert into corporate(agent_id, partner_id) values ('2','4');
insert into corporate(agent_id, partner_id) values ('2','6');
insert into corporate(agent_id, partner_id) values ('2','8');
insert into corporate(agent_id, partner_id) values ('3','6');
insert into corporate(agent_id, partner_id) values ('3','10');
insert into corporate(agent_id, partner_id) values ('3','11');
insert into corporate(agent_id, partner_id) values ('4','2');
insert into corporate(agent_id, partner_id) values ('4','4');
insert into corporate(agent_id, partner_id) values ('4','9');
insert into corporate(agent_id, partner_id) values ('5','9');
insert into corporate(agent_id, partner_id) values ('5','10');
insert into corporate(agent_id, partner_id) values ('6','5');
insert into corporate(agent_id, partner_id) values ('6','9');
insert into corporate(agent_id, partner_id) values ('6','10');
insert into corporate(agent_id, partner_id) values ('6','11');
insert into corporate(agent_id, partner_id) values ('6','14');
insert into corporate(agent_id, partner_id) values ('7','8');
insert into corporate(agent_id, partner_id) values ('7','14');
insert into corporate(agent_id, partner_id) values ('8','8');
insert into corporate(agent_id, partner_id) values ('8','9');
insert into corporate(agent_id, partner_id) values ('8','15');
insert into corporate(agent_id, partner_id) values ('8','16');
insert into corporate(agent_id, partner_id) values ('9','16');
insert into corporate(agent_id, partner_id) values ('10','14');
insert into corporate(agent_id, partner_id) values ('10','16');
insert into corporate(agent_id, partner_id) values ('11','9');
insert into corporate(agent_id, partner_id) values ('12','4');
insert into corporate(agent_id, partner_id) values ('12','9');
insert into corporate(agent_id, partner_id) values ('12','10');
insert into corporate(agent_id, partner_id) values ('13','10');
insert into corporate(agent_id, partner_id) values ('14','9');
insert into corporate(agent_id, partner_id) values ('14','10');
insert into corporate(agent_id, partner_id) values ('14','15');
insert into corporate(agent_id, partner_id) values ('15','8');
insert into corporate(agent_id, partner_id) values ('15','14');

insert into customer(name, marital_status, phone, email, agent_id) values('Yuting Zhang','No','404-111-1111','yutingzhang@gmail.com','10');
insert into customer(name, marital_status, phone, email, agent_id) values('Jianjun Guo','No','404-222-2222','jianjunguo@gmail.com','3');
insert into customer(name, marital_status, phone, email, agent_id) values('Haijing Zhang','Yes','404-333-3333','haijingZhang@gmail.com','12');
insert into customer(name, marital_status, phone, email, agent_id) values('Jasmine Chang','Yes','678-665-3317','jasmine.chang@yahoo.com','1');
insert into customer(name, marital_status, phone, email, agent_id) values('Claudia Huff','Yes','770-393-3200','claudia.huff@yahoo.com','6');
insert into customer(name, marital_status, phone, email, agent_id) values('Theresa Abak','No','770-218-2624','Theresa.Abak@gmail.com','7');
insert into customer(name, marital_status, phone, email, agent_id) values('Michele White','Yes','404-796-7758','Michele.White@yahoo.com','4');
insert into customer(name, marital_status, phone, email, agent_id) values('Mike Lee','Yes','770-993-4663','Mike.Lee@yahoo.com','5');
insert into customer(name, marital_status, phone, email, agent_id) values('Dewey Harris','Yes','770-955-0555','Dewey.Harris@yahoo.com','2');
insert into customer(name, marital_status, phone, email, agent_id) values('Cindy Park','No','888-959-9461','Cindy.Park@gmail.com','2');
insert into customer(name, marital_status, phone, email, agent_id) values('Parth Patel','Yes','770-790-4222','Parth.Patel@gmail.com','2');
insert into customer(name, marital_status, phone, email, agent_id) values('Francis Johnson','Yes','404-330-6070','Francis.Johnson@gmail.com','8');
insert into customer(name, marital_status, phone, email, agent_id) values('Jimmy Wang','Yes','404-330-6204','Jimmy.Wang@yahoo.com','13');
insert into customer(name, marital_status, phone, email, agent_id) values('Amy Ford','No','404-330-6240','Amy.Ford@yahoo.com','14');
insert into customer(name, marital_status, phone, email, agent_id) values('Justin Landis','Yes','404-817-6702','Justin.Landis@yahoo.com','2');
insert into customer(name, marital_status, phone, email, agent_id) values('Eric Becraft','No','404-546-0311','Eric.Becraft@gmail.com','15');
insert into customer(name, marital_status, phone, email, agent_id) values('Linda Smith','Yes','404-260-7953','linda.Smith@gmail.com','11');
insert into customer(name, marital_status, phone, email, agent_id) values('Barbara Jones','No','866-646-1349','Barbara.Jones@gmail.com','3');
insert into customer(name, marital_status, phone, email, agent_id) values('Ramesh Shah','Yes','678-584-0792','Ramesh.Shah@gmail.com','9');
insert into customer(name, marital_status, phone, email, agent_id) values('Susan Yao','Yes','775-622-8272','Susan.Yao@gmail.com','2');

insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Montgomery','7','Chamblee','7','Chamblee Charter','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Pleasantdale','5','Henderson','5','Lakeside','5');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Lake Forest','5','Ridgeview Charter','4','Riverwood International Charter','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Barnwell','8','Autrey Mill','9','Johns Creek ','8');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Barnwell','8','Hayness Bridge Middle school','5','Centennial','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('State Bridge Corssing ','9','Autrey Mill','9','Johns Creek','8');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Abbotts Hill','7','Taylor Road','9','Chattahoochee','9');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('State Bridge Corssing ','9','Autrey Mill','9','Johns Creek','8');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Medlock Bridge','8','Autrey Mill','9','Johns Creek','8');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Browns Mill','4','Salem','3','Martin Luther King-Jr.','3');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Evansdale ','5','Henderson','5','Lakeside','5');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Huntley Hills','5','Chamblee','7','Chamblee Charter','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Morningside','8','Inman','6','Midtown','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Dunwoody Springs','6','Sandy Springs','6','North Springs','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Chattahoochee','7','Coleman','8','Duluth','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Brumby','4','East Cobb','6','Wheeler ','7');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Heards Ferry','8','Ridgeview Charter','4','Riverwood International Charter','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Briar Vista','6','Druid Hills','5','Druid Hills','5');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Findley Oaks','8','Taylor Road','9','Chattahoochee','9');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Sagamore Hills','6','Henderson','5','Lakeside','5');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Teasley','6','Campbell Middle','5','Champbell High','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Fernbank','6','Druid Hills','5','Druid Hills','5');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Nickajack','6','Campbell Middle','5','Champbell High','6');
insert into school(elementary, e_rating, middle_school, m_rating,high_school,h_rating) values('Woodlan','8','Sandy Springs','6','North Springs','6');


insert into community(name, hoafee, facility,school_id) values('Villa Sonoma','668','Swim/Tennis','1');
insert into community(name, hoafee, facility,school_id) values('Henderson Reserve','300','Gated, Near shopping, near public transport','2');
insert into community(name, hoafee, facility,school_id) values('Hammond Heights','292','Near school, near shopping. ','3');
insert into community(name, hoafee, facility,school_id) values('River Glen','92','Clubhouse, Lake, Near Shopping, Playground, Tennis','4');
insert into community(name, hoafee, facility,school_id) values('RiverMont','35','Clubhouse, Playground, pool, swim team','5');
insert into community(name, hoafee, facility,school_id) values('Doublegate','10','Playground, pool, Tennis','6');
insert into community(name, hoafee, facility,school_id) values('Estates at Wellington','60','Playground, pool, Tennis','7');
insert into community(name, hoafee, facility,school_id) values('Kingston Crossing','55','Playground, pool, Tennis','8');
insert into community(name, hoafee, facility,school_id) values('Ammersee Lakes','350','Gated, Playground, pool, tennis','9');
insert into community(name, hoafee, facility,school_id) values('Glencroft','0','None','10');
insert into community(name, hoafee, facility,school_id) values('Wembley Ridge','0','None','11');
insert into community(name, hoafee, facility,school_id) values('Heritage Lofts','20','Gated, Near shopping','12');
insert into community(name, hoafee, facility,school_id) values('Morningside Towns','285','Pool','13');
insert into community(name, hoafee, facility,school_id) values('Masons Creek','325','swimming, tennis','14');
insert into community(name, hoafee, facility,school_id) values('Dunwoody','0','None','14');
insert into community(name, hoafee, facility,school_id) values('Overlook','61','Playground, pool, shopping','15');
insert into community(name, hoafee, facility,school_id) values('Bridlewood','43','Clubhouse, near shopping, Pool, Tennis','15');
insert into community(name, hoafee, facility,school_id) values('Carriage Gate','0','None','15');
insert into community(name, hoafee, facility,school_id) values('The Chattahoochee Bluffs','315','Pool, Park','16');
insert into community(name, hoafee, facility,school_id) values('One River Place','294','Fitness Center, Dog Park, Clubhouse, Pool','17');
insert into community(name, hoafee, facility,school_id) values('Town at Breton Ridge','310','Pool','16');
insert into community(name, hoafee, facility,school_id) values('Bristol at Briarcliff','25','Gated, Near shopping','18');
insert into community(name, hoafee, facility,school_id) values('Wellington','67','Playground, pool, tennis, sidewalk','19');
insert into community(name, hoafee, facility,school_id) values('The Glen at Olde Towne','63','Near school, near shopping, sidewalk','15');
insert into community(name, hoafee, facility,school_id) values('Royal Oaks','0','Near Shopping','20');
insert into community(name, hoafee, facility,school_id) values('Vinings Overlook','210','swimming, tennis','21');
insert into community(name, hoafee, facility,school_id) values('Druid Hills','0','Near public transporation','22');
insert into community(name, hoafee, facility,school_id) values('Olde Ivy','409','Clubhouse, Dog Park, Pool, Tennis Court','23');
insert into community(name, hoafee, facility,school_id) values('Serrano','402','Fitness Center, Spa/Hot Tub','24');
insert into community(name, hoafee, facility,school_id) values('The Granville','347','Fitness Center, Clubhouse, Pool','24');


insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('10 Perimeter Summit Blvd #4339, Brookhaven, GA 30319 ','Fulton','Condo','249000','Closed','5','1079','2','2','1778','1');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('3433 Henderson Reserve, Chamblee, GA 30341','DeKalb','Townhouse','339000','Closed','8','1742','3','2.5','3534','2');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('274 Le Gran Bnd, Sandy Springs, GA 30328','Fulton','Condo','380000','Active','2','1648','2','2.5','4146','3');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('8835 Glen Ferry Dr,John Creek, GA','Fulton','Single House','660000','Closed','3','5632','3','5','5787','4');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('8480 Colony Club Dr, Johns Creek, GA','Fulton','single house','425000 ','Closed','5','1613','4','3','3146','5');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('445 Chantenay Pl, John Creek, GA','Fulton','single house','650000 ','Closed','6','3250','5','4','4382','6');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('120 Wyndlam Ct, John Creek, GA','Fulton','single house','670000 ','Closed','5','3229','4','5','5376','7');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('9585 Fenbrook,John Creek,GA','Fulton','single house','625000 ','Active',2,'3868','5','4','4382','8');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('9340 Saint Georgen Cmn, Duluth, GA','Fulton','single house','526000 ','Closed','5','3114','4','5','5702','9');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('5300 Winding Glen Dr, Lithonia, GA 30038','Dekalb','single house','329000 ','Closed','4','2766','4','3','2432','10');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('3064 Wembley Rdg, Atlanta, GA 30340','Dekalb','single house','390000 ','Active',2,'2542','4','3','4120','11');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('5434 Peachtree Rd SUITE 106, Atlanta, GA 30341','Dekalb','Condo','339900 ','Closed','3','1122','2','2','5000' ,'12');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('512 Morningtide Way NE, Atlanta, GA 30324','Fulton','Townhouse','629900','Active',2,'1600','4','3.5','5807','13');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('1768 Morningtide Ln NE, Atlanta, GA 30324','Fulton','Townhouse','595000','Closed','3','1600','3','3.5','6305','13');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('606 Masons Creek Cir, Atlanta, GA 30350','Fulton','Townhouse','305000','Active',8,'1362','2','2.5','1910','14');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('8871 Roberts, Atlanta, GA 30350','Fulton','Townhouse','245000','Closed','2','1240','3','2','863','15');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2594 Niblick Way, Duluth, GA 30097','Gwinnett','Single House','448500','Active',2,'2721','4','2.5','934','16');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2950 Risen Star Ct, Duluth, GA 30096','Gwinnett','Single House','410000','Closed','3','2043','3','2','592','17');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2701 Old Coach Rd, Duluth, GA 30096','Gwinnett','Single House','436000','Closed','2','2096','3','1.5','3405','18');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('3833 Chattahoochee Summit Dr SE #6, Atlanta, GA 30339','Cobb','Townhouse','505000','Active',6,'2511','4','3.5','3807','19');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('706 Creekgarden Ct, Atlanta, GA 30339','Fulton','Townhouse','745000','Closed','3','3182','3','3.5','6967','20');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('3746 Chattahoochee Summit Dr SE, Atlanta, GA 30339','Cobb','Townhouse','345000','Closed','10','1792','3','2.5','3688','19');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2290 Willington Shoals Pl SE, Smyrna, GA 30080','Cobb','Townhouse','560000','Closed','6','3149','4','3.5','5248','21');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2641 Portbury Pl, Atlanta, GA 30329','Dekalb','Condo','495000','Active',8 ,'2641','3','4','5167','22');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('11280 Crossington Rd, Alpharetta, GA 30005','Fulton','Single House','499000','Closed','12','2558','4','2.5','3301','23');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('11300 Crossington Rd, Alpharetta, GA 30005','Fulton','Single House','550000','Closed','12','2896','4','2.5','3745','23');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('115 Fairway Ridge Dr, Alpharetta, GA 30022','Fulton','Single House','565000','Closed','10','3137','4','2.5','3740','5');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('4180 Glen Vista Ct, Duluth, GA 30097','Gwinnett','Single House','400000','Closed','4','2524','4','2.5','1030','24');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2842 Briarcliff Rd, Atlanta, GA 30329','Dekalb','Condo','499900','Active',4,'2070','4','3','4192','25');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('3428 Triview Sq, Atlanta, GA 30339','Cobb','Townhouse','449000','Closed','5','2328','3','3.5','4527','26');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('2786 Loftview Sq, Atlanta, GA 30339','Cobb','Townhouse','430000','Closed','6','2328','4','2.5','4544','26');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('1269 Briarcliff Rd, Atlanta, GA 30306','Dekalb','Single House','599000 ','Closed','2','1441','3','2','5154','27');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('4850 Ivy Ridge Dr, Atlanta, GA 30339','Cobb','Condo','375000','Closed','2','1496','2','2.5',9000,'28');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('4810 Ivy Ridge Dr, Atlanta, GA 30339','Cobb','Condo','390000','Closed','3','2122','2','2','6666','28');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('1706 Dyson Dr NE, Atlanta, GA 30307','Dekalb','Single House','475000 ','Active',8,'1399','3','2','4909','27');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('8523 Colony Club Dr, Johns Creek, GA 30022','Fulton','Single House','389900','Closed','5','1680','4','3','3100','5');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('901 Abernathy Rd #1260, Sandy Springs, GA 30328','Fulton','Condo','289900','Closed','2','1002','2','2','3087','29');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('633 Granville Ct, Sandy Springs, GA 30328','Fulton','Condo','249000','Closed','4','1032','2','2','2135','30');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('3732 Chattahoochee Summit Dr SE #20, Atlanta, GA 30339','Cobb','Single House','450000 ','Closed','5','1575','3','3.5','3344','19');
insert into house(address, county, type, list_price, status, offers, sqft, num_of_bed, num_of_bath,tax,community_id)values('5300 Peachtree Rd #3312, Atlanta, GA 30341','DeKalb','Condo','300000','Closed','3','1223','2','2','4273','12');

insert into sale_contract(date, sold_price, payment_method) values ('2021-07-08','395000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2021-10-28','580000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2021-11-15','575000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2021-12-17','550500','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2021-12-20','444000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-01-06','740000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-01-12','245000','Cash');
insert into sale_contract(date, sold_price, payment_method) values ('2022-02-04','461000','Cash');
insert into sale_contract(date, sold_price, payment_method) values ('2022-02-11','350000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-02','275000','Cash');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-03','415000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-03','289900','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-07','650000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-09','249000','Cash');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-10','425000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-10','425000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-21','375000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-03-25','649000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-04-08','325000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-04-18','585000','Loan');
insert into sale_contract(date, sold_price, payment_method) values ('2022-04-18','385000','Loan');


insert into purchase_contract(date, price, mortgage_company) values ('2022-01-10','670000','Quick Loans');
insert into purchase_contract(date, price, mortgage_company) values ('2022-01-30','526000','New American Funding');
insert into purchase_contract(date, price, mortgage_company) values ('2022-02-01','329000','Quick Loans');
insert into purchase_contract(date, price, mortgage_company) values ('2022-02-15','360000','New American Funding');
insert into purchase_contract(date, price, mortgage_company) values ('2022-02-27','580000','Post Creek Mortgate');
insert into purchase_contract(date, price, mortgage_company) values ('2022-02-15','650000','New American Funding');
insert into purchase_contract(date, price, mortgage_company) values ('2022-03-05','378000','New American Funding');
insert into purchase_contract(date, price, mortgage_company) values ('2022-03-14','445000','New American Funding');
insert into purchase_contract(date, price, mortgage_company) values ('2021-12-17','450000','Post Creek Mortgate');

insert into sell(house_id, sale_contract_id) values ('34','1');
insert into sell(house_id, sale_contract_id) values ('27','2');
insert into sell(house_id, sale_contract_id) values ('23','3');
insert into sell(house_id, sale_contract_id) values ('25','4');
insert into sell(house_id, sale_contract_id) values ('31','5');
insert into sell(house_id, sale_contract_id) values ('21','6');
insert into sell(house_id, sale_contract_id) values ('16','7');
insert into sell(house_id, sale_contract_id) values ('30','8');
insert into sell(house_id, sale_contract_id) values ('2','9');
insert into sell(house_id, sale_contract_id) values ('38','10');
insert into sell(house_id, sale_contract_id) values ('18','11');
insert into sell(house_id, sale_contract_id) values ('37','12');
insert into sell(house_id, sale_contract_id) values ('26','13');
insert into sell(house_id, sale_contract_id) values ('1','14');
insert into sell(house_id, sale_contract_id) values ('5','15');
insert into sell(house_id, sale_contract_id) values ('19','16');
insert into sell(house_id, sale_contract_id) values ('33','17');
insert into sell(house_id, sale_contract_id) values ('4','18');
insert into sell(house_id, sale_contract_id) values ('40','19');
insert into sell(house_id, sale_contract_id) values ('14','20');
insert into sell(house_id, sale_contract_id) values ('22','21');

insert into buy(house_id, purchase_contract_id) values('7','1');
insert into buy(house_id, purchase_contract_id) values('9','2');
insert into buy(house_id, purchase_contract_id) values('10','3');
insert into buy(house_id, purchase_contract_id) values('12','4');
insert into buy(house_id, purchase_contract_id) values('32','5');
insert into buy(house_id, purchase_contract_id) values('6','6');
insert into buy(house_id, purchase_contract_id) values('36','7');
insert into buy(house_id, purchase_contract_id) values('39','8');
insert into buy(house_id, purchase_contract_id) values('28','9');
















