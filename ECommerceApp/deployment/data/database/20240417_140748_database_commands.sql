CREATE SEQUENCE "salesmanager$product__id_mxseq" AS BIGINT START WITH 1;
ALTER TABLE "salesmanager$product" ADD "_id" BIGINT NULL;
UPDATE "salesmanager$product"
 SET "_id" = NEXT VALUE FOR "salesmanager$product__id_mxseq";
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7f455e22-cefe-48b9-a32d-2f71e34fa9f8', 
'b53e8ade-1136-42d6-8b9d-cb549fefc0cb', 
'_Id', 
'_id', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('7f455e22-cefe-48b9-a32d-2f71e34fa9f8', 
'salesmanager$product__id_mxseq', 
1, 
101);
CREATE TABLE "salesmanager$sales" (
	"id" BIGINT NOT NULL,
	"salesid" BIGINT NULL,
	"salesheader" VARCHAR_IGNORECASE(200) NULL,
	"_id" BIGINT NULL,
	PRIMARY KEY("id"));
CREATE SEQUENCE "salesmanager$sales_salesid_mxseq" AS BIGINT START WITH 1;
CREATE SEQUENCE "salesmanager$sales__id_mxseq" AS BIGINT START WITH 1;
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('80ebab5f-2fa3-4bb8-be45-2b2c77433115', 
'SalesManager.Sales', 
'salesmanager$sales', 
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
 VALUES ('b467d5dd-7d5a-482e-be89-d19de80e2d41', 
'80ebab5f-2fa3-4bb8-be45-2b2c77433115', 
'SalesId', 
'salesid', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('b467d5dd-7d5a-482e-be89-d19de80e2d41', 
'salesmanager$sales_salesid_mxseq', 
1, 
0);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('298f8f02-24ea-4bdb-a25d-e34711dc110c', 
'80ebab5f-2fa3-4bb8-be45-2b2c77433115', 
'SalesHeader', 
'salesheader', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('15025e1e-eafa-4efe-a436-6e517172c3ca', 
'80ebab5f-2fa3-4bb8-be45-2b2c77433115', 
'_Id', 
'_id', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('15025e1e-eafa-4efe-a436-6e517172c3ca', 
'salesmanager$sales__id_mxseq', 
1, 
0);
CREATE TABLE "salesmanager$sales_product" (
	"salesmanager$salesid" BIGINT NOT NULL,
	"salesmanager$productid" BIGINT NOT NULL,
	PRIMARY KEY("salesmanager$salesid","salesmanager$productid"),
	CONSTRAINT "uniq_salesmanager$sales_product_salesmanager$salesid" UNIQUE ("salesmanager$salesid"));
CREATE INDEX "idx_salesmanager$sales_product_salesmanager$product_salesmanager$sales" ON "salesmanager$sales_product" ("salesmanager$productid" ASC,"salesmanager$salesid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('26ba07a2-2109-4032-b5db-365c2314f351', 
'SalesManager.Sales_Product', 
'salesmanager$sales_product', 
'80ebab5f-2fa3-4bb8-be45-2b2c77433115', 
'b53e8ade-1136-42d6-8b9d-cb549fefc0cb', 
'salesmanager$salesid', 
'salesmanager$productid', 
'idx_salesmanager$sales_product_salesmanager$product_salesmanager$sales');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_salesmanager$sales_product_salesmanager$salesid', 
'26ba07a2-2109-4032-b5db-365c2314f351', 
'f73ce61e-1f78-3cab-bfdc-a6fc6e60562b');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20240417 14:07:48';
