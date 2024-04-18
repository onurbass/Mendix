ALTER TABLE "salesmanager$product" DROP COLUMN "productid";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '8e6160e6-c00b-43e6-99e3-5dff6d3c0490';
ALTER TABLE "salesmanager$productcategory" DROP COLUMN "categoryid";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '79eaefdc-ef45-431f-9e3a-2c36bcf93d9b';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20240418 13:59:49';
