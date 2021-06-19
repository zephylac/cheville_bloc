drop table if exists bloc;
drop table if exists color;
drop table if exists type;
drop table if exists score;
drop table if exists bloc_user;
drop table if exists score_bloc;
drop table if exists user;
drop table if exists user_roles;
drop table if exists role;

CREATE TABLE "bloc" (
  "id" SERIAL PRIMARY KEY,
  "file_url" varchar,
  "date_start" timestamp,
  "date_end" timestamp,
  "sector" int,
  "color_id" int,
  "type_id" int,
  "user_id" int,
  "blocUserEntity" int
);

CREATE TABLE "color" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "difficulty" int
);

CREATE TABLE "type" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "description" varchar
);

CREATE TABLE "score" (
  "id" SERIAL PRIMARY KEY,
  "score" int,
  "top_number" int
);

CREATE TABLE "bloc_user" (
  "id" SERIAL PRIMARY KEY,
  "user_id" varchar,
  "bloc_id" varchar,
  "date_achieved" timestamp,
  "favorite" boolean,
  "work_in_progress" boolean,
  "comment" varchar
);

CREATE TABLE "score_bloc" (
  "id" SERIAL PRIMARY KEY,
  "score_id" varchar,
  "bloc_id" varchar
);

CREATE TABLE "user" (
  "id" SERIAL PRIMARY KEY,
  "login" varchar,
  "name" varchar,
  "surname" varchar,
  "mail" varchar,
  "pwd" varchar,
  "enabled" boolean,
  "blocUserEntity" int
);

CREATE TABLE "user_roles" (
  "id" SERIAL PRIMARY KEY,
  "user_id" varchar,
  "role_id" varchar
);

CREATE TABLE "role" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar
);

ALTER TABLE "bloc" ADD FOREIGN KEY ("color_id") REFERENCES "color" ("id");

ALTER TABLE "bloc" ADD FOREIGN KEY ("type_id") REFERENCES "type" ("id");

ALTER TABLE "bloc" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user" ADD FOREIGN KEY ("id") REFERENCES "bloc" ("blocUserEntity");

ALTER TABLE "bloc_user" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "bloc_user" ADD FOREIGN KEY ("bloc_id") REFERENCES "bloc" ("id");

ALTER TABLE "score_bloc" ADD FOREIGN KEY ("score_id") REFERENCES "score" ("id");

ALTER TABLE "score_bloc" ADD FOREIGN KEY ("bloc_id") REFERENCES "bloc" ("id");

ALTER TABLE "bloc" ADD FOREIGN KEY ("id") REFERENCES "user" ("blocUserEntity");

ALTER TABLE "user_roles" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user_roles" ADD FOREIGN KEY ("role_id") REFERENCES "role" ("id");

