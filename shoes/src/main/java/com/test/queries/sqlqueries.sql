create table xmapproductsuppliers
(
psid char(20)primary key,
productid char() references products(productid)
supplierid char(255) references suppliers(supplierid)
productsupplierprice int,
productsupplierstock int,
isproductavailable boolean
)



SELECT * FROM PRODUCTS;
SELECT * FROM SUPPLIERS;
SELECT * FROM XMAPPRODUCTSUPPLIERS


create view vw_xmap_ps
as
select p.productid,p.productname,ps.psid, s.supplierid,s.suppliername,ps.productsupplierprice, ps.productsupplierstock
from products p join xmapproductsuppliers ps on p.productid=ps.productid join suppliers s on ps.supplierid=s.supplierid
where p.isproductavailable=true and
ps.isproductavailable=true and
s.issupplieravailable=true
