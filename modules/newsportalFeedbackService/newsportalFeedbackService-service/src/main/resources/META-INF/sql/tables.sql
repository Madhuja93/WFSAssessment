create table FB_Feedback (
	uuid_ VARCHAR(75) null,
	feedbackId LONG not null primary key,
	feedbackDate DATE null,
	feedbackText VARCHAR(75) null,
	feedbackSubject VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG
);