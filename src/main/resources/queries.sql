use RealtorCompany;

##1 Lsting the information about the Agents and their cooperating partnership in a Branch office (*1)
Select A.Aid, A.AName, P.Pid, P.PName
From Agent A, Partner P, Corporate C
Where A.BNO = 1 and A.Aid = C.Aid and P.Pid = C.Pid;


##2 Searching for *inspectors(or other expertises) who can supply the qualified service.
Select Pid, PName, Expertise, PPhone, YrExp
From Partner
Where Expertise = 'Inspector' ;


##3 Listing houses zoned for the schools whose ratings are higher than *(7) in a particular county.
Select H.HNO, C.CommName, Elementary, ERating, MiddleSchl, MRating, HighSchl, HRating
From House H, Community C, School S
Where H.County = 'Fulton' and H.CMid = C.CMid and C.SchlID = S. SchlID and ERating > 7 and MRating > 7 and HRating > 7 ;


##4 Searching for *single house or other type of houses in a particular county* with desired bedrooms and bathrooms*.
Select HNO, HAddress, Type, ListPrice, Sqft, NumOfBed, NumOfBath
From House H
Where H.type = 'single house' and County= 'Fulton'and NumOfBed >=3 and NumOfBath >= 2;


##5 Retrieving the house information on the list price and closing price for market analysis
Select H.HNO, ListPrice, SoldPrice From House H, Sell SE, SalesContract SA
Where H.HNO= SE.HNO and SE.SCNO = SA.SCNO
Union
Select H.HNO, ListPrice, PurchasePrice
From House H, Buy B, PurchaseContract P
Where H.HNO = B.HNO and B.PCNO= P.PCNO;


##6 Retrieving the name of mortgage company, and the number of customers it serves.
Select MortgageCompany, Count(*) NumberOfCustomers
From PurchaseContract
Group by MortgageCompany;


##7 Analysizing payment method preference: 
Select PaymentMethod, Count(*) From SalesContract group by PaymentMethod;



##8 Checking the Selling and Purchasing transaction of each Branch office
select T.BNO, T.BName, T.NumOfSale, T2.NumOfPurchase from (select B.BNO, BName, Count(*) NumOfSale from BranchOffice B, Agent A, Customer C, Sell S
Where B.BNO=A.BNO and A.Aid=C.Cid and C.Cid=S.Sid
group by BNO) T, 
(Select B.BNO, BName, Count(*) NumOfPurchase
From BranchOffice B, Agent A, Customer C, Buy 
Where B. BNO= A.BNO and A.Aid = C.Aid and C.Cid = Buy.Bid
Group by BNO) T2
where T.BNO=T2.BNO
order by BNO;

##9 Analyzing the number of offers for different types of houses before the transaction
Select Type, MAX(Offers), MIN(Offers) From House Where Status ='Closed' Group by Type;


##10 Searching for the houses with desired facilties
Select HNO, CommName, HOAfee From House H, Community C Where H.CMid= C.CMid and Facility like '%Pool%';