ALTER TABLE "system$image" ADD "submetaobjectname" VARCHAR_IGNORECASE(255) NULL;
UPDATE "system$image"
 SET "submetaobjectname" = 'System.Image';
CREATE INDEX "idx_system$image_submetaobjectname_asc" ON "system$image" ("submetaobjectname" ASC,"id" ASC);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('272f49fe-6a64-3ede-a32d-344a34e57b9f', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'submetaobjectname', 
'submetaobjectname', 
30, 
255, 
'System.Image', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'idx_system$image_submetaobjectname_asc');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'272f49fe-6a64-3ede-a32d-344a34e57b9f', 
false, 
0);
CREATE TABLE "administration$profileimage" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('81d9b45a-fa51-4398-aa7d-22ddf6438686', 
'Administration.ProfileImage', 
'administration$profileimage', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
false, 
false);
CREATE TABLE "administration$account_profileimage" (
	"administration$accountid" BIGINT NOT NULL,
	"administration$profileimageid" BIGINT NOT NULL,
	PRIMARY KEY("administration$accountid","administration$profileimageid"),
	CONSTRAINT "uniq_administration$account_profileimage_administration$profileimageid" UNIQUE ("administration$profileimageid"),
	CONSTRAINT "uniq_administration$account_profileimage_administration$accountid" UNIQUE ("administration$accountid"));
CREATE INDEX "idx_administration$account_profileimage_administration$profileimage_administration$account" ON "administration$account_profileimage" ("administration$profileimageid" ASC,"administration$accountid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('9ae4befb-5ed3-4c53-9e34-570cdbcbaa6b', 
'Administration.Account_ProfileImage', 
'administration$account_profileimage', 
'3078a23e-13b2-4a9b-84e4-2881fdee53c6', 
'81d9b45a-fa51-4398-aa7d-22ddf6438686', 
'administration$accountid', 
'administration$profileimageid', 
'idx_administration$account_profileimage_administration$profileimage_administration$account');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_administration$account_profileimage_administration$profileimageid', 
'9ae4befb-5ed3-4c53-9e34-570cdbcbaa6b', 
'021bf686-ba09-3c83-891a-f0fac755b435');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_administration$account_profileimage_administration$accountid', 
'9ae4befb-5ed3-4c53-9e34-570cdbcbaa6b', 
'd480d5ac-3486-35cd-9450-c53abf185a1e');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20240417 01:05:43';
