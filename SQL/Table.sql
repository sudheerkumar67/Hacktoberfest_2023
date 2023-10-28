-- Create a table to track top programming languages, user usage, and companies
CREATE TABLE IF NOT EXISTS ProgrammingLanguages (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    LanguageName VARCHAR(50) NOT NULL,
    UserUsage INT,
    CompaniesUsed VARCHAR(100)
);

-- Insert data into the ProgrammingLanguages table
INSERT INTO ProgrammingLanguages (LanguageName, UserUsage, CompaniesUsed)
VALUES
    ('JavaScript', 12000000, 'Google, Facebook, Microsoft'),
    ('Python', 10000000, 'Amazon, Dropbox, Instagram'),
    ('Java', 9000000, 'Oracle, IBM, SAP'),
    ('C#', 7000000, 'Microsoft, Amazon, Intel'),
    ('PHP', 6000000, 'Facebook, WordPress, Yahoo'),
    -- Add more languages and data here
    ('Ruby', 3000000, 'GitHub, Airbnb, Shopify'),
    ('Swift', 2500000, 'Apple, Uber, Slack'),
    ('Go', 2000000, 'Google, Uber, Dropbox'),
    -- Add more languages and data here
    ('Rust', 1500000, 'Mozilla, Microsoft, Discord'),
    ('Svelte', 60,582, 'Firmenich, yahoo, content square')
    ('TypeScript', 1400000, 'Microsoft, Slack, Asana');
    -- Add more languages and data here
    ('Perl', 1,000,000, 'Venmo, TicketMaster, Zoopla'),
