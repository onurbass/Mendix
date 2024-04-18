CREATE TABLE "salesmanager$product_productcategory" (
	"salesmanager$productid" BIGINT NOT NULL,
	"salesmanager$productcategoryid" BIGINT NOT NULL,
	PRIMARY KEY("salesmanager$productid","salesmanager$productcategoryid"),
	CONSTRAINT "uniq_salesmanager$product_productcategory_salesmanager$productid" UNIQUE ("salesmanager$productid"));
CREATE INDEX "idx_salesmanager$product_productcategory_salesmanager$productcategory_salesmanager$product" ON "salesmanager$product_productcategory" ("salesmanager$productcategoryid" ASC,"salesmanager$productid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f9ab13c5-9ce2-428c-80df-cb0c868af303', 
'SalesManager.Product_ProductCategory', 
'salesmanager$product_productcategory', 
'b53e8ade-1136-42d6-8b9d-cb549fefc0cb', 
'df83f180-0070-452d-b419-ed70cc731899', 
'salesmanager$productid', 
'salesmanager$productcategoryid', 
'idx_salesmanager$product_productcategory_salesmanager$productcategory_salesmanager$product');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_salesmanager$product_productcategory_salesmanager$productid', 
'f9ab13c5-9ce2-428c-80df-cb0c868af303', 
'0dfab395-9aa1-3c1b-a471-409354c9119f');
CREATE TABLE "salesmanager$productcategory" (
	"id" BIGINT NOT NULL,
	"categoryid" INT NULL,
	"categoryname" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('df83f180-0070-452d-b419-ed70cc731899', 
'SalesManager.ProductCategory', 
'salesmanager$productcategory', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('79eaefdc-ef45-431f-9e3a-2c36bcf93d9b', 
'df83f180-0070-452d-b419-ed70cc731899', 
'CategoryId', 
'categoryid', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('65174502-c603-46df-a21a-999f9192f02e', 
'df83f180-0070-452d-b419-ed70cc731899', 
'CategoryName', 
'categoryname', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20240418 13:49:14';
