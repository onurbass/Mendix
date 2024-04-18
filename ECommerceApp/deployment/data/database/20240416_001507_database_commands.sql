ALTER TABLE "administration$account" ADD "birthdate" TIMESTAMP NULL;
ALTER TABLE "administration$account" ADD "surname" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "administration$account" ADD "firstname" VARCHAR_IGNORECASE(200) NULL;
ALTER TABLE "administration$account" ADD "gender" VARCHAR_IGNORECASE(6) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('bbaf2f58-5d50-43f6-9dca-66b16400aec6', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'BirthDate', 
'birthdate', 
20, 
0, 
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
 VALUES ('a446d560-7291-4fe2-b242-b83bcbc14439', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'Gender', 
'gender', 
40, 
6, 
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
 VALUES ('97a082eb-0a4d-4b83-8efb-17ec56ecf93c', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'Surname', 
'surname', 
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
 VALUES ('9b2527d7-1b65-42c8-86cf-ced94b957a1b', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'FirstName', 
'firstname', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20240416 00:15:07';
