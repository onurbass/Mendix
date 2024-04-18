CREATE SEQUENCE "salesmanager$productcategory__id_mxseq" AS BIGINT START WITH 1;
ALTER TABLE "salesmanager$productcategory" ADD "_id" BIGINT NULL;
UPDATE "salesmanager$productcategory"
 SET "_id" = NEXT VALUE FOR "salesmanager$productcategory__id_mxseq";
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('11be2f6c-134a-4394-9e84-e9872f5bd536', 
'df83f180-0070-452d-b419-ed70cc731899', 
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
 VALUES ('11be2f6c-134a-4394-9e84-e9872f5bd536', 
'salesmanager$productcategory__id_mxseq', 
1, 
5);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20240418 13:56:54';
