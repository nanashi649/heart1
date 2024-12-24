INSERT INTO "LT_HeartRate" (
    "id", "username", "password", "LTHeartRate", "CURRENT DATE",
    "groupPW", "groupName"
) VALUES (
    '101', 'student_A', 'password', 135, '2023-10-01',
    'PW', '〇〇中学校△△部'
);


 INSERT INTO "supervisors"(
 			"id", "groupName", "groupPW") 
 			VALUES (
			'1', '〇〇中学校△△部', 'password123');
            
            
            
INSERT INTO "student"( 
			"id", "username", "LTHeartRate","CURRENT DATE",
			"groupName")
			 VALUES (
			'101', 'student_A', 135, '2023-10-01', '〇〇中学校△△部');
