-- LT_HeartRateテーブルの作成
CREATE TABLE "LT_HeartRate" (
    "id" VARCHAR(50) NOT NULL,
    "password" VARCHAR(50) NOT NULL,
    "birthday" DATE,
    "username" VARCHAR(50) NOT NULL,
    "maxHeartRate" INTEGER,
    "heartRate53" INTEGER,
    "LTHeartRate" INTEGER,
    "CURRENT DATE" DATE,
    "groupName" VARCHAR(50),
    "groupPW" VARCHAR(50),
    PRIMARY KEY ("id", "groupName"),
     UNIQUE ("groupName") 
);

-- Studentテーブルの作成
CREATE TABLE "student" (
    "id" VARCHAR(50) PRIMARY KEY NOT NULL,
    "username" VARCHAR(50),
    "LTHeartRate" INTEGER,
    "CURRENT DATE" DATE,
    "groupName" VARCHAR(50),
    FOREIGN KEY ("groupName") REFERENCES "LT_HeartRate" ("groupName")
);

-- Supervisorsテーブルの作成
CREATE TABLE "supervisors" (
    "id" VARCHAR(50) PRIMARY KEY NOT NULL,
    "groupName" VARCHAR(50),
    "groupPW" VARCHAR(50),
    FOREIGN KEY ("groupName") REFERENCES "LT_HeartRate" ("groupName")
);

-- StudentとSupervisorsの関係テーブル
CREATE TABLE "student_supervisor_relations" (
    "groupName" VARCHAR(50),
    "student_id" VARCHAR(50),
    "supervisors_id" VARCHAR(50),
    FOREIGN KEY ("groupName") REFERENCES "LT_HeartRate" ("groupName"),
    FOREIGN KEY ("student_id") REFERENCES "student" ("id"),
    FOREIGN KEY ("supervisors_id") REFERENCES "supervisors" ("id")
);
